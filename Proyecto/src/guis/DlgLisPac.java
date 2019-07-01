package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import Arreglo.ArregloPaciente;
import javax.swing.UIManager;

public class DlgLisPac extends JDialog implements ActionListener, MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblPaciente;
	private JButton bntAdd;
	private JScrollPane scrollPane;
	private JTable tbllispac;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgLisPac dialog = new DlgLisPac();
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
	public DlgLisPac() {
		getContentPane().setBackground(new Color(224, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgLisPac.class.getResource("/img/TriCell.jpg")));
		setTitle("Listar Paciente");
		setBounds(100, 100, 450, 416);
		getContentPane().setLayout(null);

		lblPaciente = new JLabel("PACIENTE");
		lblPaciente.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblPaciente.setBounds(157, 34, 81, 23);
		getContentPane().add(lblPaciente);

		bntAdd = new JButton("Agregar");
		bntAdd.setBorder(UIManager.getBorder("CheckBox.border"));
		bntAdd.addActionListener(this);
		bntAdd.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		bntAdd.setBounds(126, 95, 154, 34);
		getContentPane().add(bntAdd);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 173, 408, 183);
		getContentPane().add(scrollPane);

		tbllispac = new JTable();
		tbllispac.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tbllispac.setBackground(Color.LIGHT_GRAY);
		tbllispac.setFillsViewportHeight(true);

		scrollPane.setViewportView(tbllispac);

		modelo = new DefaultTableModel();
		modelo.addColumn("Codigo:");
		modelo.addColumn("Nombres:");
		modelo.addColumn("Apellidos:");
		modelo.addColumn("Telefono:");
		modelo.addColumn("DNI:");

		tbllispac.setModel(modelo);

		listar();

	}

	ArregloPaciente ap = new ArregloPaciente("paciente.txt");

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == bntAdd) {
			actionPerformedBntAdd(arg0);
		}
	}

	void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < ap.tamaño(); i++) {
			Object fila[] = { ap.obtener(i).getCodigoPaciente(), ap.obtener(i).getNombres(),
					ap.obtener(i).getApellidos(), ap.obtener(i).getTelefono(), ap.obtener(i).getDni() };
			modelo.addRow(fila);
		}
		;

	}

	protected void actionPerformedBntAdd(ActionEvent arg0) {
		DefaultTableModel tm = (DefaultTableModel) tbllispac.getModel();
		String dato = String.valueOf(tm.getValueAt(tbllispac.getSelectedRow(), 0));

		DlgRConsultas.txtPaciente.setText(dato);

		dispose();

	}

	protected void mouseClickedTable(MouseEvent e) {
		// habilitarEntradas(true);
		// editarFila();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == tbllispac) {
			mouseClickedTable(e);
		}

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
}
