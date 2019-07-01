package guis;

import java.awt.EventQueue;
import javax.swing.JTable;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import Arreglo.ArregloCama;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import clase.Cama;
import libreria.Alerta;
import libreria.lib;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class DlgCama extends JDialog implements ActionListener, MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnIngresar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scrollPane;

	private static DefaultTableModel modelo;

	private JTable tableCama;
	private JLabel lblCategora;
	private JComboBox<?> cbxCategoria;
	private JLabel lblEstado;
	private JComboBox<?> cbxEstado;
	private JButton btnGuardar;
	private JButton btnBuscar;
	private JLabel lblNroCama;
	private JTextField txtCama;
	private JButton btnVerTodoslistar;
	private JButton btnConsultar;

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
					DlgCama dialog = new DlgCama();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
					dialog.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DlgCama() {
		setFont(new Font("Georgia", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgCama.class.getResource("/img/cama.png")));
		setTitle(" Cama - Clinica Bautista");
		getContentPane().setBackground(new Color(224, 255, 255));
		setForeground(Color.LIGHT_GRAY);
		setBounds(300, 100, 818, 733);
		getContentPane().setLayout(null);

		btnIngresar = new JButton("Adicionar");
		btnIngresar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(36, 31, 113, 29);
		getContentPane().add(btnIngresar);

		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnModificar.setIcon(new ImageIcon(DlgCama.class.getResource("/img/mantenimiento.png")));
		btnModificar.addActionListener(this);
		btnModificar.setBounds(321, 31, 133, 29);
		getContentPane().add(btnModificar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnEliminar.setIcon(
				new ImageIcon("G:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\eliminar.png"));
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(478, 31, 133, 29);
		getContentPane().add(btnEliminar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 337, 778, 257);
		getContentPane().add(scrollPane);

		tableCama = new JTable();
		tableCama.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tableCama.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(tableCama);
		tableCama.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tableCama.setFillsViewportHeight(true);
		tableCama.addMouseListener(this);

		modelo = new DefaultTableModel();
		modelo.addColumn("Número de Cama:");
		modelo.addColumn("Categoría:");
		modelo.addColumn("Precio por día:");
		modelo.addColumn("Estado:");
		tableCama.setModel(modelo);

		lblCategora = new JLabel("Categor\u00EDa:");
		lblCategora.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblCategora.setBounds(36, 205, 73, 21);
		getContentPane().add(lblCategora);

		cbxCategoria = new JComboBox();
		cbxCategoria.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		cbxCategoria.setEnabled(false);
		cbxCategoria.setModel(new DefaultComboBoxModel(new String[] { "B\u00E1sica", "Est\u00E1ndar", "Premium" }));
		cbxCategoria.setBounds(147, 202, 113, 26);
		getContentPane().add(cbxCategoria);

		lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblEstado.setBounds(36, 259, 54, 21);
		getContentPane().add(lblEstado);

		cbxEstado = new JComboBox();
		cbxEstado.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		cbxEstado.setEnabled(false);
		cbxEstado.setModel(new DefaultComboBoxModel(new String[] { "Libre", "Ocupado" }));
		cbxEstado.setBounds(147, 256, 113, 26);
		getContentPane().add(cbxEstado);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBorder(UIManager.getBorder("CheckBox.border"));
		btnGuardar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnGuardar.setIcon(new ImageIcon(DlgCama.class.getResource("/img/grabar.png")));
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(338, 626, 125, 33);
		getContentPane().add(btnGuardar);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnBuscar.setIcon(
				new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\consulta.png"));
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(301, 143, 90, 30);
		getContentPane().add(btnBuscar);

		lblNroCama = new JLabel("Nro Cama:");
		lblNroCama.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNroCama.setBounds(36, 149, 76, 21);
		getContentPane().add(lblNroCama);

		txtCama = new JTextField();
		txtCama.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtCama.setHorizontalAlignment(SwingConstants.CENTER);
		txtCama.setBackground(Color.WHITE);
		txtCama.setEditable(false);
		txtCama.setBounds(147, 147, 113, 26);
		getContentPane().add(txtCama);
		txtCama.setColumns(10);

		btnVerTodoslistar = new JButton("Listar");
		btnVerTodoslistar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnVerTodoslistar.setIcon(
				new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\registrar.png"));
		btnVerTodoslistar.addActionListener(this);
		btnVerTodoslistar.setBounds(680, 283, 90, 30);
		getContentPane().add(btnVerTodoslistar);

		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnConsultar.setBounds(172, 31, 113, 29);
		getContentPane().add(btnConsultar);

	}

	ArregloCama ac = new ArregloCama("cama.txt");

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(arg0);
		}
		if (arg0.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(arg0);
		}
		if (arg0.getSource() == btnVerTodoslistar) {
			actionPerformedBtnVerTodoslistar(arg0);
		}
		if (arg0.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar(arg0);
		}
		if (arg0.getSource() == btnIngresar) {
			actionPerformedBtnIngresar(arg0);
		}
	}

	protected void actionPerformedBtnIngresar(ActionEvent arg0) {
		habilitarCama(false);
		limpieza();
		txtCama.setText("" + ac.codigoCorrelativo());
		habilitarEntradas(true);

	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == tableCama) {
			mouseClickedTable(e);
		}
	}

	protected void mouseClickedTable(MouseEvent e) {
		habilitarEntradas(true);
		editarFila();
	}

	protected void actionPerformedBtnModificar(ActionEvent arg0) {
		try {
			int codigo = leerNumCama();
			Cama a = ac.buscar(codigo);
			if (a == null)
				mensaje("Selecciona un registro");
			else {
				habilitarEntradas(true);
			}

		} catch (Exception e1) {
			mensaje("Selecciona un registro");

		}

	}

	protected void actionPerformedBtnEliminar(ActionEvent arg0) {

		try {
			int numCama = leerNumCama();
			Cama a = ac.buscar(numCama);
			if (a == null)
				Alerta.mensaje(this, "Selecciona un registro");
			else {
				if (leerEstado() == 1) {
					mensaje("NO PUEDE ELIMINAR UN REGISTRO CON ESTADO OCUPADO");
				} else {
					int ok = Alerta.confirmar(this, "Esta seguro que desea eliminar " + leerNumCama());
					if (ok == 0) {
						ac.eliminar(a);
						listar();
						limpieza();
						habilitarEntradas(false);
					}
				}

				habilitarEntradas(false);
				limpieza();
			}
			habilitarEntradas(false);
			limpieza();

		} catch (Exception e1) {
			mensaje("Selecciona un registro");

		}

	}

	protected void actionPerformedBtnGuardar(ActionEvent arg0) {
		try {
			Cama a = ac.buscar(leerNumCama());
			if (a != null) {
				a.setCategoria(leerCategoria());
				a.setEstado(leerEstado());
				listar();
				limpieza();
				habilitarEntradas(false);
			} else {
				clase.Cama x = new clase.Cama(leerNumCama(), leerCategoria(), leerEstado());
				ac.adicionar(x);
				listar();
				limpieza();
				habilitarEntradas(false);
			}
		} catch (Exception e) {
			mensaje("No existen datos que agregar");

		}

	}

	protected void actionPerformedBtnVerTodoslistar(ActionEvent arg0) {
		listar();
	}

	protected void actionPerformedBtnConsultar(ActionEvent arg0) {
		habilitarCama(true);
		txtCama.requestFocus();
	}

	protected void actionPerformedBtnBuscar(ActionEvent arg0) {

		try {
			Cama a = ac.buscar(leerNumCama());
			if (a != null) {
				cbxCategoria.setSelectedIndex(a.getCategoria());
				cbxEstado.setSelectedIndex(a.getEstado());

			} else {
				mensaje("el CODIGO " + leerNumCama() + " no existe");
			}

			habilitarCama(false);

		} catch (Exception e1) {
			mensaje("habilite el campo N° de cama");
		}

	}

	void habilitarEntradas(boolean is) {
		cbxCategoria.setEnabled(is);
		cbxEstado.setEnabled(is);
	}

	void habilitarCama(boolean is) {
		txtCama.setEditable(is);
		// txtCama.requestFocus();
	}

	void limpieza() {
		txtCama.setText("");
		cbxEstado.setSelectedIndex(0);
		cbxCategoria.setSelectedIndex(0);

	}

	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}

	void editarFila() {

		if (ac.tamaño() == 0)
			limpieza();
		else {
			Cama x = ac.obtener(tableCama.getSelectedRow());
			txtCama.setText("" + x.getNcama());
			cbxCategoria.setSelectedIndex(x.getCategoria());
			cbxEstado.setSelectedIndex(x.getEstado());
		}

	}

	void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < ac.tamaño(); i++) {
			Object fila[] = { ac.obtener(i).getNcama(), ac.obtener(i).detalleCategoria(), ac.obtener(i).precioCama(),
					ac.obtener(i).detalleEstado() };
			modelo.addRow(fila);
		}
		;

	}

	int leerNumCama() {
		return Integer.parseInt(txtCama.getText().trim());
	}

	int leerCategoria() {
		return cbxCategoria.getSelectedIndex();
	}

	int leerEstado() {
		return cbxEstado.getSelectedIndex();
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
