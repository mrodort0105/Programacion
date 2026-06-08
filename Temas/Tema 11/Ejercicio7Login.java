package tema11;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio7Login extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;
	// Componentes del formulario
    private TextField txtUsuario;
    private TextField txtContrasena;
    private Button btnAceptar;
    private Button btnBorrar;
    private Button btnCerrar;
    
    // Componentes de la parte opcional
    private Button btnSeleccionarFichero;
    private Label lblRutaFichero;

    public Ejercicio7Login() {
        // Configuración de la ventana principal
        setTitle("Pantalla de Login");
        setSize(400, 350);
        setLayout(new GridLayout(6, 2, 10, 10)); // Rejilla ordenada para los campos

        // 1. Campos de usuario y contraseña
        add(new Label("Usuario:"));
        txtUsuario = new TextField();
        add(txtUsuario);

        add(new Label("Contraseña:"));
        txtContrasena = new TextField();
        txtContrasena.setEchoChar('*'); // Ocultar los caracteres de la contraseña
        add(txtContrasena);

        // Botones de acción del formulario
        btnAceptar = new Button("Aceptar");
        btnBorrar = new Button("Borrar Formulario");
        btnCerrar = new Button("Cerrar Ventana");

        add(btnAceptar);
        add(btnBorrar);
        add(btnCerrar);
        
        // Añadir un espacio en blanco en la rejilla para cuadrar el diseño
        add(new Label("")); 

        // 2. Componentes Opcionales (Selector de ficheros)
        btnSeleccionarFichero = new Button("Seleccionar Fichero...");
        lblRutaFichero = new Label("Ningún fichero seleccionado.");
        
        add(btnSeleccionarFichero);
        add(lblRutaFichero);

        // Asignar los eventos (escuchadores)
        btnAceptar.addActionListener(this);
        btnBorrar.addActionListener(this);
        btnCerrar.addActionListener(this);
        btnSeleccionarFichero.addActionListener(this);

        // Control de cierre nativo de la ventana (pulsar la X)
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Centrar ventana en pantalla y mostrar
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Acción: Cerrar la ventana
        if (e.getSource() == btnCerrar) {
            System.exit(0);
        }
        
        // Acción: Borrar el texto del formulario
        else if (e.getSource() == btnBorrar) {
            txtUsuario.setText("");
            txtContrasena.setText("");
        }
        
        // Acción: Aceptar y mostrar Diálogo Modal de Bienvenida
        else if (e.getSource() == btnAceptar) {
            String usuario = txtUsuario.getText().trim();
            
            if (usuario.isEmpty()) {
                usuario = "Invitado"; // Valor por defecto si está vacío
            }

            // Crear diálogo modal
            Dialog dialogoBienvenida = new Dialog(this, "Bienvenido", true);
            dialogoBienvenida.setLayout(new FlowLayout());
            dialogoBienvenida.setSize(250, 120);
            dialogoBienvenida.setLocationRelativeTo(this);

            Label lblMensaje = new Label("¡Bienvenido/a de nuevo, " + usuario + "!");
            Button btnOk = new Button("OK");
            
            // Cerrar el diálogo al pulsar OK
            btnOk.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    dialogoBienvenida.dispose();
                }
            });

            dialogoBienvenida.add(lblMensaje);
            dialogoBienvenida.add(btnOk);
            dialogoBienvenida.setVisible(true);
        }
        
        // Acción Opcional: Seleccionar un fichero y mostrar su ruta
        else if (e.getSource() == btnSeleccionarFichero) {
            FileDialog fileDialog = new FileDialog(this, "Selecciona un archivo", FileDialog.LOAD);
            fileDialog.setVisible(true);

            String directorio = fileDialog.getDirectory();
            String archivo = fileDialog.getFile();

            // Si el usuario no canceló la selección
            if (directorio != null && archivo != null) {
                lblRutaFichero.setText(directorio + archivo);
            }
        }
    }

    public static void main(String[] args) {
        new Ejercicio7Login();
    }
}