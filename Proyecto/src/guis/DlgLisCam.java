package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import Arreglo.ArregloCama;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class DlgLisCam extends JDialog implements ActionListener {
	private JLabel lblListar;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgLisCam dialog = new DlgLisCam();
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
	public DlgLisCam() {
		getContentPane().setBackground(new Color(224, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgLisCam.class.getResource("/img/TriCell.jpg")));
		setTitle("Lista Cama");
		setBounds(100, 100, 450, 373);
		getContentPane().setLayout(null);

		lblListar = new JLabel("Cama");
		lblListar.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblListar.setBounds(170, 29, 55, 23);
		getContentPane().add(lblListar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 128, 408, 185);
		getContentPane().add(scrollPane);
		
				table = new JTable();
				scrollPane.setViewportView(table);
				table.setBackground(Color.LIGHT_GRAY);
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setFillsViewportHeight(true);
				
						table.setModel(modelo);

		modelo = new DefaultTableModel();
		modelo.addColumn("N�mero de Cama:");
		modelo.addColumn("Categor�a:");
		modelo.addColumn("Precio por d�a:");
		modelo.addColumn("Estado:");

		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(151, 90, 102, 25);
		getContentPane().add(btnAgregar);
		listar();
	}

	ArregloCama ac = new ArregloCama("cama.txt");
	private JButton btnAgregar;

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAgregar) {
			actionPerformedBtnAgregar(arg0);
		}
	}

	protected void actionPerformedBtnAgregar(ActionEvent arg0) {

		DefaultTableModel tm = (DefaultTableModel) table.getModel();
		String dato = String.valueOf(tm.getValueAt(table.getSelectedRow(), 0));

		DlgRInternamientos.txtCama.setText(dato);

		dispose();
	}

	void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < ac.tama�o(); i++) {
			Object fila[] = { ac.obtener(i).getNcama(), ac.obtener(i).detalleCategoria(), ac.obtener(i).precioCama(),
					ac.obtener(i).detalleEstado() };
			modelo.addRow(fila);
		}
		;

	}

}
