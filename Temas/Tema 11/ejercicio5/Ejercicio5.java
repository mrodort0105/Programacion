package UD11.ejercicio5;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        // Creamos ventana
        Frame ventana = new Frame("Ejercicio 5 - Menús");
        ventana.setSize(400, 300);
        ventana.setLayout(new BorderLayout());

        // Etiqueta central
        Label etiqueta = new Label("Texto de prueba", Label.CENTER);
        ventana.add(etiqueta, BorderLayout.CENTER);

        // Barra de menu
        MenuBar barraMenu = new MenuBar();

        // Menu Estilo
        Menu menuEstilo = new Menu("Estilo");

        MenuItem Negrita = new MenuItem("Negrita");
        MenuItem Normal = new MenuItem("Normal");

        menuEstilo.add(Negrita);
        menuEstilo.add(Normal);

        // Menu Color
        Menu menuColor = new Menu("Color");

        MenuItem Rojo = new MenuItem("Rojo");
        MenuItem Azul = new MenuItem("Azul");
        MenuItem Negro = new MenuItem("Negro");

        menuColor.add(Rojo);
        menuColor.add(Azul);
        menuColor.add(Negro);

        // Añadir menús a la barra
        barraMenu.add(menuEstilo);
        barraMenu.add(menuColor);

        ventana.setMenuBar(barraMenu);

        // Cerrar ventana
        ventana.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ventana.dispose();
                System.exit(0);
            }
        });

        ventana.setVisible(true);
    }
}