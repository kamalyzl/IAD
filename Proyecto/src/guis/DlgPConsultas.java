package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgPConsultas extends JDialog implements ActionListener {
	private JButton btnConsultar;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JLabel lblEstadoDeLa;
	private JComboBox comboBox_1;
	private JTable tblpcon;
	private static DefaultTableModel modelo;
	private JButton btnCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgPConsultas dialog = new DlgPConsultas();
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
	public DlgPConsultas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgPConsultas.class.getResource("/img/TriCell.jpg")));
		setTitle("Consultas de Pago");
		setBounds(100, 100, 450, 411);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 434, 364);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(166, 104, 96, 22);
		panel.add(comboBox_1);
		
		lblEstadoDeLa = new JLabel("Estado:");
		lblEstadoDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstadoDeLa.setBounds(58, 101, 96, 26);
		panel.add(lblEstadoDeLa);
		
		btnConsultar = new JButton("");
		btnConsultar.setIcon(new ImageIcon(DlgPConsultas.class.getResource("/img/consulta.png")));
		btnConsultar.setBounds(346, 74, 53, 50);
		panel.add(btnConsultar);
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 154, 410, 174);
		panel.add(scrollPane);
		
		tblpcon = new JTable();
		tblpcon.setBackground(Color.GRAY);
		scrollPane.setViewportView(tblpcon);
		
		
		modelo = new DefaultTableModel();
		modelo.addColumn("C�digo de consulta:");
		modelo.addColumn("Detalle de la receta:");
		modelo.addColumn("Total a pagar:");
		tblpcon.setModel(modelo);
		
		btnCodigo = new JButton("Codigo");
		btnCodigo.addActionListener(this);
		btnCodigo.setBounds(136, 44, 96, 26);
		panel.add(btnCodigo);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCodigo) {
			actionPerformedBtnCodigo(arg0);
		}
	}
	protected void actionPerformedBtnCodigo(ActionEvent arg0) {
	}
}
