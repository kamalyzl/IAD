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
	private static DefaultTableModel modelo;
	private JLabel lblNewLabel;
	private JLabel lblEstado;
	private JComboBox comboBox_1;
	private JButton btnConsultar;
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
		setBounds(100, 100, 554, 613);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 536, 566);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		comboBox.setBounds(159, 95, 93, 20);
		panel.add(comboBox);
		comboBox.setToolTipText("");
		
		lblCdigo = new JLabel("Codigo");
		lblCdigo.setBounds(28, 48, 54, 17);
		panel.add(lblCdigo);
		lblCdigo.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		
		cbocod = new JComboBox();
		cbocod.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		cbocod.setBounds(109, 46, 98, 20);
		panel.add(cbocod);
		
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Cod. internamiento:");
		modelo.addColumn("Fecha:");
		modelo.addColumn("Precio por día:");
		modelo.addColumn("Total a pagar:");

		
		lblNewLabel = new JLabel("E. internamiento");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel.setBounds(28, 97, 119, 17);
		panel.add(lblNewLabel);
		
		lblEstado = new JLabel("E. cama");
		lblEstado.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblEstado.setBounds(28, 139, 84, 14);
		panel.add(lblEstado);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		comboBox_1.setBounds(159, 136, 93, 20);
		panel.add(comboBox_1);
		
		btnConsultar = new JButton("");
		btnConsultar.setIcon(new ImageIcon(DlgPInternamientos.class.getResource("/img/consulta.png")));
		btnConsultar.setBounds(454, 192, 40, 30);
		panel.add(btnConsultar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 257, 514, 235);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(table);

	}
}
