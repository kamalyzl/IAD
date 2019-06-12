package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DlgPConsultas extends JDialog {
	private JLabel lblPago;
	private JButton btnConsultar;
	private JButton btnSalir;
	private JComboBox comboBox;
	private JPanel panel;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgPConsultas dialog = new DlgPConsultas();
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
	public DlgPConsultas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgPConsultas.class.getResource("/img/TriCell.jpg")));
		setTitle("Consultas de Pago");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblPago = new JLabel("Pago:");
		lblPago.setBounds(10, 6, 60, 22);
		panel.add(lblPago);
		lblPago.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(208, 5, 109, 23);
		panel.add(btnConsultar);
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnSalir = new JButton("salir");
		btnSalir.setBounds(321, 5, 89, 23);
		panel.add(btnSalir);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		comboBox = new JComboBox();
		comboBox.setBounds(74, 8, 127, 20);
		panel.add(comboBox);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 39, 400, 200);
		panel.add(scrollPane);

	}

}
