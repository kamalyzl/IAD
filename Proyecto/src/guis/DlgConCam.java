package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

public class DlgConCam extends JDialog {
	private JLabel lblConsultar;
	private JComboBox comboBox;
	private JButton btnBuscar;
	private JScrollPane scrollPane;
	private JPanel contentPane;
	private JTable tblconcam;
	private DefaultTableModel modelo;
	private JLabel lblSeleccioneEl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgConCam dialog = new DlgConCam();
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
	public DlgConCam() {
		setTitle("Consultar Camas");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgConCam.class.getResource("/img/TriCell.jpg")));
		setBounds(100, 100, 420, 300);
		getContentPane().setLayout(null);
		
		contentPane = new JPanel();
		contentPane.setBounds(0, 0, 404, 261);
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		lblConsultar = new JLabel("Consultar:");
		lblConsultar.setBounds(27, 5, 94, 22);
		contentPane.add(lblConsultar);
		lblConsultar.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		comboBox = new JComboBox();
		comboBox.setBounds(162, 9, 103, 20);
		contentPane.add(comboBox);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(283, 8, 94, 23);
		contentPane.add(btnBuscar);
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 38, 350, 200);
		contentPane.add(scrollPane);
		
		tblconcam = new JTable();
		tblconcam.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblconcam.setBackground(Color.LIGHT_GRAY);
		tblconcam.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblconcam);
		
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Tipo Cama");
		modelo.addColumn("En uso");
		modelo.addColumn("Almácen");
		tblconcam.setModel(modelo);
		
		lblSeleccioneEl = new JLabel("(*) Seleccione el tipo de cama a consultar");
		lblSeleccioneEl.setForeground(Color.RED);
		lblSeleccioneEl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSeleccioneEl.setBounds(27, 236, 350, 14);
		contentPane.add(lblSeleccioneEl);

	}
}
