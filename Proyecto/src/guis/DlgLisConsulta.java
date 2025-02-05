package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Arreglo.ArregloConsulta;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DlgLisConsulta extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnAgregar;
	private JLabel lblListaDeConsultas;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgLisConsulta dialog = new DlgLisConsulta();
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
	public DlgLisConsulta() {
		setBounds(100, 100, 450, 463);

		panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 172, 408, 231);
		panel.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		modelo = new DefaultTableModel();
		modelo.addColumn("Cod. consulta:");
		modelo.addColumn("Cod. paciente:");
		modelo.addColumn("Fecha atenci�n:");
		modelo.addColumn("Hora atenci�n:");
		modelo.addColumn("Total a Pagar:");
		modelo.addColumn("Estado atenci�n:");

		table.setModel(modelo);

		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(157, 95, 97, 39);
		panel.add(btnAgregar);

		lblListaDeConsultas = new JLabel("Lista de consultas");
		lblListaDeConsultas.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblListaDeConsultas.setBounds(137, 32, 139, 19);
		panel.add(lblListaDeConsultas);
		listar();

	}

	ArregloConsulta ac = new ArregloConsulta("consulta.txt");

	void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < ac.tama�o(); i++) {
			Object[] fila = { ac.obtener(i).getCodigoConsulta(), ac.obtener(i).getCodigoPaciente(),
					ac.obtener(i).getFechaAtencion(), ac.obtener(i).getHoraAtencion(), ac.obtener(i).getTotalPagar(),
					ac.obtener(i).detalleEstado() };
			modelo.addRow(fila);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAgregar) {
			actionPerformedBtnAgregar(e);
		}
	}
	protected void actionPerformedBtnAgregar(ActionEvent e) {
		
		DefaultTableModel tm = (DefaultTableModel) table.getModel();
		String dato = String.valueOf(tm.getValueAt(table.getSelectedRow(), 0));
		String dato2 = String.valueOf(tm.getValueAt(table.getSelectedRow(), 1));

		System.out.println(dato);
		System.out.println(dato2);
		DlgPConsultas.txtCodigo.setText(dato);

		dispose();
	}
}
