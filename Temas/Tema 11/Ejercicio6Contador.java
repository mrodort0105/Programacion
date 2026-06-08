package tema11;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio6Contador extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;
	// Componentes de la interfaz
    private Button btnRestar;
    private Button btnSumar;
    private Label lblNumero;
    
    // Variable para llevar el control del número central
    private int contador = 0;

    public Ejercicio6Contador() {
        // 1. Configurar la ventana con FlowLayout
        setLayout(new FlowLayout());
        setTitle("Ejercicio 6: Contador");
        setSize(300, 100);
        
        // 2. Crear e añadir los componentes en el orden solicitado
        btnRestar = new Button("-1");
        lblNumero = new Label("0");
        btnSumar = new Button("+1");
        
        add(btnRestar);
        add(lblNumero);
        add(btnSumar);
        
        // 3. Conectar ambos botones al mismo escuchador (this)
        btnRestar.addActionListener(this);
        btnSumar.addActionListener(this);
        
        // Permitir cerrar la ventana al pulsar la 'X'
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        setVisible(true);
    }

    // 4. Ampliación: Lógica para descubrir qué botón se ha pulsado
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRestar) {
            contador--; // Restar lógica...
        } else if (e.getSource() == btnSumar) {
            contador++; // Sumar lógica...
        }
        
        // Actualizar el texto del Label con el nuevo valor
        lblNumero.setText(String.valueOf(contador));
    }

    public static void main(String[] args) {
        new Ejercicio6Contador();
    }
}