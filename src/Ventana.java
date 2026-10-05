import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel panel;
    private JTabbedPane tabbedPane1;
    private JTextField txtNombre;
    private JSpinner spiNumero;
    private JComboBox cboCategoria;
    private JButton btnAgregar;
    private JTextArea txtListado;
    private JButton btnAtender;
    private JButton btnSiguiente;
    private JTextField txtSiguiente;
    private  Cola cola=new Cola();


    public Ventana() {
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cola.agregar(new Pasajero(
                        txtNombre.getText(),
                        Integer.parseInt(spiNumero.getValue().toString()),
                        cboCategoria.getSelectedItem().toString()
                ));

                JOptionPane.showMessageDialog(null,"Agregado correctamente");
                txtListado.setText(cola.toString());

            }
        });

        btnAtender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                        Pasajero atendido=cola.extraer();
                        txtSiguiente.setText("Elemento atendido"+atendido.toString());
                        txtListado.setText(cola.toString());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }


            }
        });
        btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Pasajero  aux=cola.peek();
                    txtSiguiente.setText("pasajero: "+ aux);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
