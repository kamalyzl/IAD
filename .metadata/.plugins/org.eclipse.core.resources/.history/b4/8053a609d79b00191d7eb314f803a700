package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class DlgModMed extends JDialog {
	private JLabel lblMedicina;
	private JButton button;
	private JButton button_1;
	private JScrollPane scrollPane;
	private JTable tblmodmed;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgModMed dialog = new DlgModMed();
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
	public DlgModMed() {
		setTitle("Modificar Medicina");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgModMed.class.getResource("/img/TriCell.jpg")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblMedicina = new JLabel("Medicina:");
		lblMedicina.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMedicina.setBounds(38, 11, 100, 22);
		getContentPane().add(lblMedicina);
		
		button = new JButton("Buscar/Listar");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBounds(137, 45, 135, 23);
		getContentPane().add(button);
		
		button_1 = new JButton("Modificar");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBounds(271, 45, 89, 23);
		getContentPane().add(button_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 86, 350, 150);
		getContentPane().add(scrollPane);
		
		tblmodmed = new JTable();
		tblmodmed.setBackground(Color.LIGHT_GRAY);
		tblmodmed.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblmodmed.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblmodmed);

	}

}
