package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class DlgRConsultas extends JDialog {
	private JTable table;
	private JLabel lblConsulta;
	private JComboBox comboBox;
	private JButton button;
	private JButton button_1;
	private JLabel lblIndiqueSu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgRConsultas dialog = new DlgRConsultas();
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
	public DlgRConsultas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgRConsultas.class.getResource("/img/TriCell.jpg")));
		setTitle("Consultas Medicas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(25, 83, 338, 120);
		getContentPane().add(table);
		
		lblConsulta = new JLabel("Consulta:");
		lblConsulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConsulta.setBounds(25, 56, 95, 22);
		getContentPane().add(lblConsulta);
		
		comboBox = new JComboBox();
		comboBox.setBounds(130, 60, 66, 20);
		getContentPane().add(comboBox);
		
		button = new JButton("consultar");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBounds(206, 59, 95, 23);
		getContentPane().add(button);
		
		button_1 = new JButton("salir");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBounds(306, 59, 57, 23);
		getContentPane().add(button_1);
		
		lblIndiqueSu = new JLabel("(*) Indique su c\u00F3digo para acceder a la consulta");
		lblIndiqueSu.setBounds(25, 214, 350, 14);
		getContentPane().add(lblIndiqueSu);

	}

}
