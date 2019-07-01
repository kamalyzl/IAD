package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class DlgModPac extends JDialog {
	private JLabel lblPaciente;
	private JButton button_1;
	private JPanel panel;
	private JButton btnListar;
	private JButton btnSalir;
	private JScrollPane scrollPane;
	private JTable tblmodpac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgModPac dialog = new DlgModPac();
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
	public DlgModPac() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgModPac.class.getResource("/img/TriCell.jpg")));
		setTitle("Modificar Paciente");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblPaciente = new JLabel("Paciente:");
		lblPaciente.setBounds(32, 11, 115, 22);
		panel.add(lblPaciente);
		lblPaciente.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		button_1 = new JButton("Modificar");
		button_1.setBounds(169, 11, 89, 23);
		panel.add(button_1);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnListar.setBounds(258, 11, 89, 23);
		panel.add(btnListar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setBounds(349, 11, 75, 23);
		panel.add(btnSalir);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 47, 400, 200);
		panel.add(scrollPane);
		
		tblmodpac = new JTable();
		tblmodpac.setBackground(Color.LIGHT_GRAY);
		tblmodpac.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblmodpac.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblmodpac);

	}

}
