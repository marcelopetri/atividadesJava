package exercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cartaoVisita extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cartaoVisita frame = new cartaoVisita();
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
	public cartaoVisita() {
		setResizable(false);
		setTitle("Cartão de Visitas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(cartaoVisita.class.getResource("/exercicio/mario (2).jpg")));
		lblNewLabel.setBounds(21, 24, 184, 228);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrMarceloPetri = new JTextArea();
		txtrMarceloPetri.setBackground(new Color(255, 255, 128));
		txtrMarceloPetri.setEditable(false);
		txtrMarceloPetri.setFont(new Font("Monospaced", Font.BOLD, 12));
		txtrMarceloPetri.setText("Marcelo Petri\r\n47 Anos\r\nProfessor\r\nMestre em Computação Aplicada");
		txtrMarceloPetri.setBounds(215, 24, 211, 75);
		contentPane.add(txtrMarceloPetri);
		
		JButton btnNewButton = new JButton("Fechar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(337, 229, 89, 23);
		contentPane.add(btnNewButton);

	}

}
