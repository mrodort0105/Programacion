package tema11;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

public class PanelAscensor {

    // El objeto ventana se declara como un atributo de la clase
    private JFrame ventana;

    public PanelAscensor() {
        // 1. Instanciamos el JFrame directamente en lugar de usar "this"
        ventana = new JFrame("Ascensor - Panel de Control");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setMinimumSize(new Dimension(250, 250));

        // 2. Creamos el panel contenedor principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBorder(new EmptyBorder(20, 20, 20, 20)); 
        panelPrincipal.setBackground(Color.DARK_GRAY); 
        
        // 3. Definimos el GridLayout de 2x2
        panelPrincipal.setLayout(new GridLayout(2, 2, 10, 10));

        // 4. Crear los botones con diseño
        JButton botonPiso4 = crearBotónEstilizado("4");
        JButton botonPiso3 = crearBotónEstilizado("3");
        JButton botonPiso2 = crearBotónEstilizado("2");
        JButton botonPiso1 = crearBotónEstilizado("1");

        // 5. Añadir los botones al panel
        panelPrincipal.add(botonPiso3); 
        panelPrincipal.add(botonPiso4); 
        panelPrincipal.add(botonPiso1); 
        panelPrincipal.add(botonPiso2); 

        // 6. Agregar el panel principal a la ventana externa
        ventana.add(panelPrincipal);

        // 7. Ajustar tamaño de la ventana y centrarla
        ventana.setPreferredSize(new Dimension(350, 350));
        ventana.pack();
        ventana.setLocationRelativeTo(null); 
    }

    // Método para hacer visible la ventana
    public void mostrar() {
        ventana.setVisible(true);
    }

    // Método auxiliar para dar diseño a los botones
    private JButton crearBotónEstilizado(String texto) {
        JButton boton = new JButton(texto);
        boton.setFont(new Font("Arial", Font.BOLD, 24)); 
        boton.setBackground(Color.LIGHT_GRAY);
        boton.setForeground(Color.BLACK);
        boton.setBorder(new LineBorder(Color.GRAY, 2)); 
        boton.setFocusPainted(false); 
        return boton;
    }

    public static void main(String[] args) {
        // Ejecución segura de la interfaz gráfica
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Creamos el objeto y llamamos a su método para mostrarlo
                new PanelAscensor().mostrar();
            }
        });
    }
}
