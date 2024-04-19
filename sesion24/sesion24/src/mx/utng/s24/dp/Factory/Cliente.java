package mx.utng.s24.dp.Factory;

import javax.net.ssl.SNIMatcher;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Declaro una clase que crea Jframe(Ventana basica)
public class Cliente extends JFrame{
    //declaro doselementes de formulario
    private JTextField txtUsuario;
    private JPasswordField txtPassword;

    //creando los elementos de inicio de la ventana
    public Cliente() {
        //Llamo al constructor de JFrame colocandole un titulo
        super("Login");
        //Pongo una operacion de cierre x
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Coloco las dimenciones de ancho y alto
        setSize(300,150);

        //Defino un contenedor de elementos visuales
        JPanel panel = new JPanel ();

        //  Al panel de doy un diseño (rejilla)
        panel.setLayout(new GridLayout(3, 2));

        //Etiqueta para el usuario
        JLabel lblUsuario = new JLabel("Usuario: ");
        //Etiqueta para el el password
        JLabel lblPassword = new JLabel("Password: ");

        //Creamos las cajas de texto
        txtUsuario = new JTextField();
        txtPassword = new JPasswordField();

        //creamos un boton
        JButton btnLogin = new JButton("Login");

        //Colocamos accion al boton
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                char[] caraPassword = txtPassword.getPassword();
                String password = new String(caraPassword);

                if (validarLogin(usuario, password)){
                    JOptionPane.showMessageDialog(Cliente.this, "Login correcto!!",
                    "Validacion", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(Cliente.this, "Usuario o contraseña incorrectos!!",
                    "Validacion", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        //Añadimos los elementos visuales al contenedor
        panel.add(lblUsuario);
        panel.add(txtUsuario);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);


        //agregando a la ventana el panel
        add(panel);
        //hacemos visible la ventana
        setVisible(true);
        //centrar la ventana
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        new Cliente();
    }

    private boolean validarLogin(String Usuario, String password){
        return Usuario.equals("utng")&& password.equals("xyz123");

    }
}
