package UD11.ejercicio3;

import java.awt.*;

public class EjemploGridLayout {

    public static void main(String[] args) {

        Frame ventana = new Frame("GridLayout");

        ventana.setSize(400, 300);

        ventana.setLayout(new GridLayout(2, 3));

        ventana.add(new Button("1"));
        ventana.add(new Button("2"));
        ventana.add(new Button("3"));
        ventana.add(new Button("4"));
        ventana.add(new Button("5"));
        ventana.add(new Button("6"));

        ventana.setVisible(true);
    }
}