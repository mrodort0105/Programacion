package UD11.ejercicio3;

import java.awt.*;

public class EjemploBorderLayout {

    public static void main(String[] args) {

        Frame ventana = new Frame("BorderLayout");

        ventana.setSize(400, 300);
        ventana.setLayout(new BorderLayout());

        ventana.add(new Button("NORTE"), BorderLayout.NORTH);
        ventana.add(new Button("SUR"), BorderLayout.SOUTH);
        ventana.add(new Button("ESTE"), BorderLayout.EAST);
        ventana.add(new Button("OESTE"), BorderLayout.WEST);
        ventana.add(new Button("CENTRO"), BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}