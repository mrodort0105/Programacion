package UD11.ejercicio3;

import java.awt.*;

public class EjemploFlowLayout {

    public static void main(String[] args) {

        Frame ventana = new Frame("FlowLayout");

        ventana.setSize(400, 300);

        ventana.setLayout(new FlowLayout());

        ventana.add(new Button("Botón 1"));
        ventana.add(new Button("Botón 2"));
        ventana.add(new Button("Botón 3"));
        ventana.add(new Button("Botón 4"));
        ventana.add(new Button("Botón 5"));

        ventana.setVisible(true);
    }
}