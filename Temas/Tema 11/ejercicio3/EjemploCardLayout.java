package UD11.ejercicio3;

import java.awt.*;

public class EjemploCardLayout {

    public static void main(String[] args) {

        Frame ventana = new Frame("CardLayout");
        ventana.setSize(400, 300);

        CardLayout cardLayout = new CardLayout();
        Panel panel = new Panel();

        panel.setLayout(cardLayout);

        panel.add(new Label("Tarjeta 1"), "UNO");
        panel.add(new Label("Tarjeta 2"), "DOS");
        panel.add(new Label("Tarjeta 3"), "TRES");

        ventana.add(panel);

        // Muestra la tarjeta DOS
        cardLayout.show(panel, "DOS");

        ventana.setVisible(true);
    }
}