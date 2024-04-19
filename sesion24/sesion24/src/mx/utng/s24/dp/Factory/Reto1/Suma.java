package mx.utng.s24.dp.Factory.Reto1;

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

public class Suma extends JFrame{
    
    private JTextField txtNum1;
    private JTextField txtNum2;

    public Suma(){
        super("Sumador");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(300, 150);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 2));

            JLabel lblNum1 = new JLabel("Número1: ");
            JLabel lblNum2 = new JLabel("Número2: ");

            txtNum1 = new JTextField();
            txtNum2 = new JTextField();

            JButton btnSumar = new JButton("Sumar");

            btnSumar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Float numero1 = Float.parseFloat(txtNum1.getText());
                        Float numero2 = Float.parseFloat(txtNum2.getText());
    
                        Float resultado = numero1 + numero2;
    
                        JOptionPane.showMessageDialog(Suma.this, "El resultado de la suma es: " + resultado, "Suma", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(Suma.this, "Por favor ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        panel.add(lblNum1);
        panel.add(txtNum1);
        panel.add(lblNum2);
        panel.add(txtNum2);
        panel.add(btnSumar);

        add(panel);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Suma();
    }
}
    

