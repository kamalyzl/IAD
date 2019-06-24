package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DlgPInternamientos extends JDialog {
	private JComboBox comboBox;
	private JLabel lblCdigo;
	private JComboBox cbocod;
	private JPanel panel;
	private JScrollPane scrollPane;
	private static DefaultTableModel modelo;
	private JTable tblpagint;
	private JLabel lblNewLabel;
	private JLabel lblEstado;
	private JComboBox comboBox_1;
	private JButton btnConsultar;
	private JLabel lblFecha;
	private JLabel lblHoraDeSalida;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private JTextField txthrs;
	private JTextField textField;
	private JLabel lblboticaBautista;
	private JLabel lblservicioDeInternamiento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgPInternamientos dialog = new DlgPInternamientos();
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
	public DlgPInternamientos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgPInternamientos.class.getResource("/img/TriCell.jpg")));
		setTitle("Pagos por internamiento");
		setBounds(100, 100, 483, 441);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 457, 391);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblboticaBautista = new JLabel("\"Botica Bautista\"");
		lblboticaBautista.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
		lblboticaBautista.setHorizontalAlignment(SwingConstants.CENTER);
		lblboticaBautista.setBounds(243, 36, 204, 73);
		panel.add(lblboticaBautista);
		
		lblservicioDeInternamiento = new JLabel("Servicio de internamiento");
		lblservicioDeInternamiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblservicioDeInternamiento.setFont(new Font("Sitka Subheading", Font.PLAIN, 14));
		lblservicioDeInternamiento.setBounds(242, 109, 215, 40);
		panel.add(lblservicioDeInternamiento);
		
		comboBox = new JComboBox();
		comboBox.setBounds(114, 33, 58, 20);
		panel.add(comboBox);
		comboBox.setToolTipText("");
		
		lblCdigo = new JLabel("Codigo:");
		lblCdigo.setBounds(10, 5, 54, 17);
		panel.add(lblCdigo);
		lblCdigo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		cbocod = new JComboBox();
		cbocod.setBounds(114, 5, 58, 20);
		panel.add(cbocod);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 178, 457, 213);
		panel.add(scrollPane);
		
		tblpagint = new JTable();
		tblpagint.setBackground(Color.LIGHT_GRAY);
		tblpagint.setFillsViewportHeight(true);
		tblpagint.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setViewportView(tblpagint);
		
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Cod. internamiento:");
		modelo.addColumn("Fecha:");
		modelo.addColumn("Precio por d�a:");
		modelo.addColumn("Total a pagar:");
		tblpagint.setModel(modelo);

		
		lblNewLabel = new JLabel("E. internamiento");
		lblNewLabel.setBounds(10, 39, 94, 14);
		panel.add(lblNewLabel);
		
		lblEstado = new JLabel("E. cama:");
		lblEstado.setBounds(10, 120, 64, 14);
		panel.add(lblEstado);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(114, 120, 58, 20);
		panel.add(comboBox_1);
		
		btnConsultar = new JButton("");
		btnConsultar.setIcon(new ImageIcon(DlgPInternamientos.class.getResource("/img/consulta.png")));
		btnConsultar.setBounds(154, 148, 40, 30);
		panel.add(btnConsultar);
		
		lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(10, 62, 46, 14);
		panel.add(lblFecha);
		
		lblHoraDeSalida = new JLabel("Hora de salida:");
		lblHoraDeSalida.setBounds(10, 95, 94, 14);
		panel.add(lblHoraDeSalida);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(115, 62, 40, 20);
		panel.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(154, 62, 40, 20);
		panel.add(comboBox_3);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setBounds(193, 62, 40, 20);
		panel.add(comboBox_4);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setBounds(114, 95, 40, 20);
		panel.add(comboBox_5);
		
		comboBox_6 = new JComboBox();
		comboBox_6.setBounds(152, 95, 40, 20);
		panel.add(comboBox_6);
		
		txthrs = new JTextField();
		txthrs.setEditable(false);
		txthrs.setText("HRS");
		txthrs.setBounds(192, 95, 40, 20);
		panel.add(txthrs);
		txthrs.setColumns(10);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(new Color(222, 184, 135));
		textField.setBounds(0, 0, 468, 178);
		panel.add(textField);
		textField.setColumns(10);

	}
}
