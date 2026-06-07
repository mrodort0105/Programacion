package UD11.ejercicio2;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio2 {

    public static void main(String[] args) {

        Frame ventana = new Frame("Ejercicio 2: Componentes");

        ventana.setSize(400, 300);
        ventana.setLayout(null);

        Label etiqueta = new Label("Soy una etiqueta");
        etiqueta.setBounds(50, 50, 100, 30);
        ventana.add(etiqueta);

        Button boton = new Button("Pulsame");
        boton.setBounds(50, 100, 100, 30);
        ventana.add(boton);

        ventana.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ventana.setVisible(true);
    }
}