package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class DlgRepConsultasPagadas extends JDialog {
	private JButton button;
	private JScrollPane scrollPane;
	private JTextField txtConsultasPendientes;
	private JTable tblrepconpag;
	private static DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgRepConsultasPagadas dialog = new DlgRepConsultasPagadas();
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
	public DlgRepConsultasPagadas() {
		setTitle("Consultas Pagadas");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgRepConsultasPagadas.class.getResource("/img/TriCell.jpg")));
		setBounds(100, 100, 630, 300);
		getContentPane().setLayout(null);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(DlgRepConsultasPagadas.class.getResource("/img/generar.png")));
		button.setBounds(307, 0, 89, 38);
		getContentPane().add(button);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 38, 614, 223);
		getContentPane().add(scrollPane);
		
		tblrepconpag = new JTable();
		scrollPane.setViewportView(tblrepconpag);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Cod. consulta:");
		modelo.addColumn("Cod. paciente:");
		modelo.addColumn("Nombres:");
		modelo.addColumn("Apellidos:");
		modelo.addColumn("Fecha:");
		modelo.addColumn("Hr. atención:");
		modelo.addColumn("Total Pagado:");
		
		tblrepconpag.setModel(modelo);
		
		txtConsultasPendientes = new JTextField();
		txtConsultasPendientes.setText("                     CONSULTAS                                               PENDIENTES");
		txtConsultasPendientes.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		txtConsultasPendientes.setEditable(false);
		txtConsultasPendientes.setColumns(10);
		txtConsultasPendientes.setBackground(new Color(245, 222, 179));
		txtConsultasPendientes.setBounds(0, 0, 614, 38);
		getContentPane().add(txtConsultasPendientes);

	}

}
