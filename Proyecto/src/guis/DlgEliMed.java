package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class DlgEliMed extends JDialog implements ActionListener {
	private JLabel label;
	private JLabel lblEliminar;
	private JButton btnEliminar;
	private JButton btnNewButton;
	private JButton btnSalir;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JTable tblelimed;
	private DefaultTableModel model;
	private JComboBox comboBox;
	private JLabel lblindiqueElTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgEliMed dialog = new DlgEliMed();
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
	public DlgEliMed() {
		setTitle("Eliminar Medicina");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgEliMed.class.getResource("/img/TriCell.jpg")));
		setBounds(100, 100, 500, 300);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 484, 261);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblEliminar = new JLabel("Eliminar:");
		lblEliminar.setBounds(0, -21, 71, 65);
		panel.add(lblEliminar);
		lblEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btnEliminar = new JButton("Buscar/Eliminar");
		btnEliminar.setBounds(335, 2, 139, 23);
		panel.add(btnEliminar);
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnNewButton = new JButton("Listar");
		btnNewButton.setBounds(336, 26, 138, 23);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(335, 49, 139, 23);
		panel.add(btnSalir);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		comboBox = new JComboBox();
		comboBox.setBounds(254, 2, 71, 70);
		panel.add(comboBox);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(254, 83, 220, 150);
		panel.add(scrollPane);
		
		tblelimed = new JTable();
		tblelimed.setBackground(Color.LIGHT_GRAY);
		tblelimed.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblelimed.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblelimed);
		
		model = new DefaultTableModel();
		model.addColumn("Tipo:");
		model.addColumn("Descripción");
		model.addColumn("Cantidad:");
		tblelimed.setModel(model);
		
		label = new JLabel("");
		label.setBounds(0, 0, 484, 261);
		panel.add(label);
		label.setIcon(new ImageIcon(DlgEliMed.class.getResource("/img/SV8.jpg")));
		
		lblindiqueElTipo = new JLabel("(*)Indique el tipo de medicina que desea eliminar.");
		lblindiqueElTipo.setForeground(Color.RED);
		lblindiqueElTipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblindiqueElTipo.setBounds(0, 247, 474, 14);
		panel.add(lblindiqueElTipo);

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
