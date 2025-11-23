package pekan8_2511533015;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class OperatorAritmatikaGUI_2511533015 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan (String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void PesanError (String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511533015 frame = new OperatorAritmatikaGUI_2511533015();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperatorAritmatikaGUI_2511533015() {
		setForeground(new Color(128, 128, 255));
		setBackground(new Color(255, 128, 192));
		setTitle("Operator Aritmatika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 10));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(83, 34, 293, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(59, 73, 53, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bilangan 2");
		lblNewLabel_2.setBounds(59, 102, 53, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Operator ");
		lblNewLabel_3.setBounds(59, 146, 53, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hasil");
		lblNewLabel_4.setBounds(59, 192, 53, 20);
		contentPane.add(lblNewLabel_4);
		
		txtBil1 = new JTextField();
		txtBil1.setBackground(new Color(255, 255, 255));
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(151, 74, 96, 18);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setBounds(151, 103, 96, 18);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		txtHasil = new JTextField();
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setBounds(151, 193, 96, 18);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(151, 146, 96, 20);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
				pesanPeringatan("Bilangan 1 harus diisi");
			} else if (txtBil2.getText().trim().isEmpty()) {
				pesanPeringatan ("Bilangan 2 harus diisi");
			}
			else {
				try {
				int a= Integer.valueOf(txtBil1.getText());
				int b= Integer.valueOf(txtBil2.getText());
				int c= cbOperator.getSelectedIndex();
				if (c==0) {
					hasil = a + b;
				}
				if (c==1) {
					hasil = a - b;
				}
				if (c==2) {
					hasil = a * b;
				}
				if (c==3) {
					hasil = a / b;
				}
				if (c==4) {
					hasil = a % b;
				}
				txtHasil.setText(String.valueOf(hasil));
				} catch (NumberFormatException ex) {
				PesanError("Bilangan 1 dan 2 harus angka");
			}
			}
			}
			
		});
		btnNewButton.setBounds(295, 146, 84, 20);
		contentPane.add(btnNewButton);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, txtBil1, txtBil2, txtHasil, cbOperator, btnNewButton}));

	}
}
