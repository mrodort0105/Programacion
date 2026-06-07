package ejercicio2;

public class LinkedList<T> {

    private Node<T> head; // Primer nodo de la lista (inicio)
    private int size; // Size para los elementos que hay en la lista

    private static class Node<T> { // representa cada nodo de la lista

        T data; // Dato que guarda el nodo (ej: "Ana", "Luis")

        Node<T> next; // Referencia al siguiente nodo

        // Constructor del nodo
        Node(T data) {
            this.data = data; 
        }
    }

    // metodo add
    public void add(T element) {

        // Creamos un nuevo nodo con el elemento
        Node<T> newNode = new Node<>(element);

        // Si la lista esta vacia (no hay primer nodo)
        if (head == null) {
            head = newNode; // el nuevo nodo pasa a ser el primero
        } else {

            // Empezamos desde el primer nodo
            Node<T> actual = head;

            // Recorremos hasta llegar al último nodo
            while (actual.next != null) {
            	actual = actual.next;
            }

            // El último nodo apunta al nuevo nodo
            actual.next = newNode;
        }

        // Aumentamos el tamaño de la lista
        size++;
    }

    // get obtiene el elemento en una posición
    public T get(int index) {

        // Empezamos desde el primer nodo
        Node<T> actual = head;

        // Avanzamos nodo por nodo hasta llegar al indice
        for (int i = 0; i < index; i++) {
        	actual = actual.next;
        }

        // Devolvemos el dato del nodo encontrado
        return actual.data;
    }

    // set: modifica el valor de un nodo en una posición
    public void set(int index, T value) {

        // Empezamos desde el primer nodo
        Node<T> actual = head;

        // Avanzamos hasta la posición 
        for (int i = 0; i < index; i++) {
        	actual = actual.next;
        }

        // Cambiamos el dato del nodo
        actual.data = value;
    }

    // Devuelve el número de elementos de la lista
    public int size() {
        return size;
    }
}