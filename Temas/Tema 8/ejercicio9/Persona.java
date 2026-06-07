package Tema8.Ejercicios.ejercicio9;

import java.util.Objects;

// implementar comparable para el orden natural
public class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Persona otra) {
        // Ordenar alfabeticamente
        return this.nombre.compareTo(otra.nombre);
    }

    // consistencia
    // Dos personas son iguales si tienen el mismo nombre y apellidos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) &&
                Objects.equals(apellidos, persona.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " (" + edad + ")";
    }

    public String getNombre() {
        return nombre;
    }

}