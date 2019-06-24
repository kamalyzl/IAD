package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class DlgRInternamientos extends JDialog {
	private JLabel lblCama;
	private JComboBox comboBox;
	private JLabel lblFechaDeIngreso;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JLabel lblEstado;
	private JComboBox comboBox_4;
	private JLabel lblEstadoDeLa;
	private JComboBox comboBox_5;
	private static DefaultTableModel modelo;
	private JScrollPane scrollPane;
	private JTable tblrint;
	private JButton btnRegistrar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JTextField textField;
	private JLabel label;
	private JTextField txtInternamientos;
	private JLabel lblclnicaBautista;
	private JLabel lblATuServicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setBounds(100, 100, 600, 380);
		getContentPane().setLayout(null);
		
		lblATuServicio = new JLabel("a tu servicio las 24hrs");
		lblATuServicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblATuServicio.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblATuServicio.setBounds(280, 71, 271, 47);
		getContentPane().add(lblATuServicio);
		
		lblclnicaBautista = new JLabel("\"CLINICA BAUTISTA\"");
		lblclnicaBautista.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblclnicaBautista.setHorizontalAlignment(SwingConstants.CENTER);
		lblclnicaBautista.setBounds(280, 40, 271, 47);
		getContentPane().add(lblclnicaBautista);
		
		lblCama = new JLabel("Cama:");
		lblCama.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblCama.setBounds(10, 10, 134, 20);
		getContentPane().add(lblCama);
		
		comboBox = new JComboBox();
		comboBox.setBounds(184, 12, 86, 20);
		getContentPane().add(comboBox);
		
		lblFechaDeIngreso = new JLabel("Fecha de Ingreso:");
		lblFechaDeIngreso.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblFechaDeIngreso.setBounds(280, 15, 111, 14);
		getContentPane().add(lblFechaDeIngreso);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(400, 12, 50, 20);
		getContentPane().add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(450, 12, 50, 20);
		getContentPane().add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(500, 12, 50, 20);
		getContentPane().add(comboBox_3);
		
		lblEstado = new JLabel("Estado Internamiento:");
		lblEstado.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblEstado.setBounds(10, 40, 134, 20);
		getContentPane().add(lblEstado);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Internado", "Alta"}));
		comboBox_4.setBounds(184, 40, 86, 20);
		getContentPane().add(comboBox_4);
		
		lblEstadoDeLa = new JLabel("Estado Cama:");
		lblEstadoDeLa.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblEstadoDeLa.setBounds(10, 70, 134, 17);
		getContentPane().add(lblEstadoDeLa);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Libre", "Ocupado"}));
		comboBox_5.setBounds(184, 70, 86, 20);
		getContentPane().add(comboBox_5);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 157, 564, 173);
		getContentPane().add(scrollPane);
		
		tblrint = new JTable();
		scrollPane.setViewportView(tblrint);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Código:");
		modelo.addColumn("Fecha de ingreso:");
		modelo.addColumn("Estado de internamiento:");
		modelo.addColumn("Estado de cama:");
		
		
		tblrint.setModel(modelo);
		
		btnRegistrar = new JButton("REG.");
		btnRegistrar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btnRegistrar.setBackground(new Color(244, 164, 96));
		btnRegistrar.setIcon(new ImageIcon(DlgRInternamientos.class.getResource("/img/registrar.png")));
		btnRegistrar.setBounds(10, 115, 95, 42);
		getContentPane().add(btnRegistrar);
		
		btnEliminar = new JButton("ELI.");
		btnEliminar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btnEliminar.setBackground(new Color(244, 164, 96));
		btnEliminar.setIcon(new ImageIcon(DlgRInternamientos.class.getResource("/img/eliminar.png")));
		btnEliminar.setBounds(105, 115, 95, 42);
		getContentPane().add(btnEliminar);
		
		btnModificar = new JButton("MOD.");
		btnModificar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btnModificar.setBackground(new Color(244, 164, 96));
		btnModificar.setIcon(new ImageIcon(DlgRInternamientos.class.getResource("/img/modificar.png")));
		btnModificar.setBounds(200, 115, 117, 42);
		getContentPane().add(btnModificar);
		
		textField = new JTextField();
		textField.setBackground(new Color(210, 180, 140));
		textField.setEditable(false);
		textField.setBounds(10, 0, 564, 115);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(DlgRInternamientos.class.getResource("/img/hospital_int.jpg")));
		label.setBounds(537, 115, 37, 42);
		getContentPane().add(label);
		
		txtInternamientos = new JTextField();
		txtInternamientos.setEditable(false);
		txtInternamientos.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtInternamientos.setHorizontalAlignment(SwingConstants.CENTER);
		txtInternamientos.setText("INTERNAMIENTOS");
		txtInternamientos.setBackground(new Color(173, 216, 230));
		txtInternamientos.setBounds(315, 115, 212, 42);
		getContentPane().add(txtInternamientos);
		txtInternamientos.setColumns(10);
		
		

	}
}
