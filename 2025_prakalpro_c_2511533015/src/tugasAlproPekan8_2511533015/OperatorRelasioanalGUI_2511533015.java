package tugasAlproPekan8_2511533015;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OperatorRelasioanalGUI_2511533015 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtBil1;
    private JTextField txtBil2;
    private JTextField txtHasil;

    private void pesanPeringatan(String pesan) {
        JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
    }

    private void pesanError(String pesan) {
        JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                OperatorRelasioanalGUI_2511533015 frame = new OperatorRelasioanalGUI_2511533015();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public OperatorRelasioanalGUI_2511533015() {

        setTitle("Operator Relasional");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setBackground(Color.CYAN);
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblJudul = new JLabel("OPERATOR RELASIONAL");
        lblJudul.setFont(new Font("Rockwell", Font.BOLD, 16));
        lblJudul.setHorizontalAlignment(SwingConstants.CENTER);
        lblJudul.setBounds(80, 20, 300, 25);
        contentPane.add(lblJudul);

        JLabel lbl1 = new JLabel("Variabel 1");
        lbl1.setBounds(50, 70, 80, 20);
        contentPane.add(lbl1);

        JLabel lbl2 = new JLabel("Variabel 2");
        lbl2.setBounds(50, 100, 80, 20);
        contentPane.add(lbl2);

        JLabel lblOp = new JLabel("Operator");
        lblOp.setBounds(50, 130, 80, 20);
        contentPane.add(lblOp);

        JLabel lblHasil = new JLabel("Hasil");
        lblHasil.setBounds(50, 180, 80, 20);
        contentPane.add(lblHasil);

        txtBil1 = new JTextField();
        txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
        txtBil1.setBounds(140, 70, 100, 20);
        contentPane.add(txtBil1);

        txtBil2 = new JTextField();
        txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
        txtBil2.setBounds(140, 100, 100, 20);
        contentPane.add(txtBil2);

        txtHasil = new JTextField();
        txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
        txtHasil.setBounds(140, 180, 100, 20);
        contentPane.add(txtHasil);

        JComboBox<String> cbOperator = new JComboBox<>();
        cbOperator.setModel(new DefaultComboBoxModel<>(new String[]{">", "<", ">=", "<=", "==", "!="}));
        cbOperator.setBounds(140, 130, 100, 22);
        contentPane.add(cbOperator);

        JButton btnHitung = new JButton("Berfikir");
        btnHitung.setBounds(280, 130, 100, 22);
        contentPane.add(btnHitung);

        // ==== EVENT BUTTON ====
        btnHitung.addActionListener(e -> {
            if (txtBil1.getText().trim().isEmpty()) {
                pesanPeringatan("Bilangan 1 harus diisi");
                return;
            }
            if (txtBil2.getText().trim().isEmpty()) {
                pesanPeringatan("Bilangan 2 harus diisi");
                return;
            }

            try {
                int a = Integer.parseInt(txtBil1.getText());
                int b = Integer.parseInt(txtBil2.getText());

                String op = cbOperator.getSelectedItem().toString();
                boolean hasil = false;

                switch (op) {
                    case ">": hasil = a > b; break;
                    case "<": hasil = a < b; break;
                    case ">=": hasil = a >= b; break;
                    case "<=": hasil = a <= b; break;
                    case "==": hasil = a == b; break;
                    case "!=": hasil = a != b; break;
                }

                txtHasil.setText(String.valueOf(hasil));

            } catch (NumberFormatException ex) {
                pesanError("Bilangan 1 dan Bilangan 2 harus berupa angka!");
            }
        });
    }
}
