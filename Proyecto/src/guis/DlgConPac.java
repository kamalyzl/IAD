package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DlgConPac extends JDialog implements ActionListener {
	private JLabel lblConsultar;
	private JButton btnConsultar;
	private JButton btnSalir;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JTextField textField;
	private JTable tblconpac;
	private DefaultTableModel modelo;
	private JLabel lblindiqueElCdigo;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgConPac dialog = new DlgConPac();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DlgConPac() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgConPac.class.getResource("/img/TriCell.jpg")));
		setTitle("Consultar Paciente");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblConsultar = new JLabel("Paciente:");
		lblConsultar.setBounds(10, 11, 97, 45);
		panel.add(lblConsultar);
		lblConsultar.setForeground(Color.BLACK);
		lblConsultar.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(239, 11, 101, 45);
		panel.add(btnConsultar);
		btnConsultar.setForeground(Color.DARK_GRAY);
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(341, 11, 66, 45);
		panel.add(btnSalir);
		btnSalir.addActionListener(this);
		btnSalir.setForeground(Color.DARK_GRAY);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 57, 400, 180);
		panel.add(scrollPane);
		
		tblconpac = new JTable();
		tblconpac.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblconpac.setBackground(Color.LIGHT_GRAY);
		tblconpac.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblconpac);
		
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Código:");
		modelo.addColumn("Nombre:");
		modelo.addColumn("Apellido:");
		modelo.addColumn("Edad:");
		modelo.addColumn("Sexo:");
		
		tblconpac.setModel(modelo);
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(103, 11, 134, 45);
		panel.add(textField);
		textField.setColumns(10);
		
		lblindiqueElCdigo = new JLabel("(*)Indique el c\u00F3digo del paciente.");
		lblindiqueElCdigo.setForeground(Color.RED);
		lblindiqueElCdigo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblindiqueElCdigo.setBounds(10, 236, 397, 14);
		panel.add(lblindiqueElCdigo);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			actionPerformedBtnSalir(e);
		}
	}
	protected void actionPerformedBtnSalir(ActionEvent e) {
		System.exit(0);
	}
}
