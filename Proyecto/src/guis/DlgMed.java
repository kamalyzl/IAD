package guis;

import java.awt.EventQueue;

import Arreglo.ArregloMedicina;
import clase.Medicina;
import libreria.Alerta;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class DlgMed extends JDialog implements ActionListener, MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lblPreciounitario;
	private JButton btnAdicionar;
	private static DefaultTableModel modelo;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnListar;
	private JLabel lblCdigo;
	private JTable tblmed;
	private JButton btnGrabar;
	private JLabel lblLaboratorio;
	private JTextField txtLaboratorio;
	private JLabel lblStock;
	private JTextField txtStock;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JButton btnBuscar;
	private JScrollPane scrollPane;
	private JTextField txtPrecioUnitario;
	private JTextField txtCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgMed dialog = new DlgMed();
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
	public DlgMed() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgMed.class.getResource("/img/medicina.jpg")));
		setTitle("Medicamentos:");
		setBounds(100, 100, 755, 736);
		getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 737, 689);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "", TitledBorder.LEFT, TitledBorder.TOP,
				null, new Color(0, 0, 0)));
		getContentPane().add(panel);
		panel.setLayout(null);

		lblPreciounitario = new JLabel("Precio/unitario:");
		lblPreciounitario.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblPreciounitario.setBounds(32, 246, 99, 17);
		panel.add(lblPreciounitario);

		modelo = new DefaultTableModel();
		modelo.addColumn("Codigo:");
		modelo.addColumn("Nombre:");
		modelo.addColumn("Laboratorio:");
		modelo.addColumn("Precio");
		modelo.addColumn("Stock:");
		

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setIcon(
				new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\bin\\img\\ingresar.png"));
		btnAdicionar.setBounds(23, 23, 128, 33);
		btnAdicionar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnAdicionar.setBackground(Color.WHITE);
		panel.add(btnAdicionar);

		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnConsultar.addActionListener(this);
		btnConsultar.setIcon(new ImageIcon(DlgMed.class.getResource("/img/consulta.png")));
		btnConsultar.setBounds(175, 23, 146, 33);
		btnConsultar.setBackground(new Color(238, 232, 170));
		panel.add(btnConsultar);

		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnModificar.addActionListener(this);
		btnModificar.setIcon(new ImageIcon(DlgMed.class.getResource("/img/modificar.png")));
		btnModificar.setBounds(352, 23, 158, 33);
		btnModificar.setBackground(new Color(238, 232, 170));
		panel.add(btnModificar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnEliminar.addActionListener(this);
		btnEliminar.setIcon(new ImageIcon(DlgMed.class.getResource("/img/eliminar.png")));
		btnEliminar.setBounds(528, 23, 158, 33);
		btnEliminar.setBackground(new Color(238, 232, 170));
		panel.add(btnEliminar);

		btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnListar.addActionListener(this);
		btnListar.setIcon(new ImageIcon(DlgMed.class.getResource("/img/registrar.png")));
		btnListar.setBounds(552, 292, 134, 33);
		btnListar.setBackground(new Color(238, 232, 170));
		panel.add(btnListar);

		lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(32, 107, 60, 30);
		lblCdigo.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		panel.add(lblCdigo);

		btnGrabar = new JButton("Guardar");
		btnGrabar.setBorder(UIManager.getBorder("CheckBox.border"));
		btnGrabar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(294, 631, 124, 33);
		panel.add(btnGrabar);

		lblLaboratorio = new JLabel("Laboratorio");
		lblLaboratorio.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblLaboratorio.setBounds(32, 205, 76, 17);
		panel.add(lblLaboratorio);

		txtLaboratorio = new JTextField();
		txtLaboratorio.setBounds(159, 195, 197, 22);
		panel.add(txtLaboratorio);
		txtLaboratorio.setColumns(10);

		lblStock = new JLabel("Stock");
		lblStock.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblStock.setBounds(32, 300, 56, 16);
		panel.add(lblStock);

		txtStock = new JTextField();
		txtStock.setBounds(159, 294, 197, 22);
		panel.add(txtStock);
		txtStock.setColumns(10);

		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNombre.setBounds(32, 154, 56, 16);
		panel.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(159, 152, 197, 22);
		panel.add(txtNombre);
		txtNombre.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(334, 103, 97, 25);
		panel.add(btnBuscar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 332, 702, 260);
		panel.add(scrollPane);

		tblmed = new JTable();
		scrollPane.setViewportView(tblmed);
		tblmed.addMouseListener(this);
		tblmed.setBackground(new Color(192, 192, 192));
		tblmed.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblmed.setFillsViewportHeight(true);
		tblmed.setModel(modelo);

		txtPrecioUnitario = new JTextField();
		txtPrecioUnitario.setBounds(159, 243, 197, 22);
		panel.add(txtPrecioUnitario);
		txtPrecioUnitario.setColumns(10);

		txtCodigo = new JTextField();
		txtCodigo.setBounds(159, 105, 116, 22);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);

		habilitarEntradas(false);
		habilitarCodigo(false);

	}

	ArregloMedicina amed = new ArregloMedicina("medicina.txt");

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		if (arg0.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(arg0);
		}
	}

	protected void actionPerformedBtnBuscar(ActionEvent arg0) {

		try {
			Medicina a = amed.buscar(leerCodigo());
			if (a != null) {
				txtNombre.setText("" + a.getNombre());
				txtLaboratorio.setText("" + a.getLaboratorio());
				txtPrecioUnitario.setText("" + a.getPrecioUnitario());
				txtStock.setText("" + a.getStock());

			} else {
				mensaje("el CODIGO " + leerCodigo() + " no existe");
			}

			habilitarCodigo(false);

		} catch (Exception e1) {
			mensaje("Ingrese un código");
		}

	}

	protected void actionPerformedBtnGrabar(ActionEvent arg0) {
		try {
			Medicina a = amed.buscar(leerCodigo());
			if (a != null) {
				a.setNombre(leerNombre());
				a.setLaboratorio(leerLaboratorio());
				a.setPrecioUnitario(leerPrecioUnitario());
				a.setStock(leerStock());
				listar();
				limpieza();
				habilitarEntradas(false);
				habilitarCodigo(false);
			} else {
				clase.Medicina x = new clase.Medicina(leerCodigo(), leerNombre(), leerLaboratorio(),
						leerPrecioUnitario(), leerStock());
				amed.adicionar(x);
				listar();
				limpieza();
				habilitarEntradas(false);
				habilitarCodigo(false);
			}
		} catch (Exception e) {
			mensaje("No existen datos que agregar");

		}
	}

	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		limpieza();
		txtCodigo.setText("" + amed.codigoCorrelativo());
		habilitarEntradas(true);
	}

	protected void actionPerformedBtnConsultar(ActionEvent arg0) {
		limpieza();
		habilitarCodigo(true);
		habilitarEntradas(false);
	}

	protected void actionPerformedBtnModificar(ActionEvent arg0) {

		try {
			int codigo = leerCodigo();
			Medicina a = amed.buscar(codigo);
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
			int codigo = leerCodigo();
			Medicina a = amed.buscar(codigo);
			if (a == null)
				Alerta.mensaje(this, "Selecciona un registro");
			else {

				int ok = Alerta.confirmar(this, "Esta seguro que desea eliminar " + leerCodigo());
				if (ok == 0) {
					amed.eliminar(a);
					listar();
					limpieza();
					habilitarEntradas(false);
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

	protected void actionPerformedBtnListar(ActionEvent arg0) {
		listar();
	}

	void habilitarEntradas(boolean is) {
		txtNombre.setEditable(is);
		txtLaboratorio.setEditable(is);
		txtStock.setEditable(is);
		txtPrecioUnitario.setEditable(is);
	}

	void habilitarCodigo(boolean is) {
		txtCodigo.setEditable(is);
		txtCodigo.requestFocus();
	}

	void limpieza() {
		txtCodigo.setText("");
		txtNombre.setText("");
		txtLaboratorio.setText("");
		txtPrecioUnitario.setText("");
		txtStock.setText("");

	}

	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}

	void editarFila() {

		if (amed.tamaño() == 0)
			limpieza();
		else {
			Medicina x = amed.obtener(tblmed.getSelectedRow());
			txtCodigo.setText("" + x.getCodigoMedicina());
			txtNombre.setText("" + x.getNombre());
			txtLaboratorio.setText("" + x.getLaboratorio());
			txtPrecioUnitario.setText("" + x.getPrecioUnitario());
			txtStock.setText("" + x.getStock());
		}

	}

	void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < amed.tamaño(); i++) {
			Object fila[] = { amed.obtener(i).getCodigoMedicina(), amed.obtener(i).getNombre(),
					amed.obtener(i).getLaboratorio(), amed.obtener(i).getPrecioUnitario(), amed.obtener(i).getStock() };
			modelo.addRow(fila);
		}
		;

	}

	int leerCodigo() {
		return Integer.parseInt(txtCodigo.getText().trim());
	}

	String leerNombre() {
		return txtNombre.getText().trim();
	}

	String leerLaboratorio() {
		return txtLaboratorio.getText().trim();
	}

	int leerStock() {
		return Integer.parseInt(txtStock.getText().trim());
	}

	double leerPrecioUnitario() {
		return Double.parseDouble(txtPrecioUnitario.getText().trim());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == tblmed) {
			mouseClickedTable(e);
		}
	}

	protected void mouseClickedTable(MouseEvent e) {
		habilitarEntradas(true);
		editarFila();
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
