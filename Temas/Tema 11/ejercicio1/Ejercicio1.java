package UD11.ejercicio1;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Crear ventana
        Frame frame = new Frame("Ejemplo AWT");

        frame.setBackground(Color.CYAN);
        frame.setSize(300, 250);
        frame.setLayout(null);

        // Botón Salir
        Button btnSalir = new Button("Salir");
        btnSalir.setBounds(20, 50, 60, 30);

        // Botón Limpiar
        Button btnLimpiar = new Button("Limpiar");
        btnLimpiar.setBounds(90, 50, 60, 30);

        // Campo de texto
        TextField txtTexto = new TextField("Escribe algo...");
        txtTexto.setBounds(20, 100, 130, 30);

        // Controlador de boton salir
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Cierra la ventana
                frame.dispose();

                // Finaliza la aplicación
                System.exit(0);
            }
        });

        // Controlador de boton limpiar
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Borra el contenido del TextField
                txtTexto.setText("");
            }
        });

        // Controlador de la ventana
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {

                // Cierra la ventana
                frame.dispose();

                // Finaliza la aplicación
                System.exit(0);
            }
        });

        // Añadir componentes
        frame.add(btnSalir);
        frame.add(btnLimpiar);
        frame.add(txtTexto);

        // Mostrar ventana
        frame.setVisible(true);
    }
}