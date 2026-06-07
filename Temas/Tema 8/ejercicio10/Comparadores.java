package Tema8.Ejercicios.ejercicio10;

import Tema8.Ejercicios.ejercicio9.Persona;

import java.util.Comparator;

// comparador por edad
class ComparadorEdad implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        return Integer.compare(p1.getEdad(), p2.getEdad());
    }
}

// comparador por apellidos
class ComparadorApellidos implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getApellidos().compareTo(p2.getApellidos());
    }
}

// Apellidos, Nombre y Edad (con nulos al principio)
class ComparadorCombinado implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        // ampliacion apellidos nulos al principio
        if (p1.getApellidos() == null && p2.getApellidos() != null) return -1;
        if (p1.getApellidos() != null && p2.getApellidos() == null) return 1;

        // Si ambos existen o ambos son null, comparamos normal
        int res = 0;
        if (p1.getApellidos() != null && p2.getApellidos() != null) {
            res = p1.getApellidos().compareTo(p2.getApellidos());
        }

        // Si el apellido es igual (res == 0), comparamos por nombre
        if (res == 0) {
            res = p1.getNombre().compareTo(p2.getNombre());
        }

        // Si el nombre también es igual, comparamos por edad
        if (res == 0) {
            res = Integer.compare(p1.getEdad(), p2.getEdad());
        }

        return res;
    }
}