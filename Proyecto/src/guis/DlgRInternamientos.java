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
	private JTextField textField;
	private JLabel label;
	private JTextField txtInternamientos;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgRInternamientos.class.getResource("/img/registrar.png")));
		setTitle("Internamientos");
		setBounds(100, 100, 600, 632);
		getContentPane().setLayout(null);

		cboEstado = new JComboBox();
		cboEstado.setModel(new DefaultComboBoxModel(new String[] { "Internado", "Alta" }));
		cboEstado.setBounds(187, 70, 86, 20);
		getContentPane().add(cboEstado);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 251, 564, 173);
		getContentPane().add(scrollPane);

		tblrint = new JTable();
		scrollPane.setViewportView(tblrint);

		modelo = new DefaultTableModel();
		modelo.addColumn("C�d. de Internamiento");
		modelo.addColumn("C�d. de Paciente");
		modelo.addColumn("Num de Cama"); 
		modelo.addColumn("Fecha Ingreso");
		modelo.addColumn("Hora Ingreso");
		modelo.addColumn("Fecha Salida");
		modelo.addColumn("Hora Salida");
		modelo.addColumn("Total");
		modelo.addColumn("Estado");

		tblrint.setModel(modelo);

		textField = new JTextField();
		textField.setBackground(new Color(210, 180, 140));
		textField.setEditable(false);
		textField.setBounds(10, 470, 564, 115);
		getContentPane().add(textField);
		textField.setColumns(10);

		label = new JLabel("");
		label.setIcon(new ImageIcon(DlgRInternamientos.class.getResource("/img/hospital_int.jpg")));
		label.setBounds(537, 196, 37, 42);
		getContentPane().add(label);

		txtInternamientos = new JTextField();
		txtInternamientos.setEditable(false);
		txtInternamientos.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtInternamientos.setHorizontalAlignment(SwingConstants.CENTER);
		txtInternamientos.setText("INTERNAMIENTOS");
		txtInternamientos.setBackground(new Color(173, 216, 230));
		txtInternamientos.setBounds(315, 196, 212, 42);
		getContentPane().add(txtInternamientos);
		txtInternamientos.setColumns(10);

		txtCama = new JTextField();
		txtCama.setBounds(443, 21, 116, 22);
		getContentPane().add(txtCama);
		txtCama.setColumns(10);

		btnCama = new JButton("N\u00B0 Cama");
		btnCama.addActionListener(this);
		btnCama.setBounds(344, 20, 97, 25);
		getContentPane().add(btnCama);

		txtCodInternamiento = new JTextField();
		txtCodInternamiento.setBounds(125, 21, 116, 22);
		getContentPane().add(txtCodInternamiento);
		txtCodInternamiento.setColumns(10);

		lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(26, 24, 39, 16);
		getContentPane().add(lblCdigo);

		lblTotal = new JLabel("Total a pagar");
		lblTotal.setBounds(28, 125, 77, 16);
		getContentPane().add(lblTotal);

		txtTotal = new JTextField();
		txtTotal.setBounds(125, 122, 116, 22);
		getContentPane().add(txtTotal);
		txtTotal.setColumns(10);

		btnPaciente = new JButton("Paciente");
		btnPaciente.addActionListener(this);
		btnPaciente.setBounds(344, 81, 97, 25);
		getContentPane().add(btnPaciente);

		txtPaciente = new JTextField();
		txtPaciente.setBounds(443, 82, 116, 22);
		getContentPane().add(txtPaciente);
		txtPaciente.setColumns(10);

		lblEstadoDeInternamiento = new JLabel("Estado de internamiento");
		lblEstadoDeInternamiento.setBounds(26, 72, 139, 16);
		getContentPane().add(lblEstadoDeInternamiento);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(10, 196, 97, 25);
		getContentPane().add(btnAdicionar);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(125, 196, 97, 25);
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
		for (int i = 0; i < ainter.tama�o(); i++) {
			Object[] fila = { ainter.obtener(i).getCodigoInternamiento(), ainter.obtener(i).getCodigoPaciente(),
					ainter.obtener(i).getNumeroCama(), ainter.obtener(i).getFechaIngreso(),
					ainter.obtener(i).getHoraIngreso(), ainter.obtener(i).getFechaSalida(),
					ainter.obtener(i).getHoraSalida() };
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
