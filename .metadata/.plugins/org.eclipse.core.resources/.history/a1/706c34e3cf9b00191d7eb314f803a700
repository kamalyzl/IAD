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

public class DlgRepInternamientosPagados extends JDialog {
	private JButton button;
	private JScrollPane scrollPane;
	private JTextField txtConsultasPagadas;
	private JTable tblrepintpag;
	private static DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgRepInternamientosPagados dialog = new DlgRepInternamientosPagados();
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
	public DlgRepInternamientosPagados() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgRepInternamientosPagados.class.getResource("/img/TriCell.jpg")));
		setTitle("Internamientos Pagados");
		setBounds(100, 100, 630, 300);
		getContentPane().setLayout(null);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(DlgRepInternamientosPagados.class.getResource("/img/generar.png")));
		button.setBounds(307, 0, 89, 38);
		getContentPane().add(button);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 38, 614, 223);
		getContentPane().add(scrollPane);
		
		tblrepintpag = new JTable();
		scrollPane.setViewportView(tblrepintpag);
		
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Cod. int.:");
		modelo.addColumn("Cod. pac.:");
		modelo.addColumn("Nombres:");
		modelo.addColumn("Apellidos:");
		modelo.addColumn("Fecha:");
		modelo.addColumn("Hr Ingreso:");
		modelo.addColumn("Fecha:");
		modelo.addColumn("Hr Salida:");
		modelo.addColumn("Total:");
		tblrepintpag.setModel(modelo);
		
		txtConsultasPagadas = new JTextField();
		txtConsultasPagadas.setText("               INTERNAMIENTOS                                            PAGADAS");
		txtConsultasPagadas.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		txtConsultasPagadas.setEditable(false);
		txtConsultasPagadas.setColumns(10);
		txtConsultasPagadas.setBackground(new Color(224, 255, 255));
		txtConsultasPagadas.setBounds(0, 0, 614, 38);
		getContentPane().add(txtConsultasPagadas);

	}
}
