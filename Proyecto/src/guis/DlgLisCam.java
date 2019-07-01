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
		getContentPane().setBackground(SystemColor.activeCaption);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgLisCam.class.getResource("/img/TriCell.jpg")));
		setTitle("Listar Cama");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		lblListar = new JLabel("Cama");
		lblListar.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblListar.setBounds(166, 25, 51, 22);
		getContentPane().add(lblListar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 97, 350, 120);
		getContentPane().add(scrollPane);

		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);

		modelo = new DefaultTableModel();
		modelo.addColumn("N�mero de Cama:");
		modelo.addColumn("Categor�a:");
		modelo.addColumn("Precio por d�a:");
		modelo.addColumn("Estado:");

		table.setModel(modelo);

		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(147, 59, 97, 25);
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
