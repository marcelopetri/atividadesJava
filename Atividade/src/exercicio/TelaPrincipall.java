package exercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.awt.event.InputEvent;
import javax.swing.JTree;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class TelaPrincipall {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipall window = new TelaPrincipall();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipall() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 950, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Abrir Mensagem");
		chckbxmntmNewCheckItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Olá, esse é a atividade de java!!");
			}
		});
		chckbxmntmNewCheckItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(chckbxmntmNewCheckItem);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Abrir Cartão de Visita");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cartaoVisita cv = new cartaoVisita();
				cv.setVisible(true);
			}
		});
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cartão Apresentação");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cartaoApresentacao cv = new cartaoApresentacao();
				cv.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_1);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(621, 30, 270, 98);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "Petri"},
				{new Integer(2), "Francini"},
				{new Integer(3), "Claudia"},
				{new Integer(4), "Talita"},
			},
			new String[] {
				"C\u00F3digo", "Nome"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		textField = new JTextField();
		textField.setBounds(27, 86, 354, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Digite uma Mensagem:");
		lblNewLabel.setBounds(27, 62, 164, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Mostrar Mensagem");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, textField.getText());
			}
		});
		btnNewButton.setBounds(27, 117, 142, 23);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (comboBox.getSelectedIndex()) {
					case 0 : { table.setBackground(Color.WHITE);break;}
					case 1 : { table.setBackground(Color.BLUE);break;}
					case 2 : {table.setBackground(Color.RED);break;}
					case 3 : {table.setBackground(Color.YELLOW);break;}
					case 4 : {table.setBackground(Color.GREEN);break;}
					case 5 : {table.setBackground(Color.ORANGE);break;}
					default : {table.setBackground(Color.WHITE);break;} 
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma cor para a Tabela", "Azul", "Vermelho", "Amarelo", "Verde", "Laranja"}));
		comboBox.setBounds(641, 139, 250, 22);
		frame.getContentPane().add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 166, 936, 20);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 489, 936, 20);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(822, 510, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Jornal");
		chckbxNewCheckBox.setBounds(27, 193, 99, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Revista");
		chckbxNewCheckBox_1.setBounds(27, 241, 99, 20);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("CD / DVD");
		chckbxNewCheckBox_2.setBounds(27, 288, 99, 20);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JButton btnNewButton_2 = new JButton("Itens Selecionados");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
				if (chckbxNewCheckBox.isSelected()) {
					if (!msg.isEmpty()) 
						msg += " | "; 
					msg += chckbxNewCheckBox.getText();
				}
				if (chckbxNewCheckBox_1.isSelected()) {
					if (!msg.isEmpty()) 
						msg += " | "; 
					msg += chckbxNewCheckBox_1.getText();
				}
				if (chckbxNewCheckBox_2.isSelected()) {
					if (!msg.isEmpty()) 
						msg += " | "; 
					msg += chckbxNewCheckBox_2.getText();
				}
				
				if (msg.isEmpty())
					JOptionPane.showMessageDialog(null, "Itens não selecionados!!");
				else
					JOptionPane.showMessageDialog(null, msg);
					
			}
		});
		btnNewButton_2.setBounds(132, 240, 142, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(27, 380, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Feminino");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(27, 424, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(144, 379, 109, 99);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton_3 = new JButton("Inserir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton.isSelected()) {
					textArea.setText(rdbtnNewRadioButton.getText());
				}
				else if (rdbtnNewRadioButton_1.isSelected()) {
					textArea.setText(rdbtnNewRadioButton_1.getText());
				}
				else {
					textArea.setText(rdbtnNewRadioButton_1.getText());
				}	
			}
			
		});
		btnNewButton_3.setBounds(27, 455, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JList list = new JList();
		list.setBounds(586, 212, 89, 220);
		frame.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Teclado", "Mouse", "Monitor", "CPU"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setBounds(364, 212, 89, 220);
		frame.getContentPane().add(list_1);
		
		JButton btnNewButton_4 = new JButton("Confirmar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel dlm = new DefaultListModel();
				list.setModel(dlm);
				list_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
				for (Iterator it = list_1.getSelectedValuesList().iterator(); it.hasNext(); ) {
					String itemSelecionado = (String) it.next();
					if (!dlm.contains(itemSelecionado)) {
						dlm.addElement(itemSelecionado);
					}
				}
			
			}
		});
		btnNewButton_4.setBounds(462, 288, 114, 23);
		frame.getContentPane().add(btnNewButton_4);
		

	}
}
