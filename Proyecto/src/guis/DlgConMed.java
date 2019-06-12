package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;

public class DlgConMed extends JDialog implements ActionListener {
	private JLabel lblNombre;
	private JButton btnConsultar;
	private JScrollPane scrollPane;
	private JPanel contentPane;
	private JTable tblconmed;
	private JButton btnSalir;
	private DefaultTableModel modelo; 
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgConMed dialog = new DlgConMed();
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
	public DlgConMed() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(255, 255, 255));
		setTitle("Consultar Medicamento");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgConMed.class.getResource("/img/TriCell.jpg")));
		setBounds(100, 100, 750, 300);
		getContentPane().setLayout(null);
		
		contentPane = new JPanel();
		contentPane.setBounds(0, 0, 734, 261);
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("Tipo de Medicamento:");
		lblNombre.setBounds(10, 8, 228, 57);
		contentPane.add(lblNombre);
		lblNombre.setForeground(Color.DARK_GRAY);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 695, 162);
		contentPane.add(scrollPane);
		
	
		
		tblconmed = new JTable();
		tblconmed.setBackground(Color.LIGHT_GRAY);
		tblconmed.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblconmed.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblconmed);
		
		modelo = new  DefaultTableModel();
		//Es el codigo del medicamento debe ser de 8 digitos
		modelo.addColumn("EXPEDIENTE:");
		//información del producto
		modelo.addColumn("PRODUCTO:");
		//farmaceutica elaboradora
		modelo.addColumn("TITULAR:");
		//fecha de expedicion
		modelo.addColumn("FE:");
		//fecha de vencimiento
		modelo.addColumn("FV:");
		//unidades en stock
		modelo.addColumn("CANTIDAD");
		//descrpcion comercial
		modelo.addColumn("DESCRIPCION:");
		
		tblconmed.setModel(modelo);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(523, 10, 92, 57);
		contentPane.add(btnConsultar);
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setBounds(625, 9, 80, 58);
		contentPane.add(btnSalir);
		
		comboBox = new JComboBox();
		comboBox.setBounds(248, 10, 265, 57);
		contentPane.add(comboBox);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			actionPerformedBtnSalir(e);
		}
	}
	protected void actionPerformedBtnSalir(ActionEvent e) {
		System.exit(0);
	}
}
