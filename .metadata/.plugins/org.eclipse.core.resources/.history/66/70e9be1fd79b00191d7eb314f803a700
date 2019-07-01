package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class DlgAdiPac extends JDialog {
	private JLabel lblNewLabel;
	private JLabel lblAdicionar;
	private JTextField textField;
	private JLabel lblCdigo;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblApellidos;
	private JTextField textField_2;
	private JLabel lblSala;
	private JComboBox comboBox;
	private JLabel lblCuarto;
	private JComboBox comboBox_1;
	private JLabel lblCamas;
	private JComboBox comboBox_2;
	private JButton btnIngresar;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgAdiPac dialog = new DlgAdiPac();
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
	public DlgAdiPac() {
		setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgAdiPac.class.getResource("/img/TriCell.jpg")));
		setTitle("Adicionar Paciente Tricell Pharma");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblAdicionar = new JLabel("**AGREGAR PACIENTE**");
		lblAdicionar.setBackground(Color.DARK_GRAY);
		lblAdicionar.setForeground(Color.DARK_GRAY);
		lblAdicionar.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdicionar.setBounds(10, 0, 200, 24);
		getContentPane().add(lblAdicionar);
		
		textField = new JTextField();
		textField.setBounds(124, 35, 86, 24);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCdigo.setBounds(10, 35, 86, 19);
		getContentPane().add(lblCdigo);
		
		lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 65, 104, 19);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(124, 65, 86, 24);
		getContentPane().add(textField_1);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblApellidos.setBounds(220, 70, 96, 19);
		getContentPane().add(lblApellidos);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(313, 67, 86, 24);
		getContentPane().add(textField_2);
		
		lblSala = new JLabel("Sala:");
		lblSala.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSala.setBounds(10, 107, 55, 19);
		getContentPane().add(lblSala);
		
		comboBox = new JComboBox();
		comboBox.setBounds(124, 109, 86, 20);
		getContentPane().add(comboBox);
		
		lblCuarto = new JLabel("Cuarto:");
		lblCuarto.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCuarto.setBounds(220, 112, 86, 19);
		getContentPane().add(lblCuarto);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(313, 109, 86, 20);
		getContentPane().add(comboBox_1);
		
		lblCamas = new JLabel("Camas:");
		lblCamas.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCamas.setBounds(10, 149, 86, 19);
		getContentPane().add(lblCamas);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(124, 151, 86, 20);
		getContentPane().add(comboBox_2);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnIngresar.setBounds(220, 227, 89, 23);
		getContentPane().add(btnIngresar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setBounds(310, 227, 89, 23);
		getContentPane().add(btnSalir);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Z3r0Limited\\Documents\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\SV3.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		getContentPane().add(lblNewLabel);

	}

}
