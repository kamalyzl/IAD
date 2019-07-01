package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;

public class DlgRepConsultasPendientes extends JDialog {
	private JScrollPane scrollPane;
	private JTextField txtConsultasPendientes;
	private JTable tblrepconpen;
	private static DefaultTableModel modelo;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgRepConsultasPendientes dialog = new DlgRepConsultasPendientes();
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
	public DlgRepConsultasPendientes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgRepConsultasPendientes.class.getResource("/img/TriCell.jpg")));
		setTitle("Consultas Pendientes");
		setBounds(100, 100, 630, 300);
		getContentPane().setLayout(null);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(DlgRepConsultasPendientes.class.getResource("/img/generar.png")));
		btnNewButton.setBounds(247, 11, 89, 38);
		getContentPane().add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 49, 594, 201);
		getContentPane().add(scrollPane);
		
		tblrepconpen = new JTable();
		scrollPane.setViewportView(tblrepconpen);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Cod. consulta:");
		modelo.addColumn("Cod. paciente:");
		modelo.addColumn("Nombres:");
		modelo.addColumn("Apellidos:");
		modelo.addColumn("Fecha:");
		modelo.addColumn("Hr. atención:");
		
		tblrepconpen.setModel(modelo);
		
		
		txtConsultasPendientes = new JTextField();
		txtConsultasPendientes.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		txtConsultasPendientes.setEditable(false);
		txtConsultasPendientes.setText("           CONSULTAS                                               PENDIENTES");
		txtConsultasPendientes.setBackground(new Color(245, 222, 179));
		txtConsultasPendientes.setBounds(10, 11, 594, 38);
		getContentPane().add(txtConsultasPendientes);
		txtConsultasPendientes.setColumns(10);

	}
}
