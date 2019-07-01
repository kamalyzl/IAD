package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Arreglo.ArregloInternamiento;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class DlgRInternamientos extends JDialog implements ActionListener {
	private JComboBox<?> cboEstado;
	private static DefaultTableModel modelo;
	private JScrollPane scrollPane;
	private JTable tblrint;
	static JTextField txtCama;
	private JButton btnCama;
	private JTextField txtCodInternamiento;
	private JLabel lblCdigo;
	private JLabel lblTotal;
	private JTextField txtTotal;
	private JButton btnPaciente;
	static JTextField txtPaciente;
	private JLabel lblEstadoDeInternamiento;
	private JButton btnAdicionar;
	private JButton btnGuardar;

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
					DlgRInternamientos dialog = new DlgRInternamientos();
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
	public DlgRInternamientos() {
		getContentPane().setBackground(new Color(224, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgRInternamientos.class.getResource("/img/registrar.png")));
		setTitle("Internamientos");
		setBounds(100, 100, 688, 632);
		getContentPane().setLayout(null);

		cboEstado = new JComboBox();
		cboEstado.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		cboEstado.setModel(new DefaultComboBoxModel(new String[] { "Internado", "Alta" }));
		cboEstado.setBounds(213, 85, 91, 23);
		getContentPane().add(cboEstado);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 293, 648, 213);
		getContentPane().add(scrollPane);

		tblrint = new JTable();
		scrollPane.setViewportView(tblrint);

		modelo = new DefaultTableModel();
		modelo.addColumn("Cód. de Internamiento");
		modelo.addColumn("Cód. de Paciente");
		modelo.addColumn("Num de Cama"); 
		modelo.addColumn("Fecha Ingreso");
		modelo.addColumn("Hora Ingreso");
		modelo.addColumn("Total");
		modelo.addColumn("Estado");

		tblrint.setModel(modelo);

		txtCama = new JTextField();
		txtCama.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtCama.setBounds(149, 134, 116, 24);
		getContentPane().add(txtCama);
		txtCama.setColumns(10);

		btnCama = new JButton("N\u00B0 Cama");
		btnCama.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnCama.addActionListener(this);
		btnCama.setBounds(30, 133, 93, 25);
		getContentPane().add(btnCama);

		txtCodInternamiento = new JTextField();
		txtCodInternamiento.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtCodInternamiento.setBounds(107, 40, 116, 22);
		getContentPane().add(txtCodInternamiento);
		txtCodInternamiento.setColumns(10);

		lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblCdigo.setBounds(28, 42, 67, 17);
		getContentPane().add(lblCdigo);

		lblTotal = new JLabel("Total a pagar");
		lblTotal.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblTotal.setBounds(531, 199, 88, 17);
		getContentPane().add(lblTotal);

		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtTotal.setBounds(522, 229, 116, 50);
		getContentPane().add(txtTotal);
		txtTotal.setColumns(10);

		btnPaciente = new JButton("Paciente");
		btnPaciente.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnPaciente.addActionListener(this);
		btnPaciente.setBounds(30, 174, 97, 25);
		getContentPane().add(btnPaciente);

		txtPaciente = new JTextField();
		txtPaciente.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtPaciente.setBounds(149, 174, 116, 25);
		getContentPane().add(txtPaciente);
		txtPaciente.setColumns(10);

		lblEstadoDeInternamiento = new JLabel("Estado de internamiento");
		lblEstadoDeInternamiento.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblEstadoDeInternamiento.setBounds(28, 88, 193, 17);
		getContentPane().add(lblEstadoDeInternamiento);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnAdicionar.setBounds(28, 255, 95, 25);
		getContentPane().add(btnAdicionar);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnGuardar.setBounds(293, 530, 108, 30);
		getContentPane().add(btnGuardar);
		listar();
		habilitarEntradas(false);
		habilitarCodigo(false);

	}

	ArregloInternamiento ainter = new ArregloInternamiento("internamiento.txt");

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnPaciente) {
			actionPerformedBtnPaciente(arg0);
		}
		if (arg0.getSource() == btnCama) {
			actionPerformedBtnCama(arg0);
		}
	}

	protected void actionPerformedBtnCama(ActionEvent arg0) {
		DlgLisCam dRC = new DlgLisCam();
		dRC.setLocationRelativeTo(this);
		dRC.setVisible(true);
	}

	protected void actionPerformedBtnPaciente(ActionEvent arg0) {
		DlgLisPac dRC = new DlgLisPac();
		dRC.setLocationRelativeTo(this);
		dRC.setVisible(true);
	}

	void limpieza() {
		txtCodInternamiento.setText("");
		txtTotal.setText("");
		txtCama.setText("");
		txtPaciente.setText("");
	}

	void habilitarEntradas(boolean is) {
		txtTotal.setEditable(is);
		cboEstado.setEnabled(is);
		btnCama.setEnabled(is);
	}

	void habilitarCodigo(boolean is) {
		txtCodInternamiento.setEditable(is);
		txtCama.setEditable(is);
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
		for (int i = 0; i < ainter.tamaño(); i++) {
			Object[] fila = { ainter.obtener(i).getCodigoInternamiento(), ainter.obtener(i).getCodigoPaciente(),
					ainter.obtener(i).getNumeroCama(), ainter.obtener(i).getFechaIngreso(),
					ainter.obtener(i).getHoraIngreso(), ainter.obtener(i).getTotalPagar(), ainter.obtener(i).detalleEstado() };
			modelo.addRow(fila);
		}
	}

	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}

	int leerEstado() {
		return cboEstado.getSelectedIndex();
	}

	int leerNumCama() {
		return Integer.parseInt(txtCama.getText().trim());
	}

	int leerCodigoPaciente() {
		return Integer.parseInt(txtPaciente.getText().trim());
	}

	int leerCodigoInternamiento() {
		return Integer.parseInt(txtCodInternamiento.getText().trim());
	}

	double leerTotal() {
		return Double.parseDouble(txtTotal.getText().trim());
	}
}
