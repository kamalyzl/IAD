package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import Arreglo.ArregloConsulta;
import clase.Cama;
import clase.Consulta;

import java.text.SimpleDateFormat;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

public class DlgRConsultas extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lblTotalAPagar;
	private JLabel lblEstado;
	private JTextField txtTotal;
	private static DefaultTableModel modelo;
	private JTextField textField;
	private JComboBox cboestado;
	private JScrollPane scrollPane;
	private JTable tblconmed;
	private JLabel label;
	private JLabel lblNConsulta;
	private JTextField txtConsulta;
	private JButton btnSeleccionar;
	static JTextField txtPaciente;
	private JButton btnAdicionar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
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
		setBounds(100, 100, 750, 518);
		getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBounds(12, 0, 708, 399);
		getContentPane().add(panel);
		panel.setLayout(null);

		cboestado = new JComboBox();
		cboestado.setModel(new DefaultComboBoxModel(new String[] { "Atencion", "Pagada" }));
		cboestado.setBounds(319, 13, 87, 20);
		panel.add(cboestado);

		lblTotalAPagar = new JLabel("Total a Pagar:");
		lblTotalAPagar.setBounds(445, 13, 105, 20);
		panel.add(lblTotalAPagar);

		lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(257, 10, 50, 20);
		panel.add(lblEstado);

		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(540, 13, 87, 20);
		panel.add(txtTotal);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 190, 684, 122);
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
		// modelo.addColumn("Receta:");
		tblconmed.setModel(modelo);

		label = new JLabel("");
		label.setIcon(new ImageIcon(DlgRConsultas.class.getResource("/img/consultamedica.jpg")));
		label.setBounds(504, 119, 175, 58);
		panel.add(label);

		lblNConsulta = new JLabel("N\u00B0 consulta");
		lblNConsulta.setBounds(23, 15, 65, 16);
		panel.add(lblNConsulta);

		txtConsulta = new JTextField();
		txtConsulta.setBounds(100, 12, 116, 22);
		panel.add(txtConsulta);
		txtConsulta.setColumns(10);

		btnSeleccionar = new JButton("Paciente");
		btnSeleccionar.addActionListener(this);
		btnSeleccionar.setBounds(23, 61, 120, 25);
		panel.add(btnSeleccionar);

		txtPaciente = new JTextField();
		txtPaciente.setBounds(155, 62, 116, 22);
		panel.add(txtPaciente);
		txtPaciente.setColumns(10);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(22, 152, 85, 25);
		panel.add(btnAdicionar);

		btnAceptar = new JButton("Guardar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(119, 152, 97, 25);
		panel.add(btnAceptar);

		textField = new JTextField();
		textField.setBounds(-4, 399, 736, 72);
		getContentPane().add(textField);
		textField.setEditable(false);
		textField.setBackground(new Color(210, 180, 140));
		textField.setColumns(10);

		listar();
		habilitarEntradas(false);
		habilitarCodigo(false);

	}

	ArregloConsulta ac = new ArregloConsulta("consulta.txt");


	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		if (arg0.getSource() == btnSeleccionar) {
			actionPerformedBtnSeleccionar(arg0);
		}
	}

	protected void actionPerformedBtnSeleccionar(ActionEvent arg0) {
		DlgLisPac dRC = new DlgLisPac();
		dRC.setLocationRelativeTo(this);
		dRC.setVisible(true);
	}

	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		double montoInicial = 100.00;
		limpieza();
		txtConsulta.setText("" + ac.codigoCorrelativo());
		txtTotal.setText("" + montoInicial);
		habilitarEntradas(true);
	}

	protected void actionPerformedBtnAceptar(ActionEvent arg0) {

		try {
			clase.Consulta x = new clase.Consulta(leerCodigoConsulta(), leerCodigoPaciente(), obtenerFecha(),
					obtenerHora(), leerTotal(), leerEstado());
			ac.adicionar(x);
			listar();
			limpieza();
			habilitarEntradas(false);

		} catch (Exception e) {
			mensaje("No existen datos que agregar");

		}

	}

	void limpieza() {
		txtPaciente.setText("");
		txtConsulta.setText("");
		txtTotal.setText("");
	}

	void habilitarEntradas(boolean is) {
		txtTotal.setEditable(is);
		cboestado.setEnabled(is);
		btnSeleccionar.setEnabled(is);
	}

	void habilitarCodigo(boolean is) {
		txtConsulta.setEditable(is);
		txtPaciente.setEditable(is);
	}

	String obtenerFecha() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(d);
	}

	String obtenerHora() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		return sdf.format(d);
	}

	void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < ac.tama�o(); i++) {
			Object[] fila = { ac.obtener(i).getCodigoConsulta(), ac.obtener(i).getCodigoPaciente(),
					ac.obtener(i).getFechaAtencion(), ac.obtener(i).getHoraAtencion(), ac.obtener(i).getTotalPagar(),
					ac.obtener(i).detalleEstado() };
			modelo.addRow(fila);
		}
	}

	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}

	int leerEstado() {
		return cboestado.getSelectedIndex();
	}

	int leerCodigoConsulta() {
		return Integer.parseInt(txtConsulta.getText().trim());
	}

	int leerCodigoPaciente() {
		return Integer.parseInt(txtPaciente.getText().trim());
	}

	double leerTotal() {
		return Double.parseDouble(txtTotal.getText().trim());
	}

}
