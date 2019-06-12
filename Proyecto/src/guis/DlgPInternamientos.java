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
import java.awt.Color;

public class DlgPInternamientos extends JDialog {
	private JLabel lblPagosPorInternamientos;
	private JComboBox comboBox;
	private JButton btnConsultar;
	private JLabel lblCdigo;
	private JComboBox comboBox_1;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;

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
		setBounds(100, 100, 300, 300);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 284, 261);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblPagosPorInternamientos = new JLabel("Modalidad de Pago");
		lblPagosPorInternamientos.setBounds(42, 6, 130, 17);
		panel.add(lblPagosPorInternamientos);
		lblPagosPorInternamientos.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		comboBox = new JComboBox();
		comboBox.setBounds(177, 5, 83, 20);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cuota", "Mensual"}));
		comboBox.setToolTipText("");
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(10, 30, 128, 23);
		panel.add(btnConsultar);
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setBounds(143, 33, 54, 17);
		panel.add(lblCdigo);
		lblCdigo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(202, 31, 58, 20);
		panel.add(comboBox_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 64, 250, 180);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		table.setFillsViewportHeight(true);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setViewportView(table);

	}
}
