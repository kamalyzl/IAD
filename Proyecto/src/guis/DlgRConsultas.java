package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class DlgRConsultas extends JDialog implements ActionListener {
	private JPanel panel;
	private JLabel lblFechaDeAtencin;
	private JLabel lblHoraDeAtencin;
	private JLabel lblTotalAPagar;
	private JLabel lblEstado;
	private JTextField txttotapa;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JTextField txthrs;
	private static DefaultTableModel modelo;
	private JButton btnRegistrar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JTextField textField;
	private JComboBox cboestado;
	private JScrollPane scrollPane;
	private JTable tblconmed;
	private JTextField txtRegistro;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgRConsultas dialog = new DlgRConsultas();
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
	public DlgRConsultas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgRConsultas.class.getResource("/img/TriCell.jpg")));
		setTitle("Consultas Medicas");
		setBounds(100, 100, 750, 300);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 724, 261);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		cboestado = new JComboBox();
		cboestado.setBounds(337, 9, 87, 20);
		panel.add(cboestado);
		
		lblFechaDeAtencin = new JLabel("Fecha de atenci\u00F3n:");
		lblFechaDeAtencin.setBounds(434, 0, 105, 39);
		panel.add(lblFechaDeAtencin);
		
		lblHoraDeAtencin = new JLabel("Hora de atenci\u00F3n:");
		lblHoraDeAtencin.setBounds(10, 9, 105, 20);
		panel.add(lblHoraDeAtencin);
		
		lblTotalAPagar = new JLabel("Total a Pagar:");
		lblTotalAPagar.setBounds(222, 39, 105, 20);
		panel.add(lblTotalAPagar);
		
		lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(277, 10, 50, 20);
		panel.add(lblEstado);
		
		txttotapa = new JTextField();
		txttotapa.setColumns(10);
		txttotapa.setBounds(337, 39, 87, 20);
		panel.add(txttotapa);
		
		comboBox = new JComboBox();
		comboBox.setBounds(650, 9, 50, 20);
		panel.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(600, 9, 50, 20);
		panel.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(550, 9, 50, 20);
		panel.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(115, 9, 50, 20);
		panel.add(comboBox_3);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setBounds(165, 9, 50, 20);
		panel.add(comboBox_4);
		
		txthrs = new JTextField();
		txthrs.setEditable(false);
		txthrs.setHorizontalAlignment(SwingConstants.CENTER);
		txthrs.setText("HRS");
		txthrs.setBounds(215, 9, 50, 20);
		panel.add(txthrs);
		txthrs.setColumns(10);
		
		btnRegistrar = new JButton("");
		btnRegistrar.setIcon(new ImageIcon(DlgRConsultas.class.getResource("/img/registrar.png")));
		btnRegistrar.setBounds(0, 70, 90, 58);
		panel.add(btnRegistrar);
		
		btnEliminar = new JButton("");
		btnEliminar.setIcon(new ImageIcon(DlgRConsultas.class.getResource("/img/eliminar.png")));
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(90, 70, 90, 58);
		panel.add(btnEliminar);
		
		btnModificar = new JButton("");
		btnModificar.setIcon(new ImageIcon(DlgRConsultas.class.getResource("/img/modificar.png")));
		btnModificar.setBounds(180, 70, 90, 58);
		panel.add(btnModificar);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(new Color(210, 180, 140));
		textField.setBounds(0, -1, 724, 72);
		panel.add(textField);
		textField.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 128, 724, 122);
		panel.add(scrollPane);
		
		tblconmed = new JTable();
		scrollPane.setViewportView(tblconmed);
		
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Cod. consulta:");
		modelo.addColumn("Cod. paciente:");
		modelo.addColumn("Fecha atenci�n:");
		modelo.addColumn("Hora atenci�n:");
		modelo.addColumn("Total a Pagar:");
		modelo.addColumn("Estado atenci�n:");
		modelo.addColumn("Receta:");
		tblconmed.setModel(modelo);
		
		txtRegistro = new JTextField();
		txtRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtRegistro.setEditable(false);
		txtRegistro.setBackground(new Color(175, 238, 238));
		txtRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		txtRegistro.setText("REGISTRO");
		txtRegistro.setBounds(270, 70, 280, 58);
		panel.add(txtRegistro);
		txtRegistro.setColumns(10);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(DlgRConsultas.class.getResource("/img/consultamedica.jpg")));
		label.setBounds(549, 70, 175, 58);
		panel.add(label);
		

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
	}
}
