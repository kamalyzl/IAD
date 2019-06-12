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
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgLisCam extends JDialog implements ActionListener {
	private JLabel label;
	private JLabel lblListar;
	private JButton btnListar;
	private JButton btnSalir;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgLisCam.class.getResource("/img/TriCell.jpg")));
		setTitle("Listar Cama");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblListar = new JLabel("           Cama:");
		lblListar.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblListar.setBounds(26, 58, 174, 22);
		getContentPane().add(lblListar);
		
		btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnListar.setBounds(198, 57, 89, 23);
		getContentPane().add(btnListar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setBounds(288, 57, 76, 23);
		getContentPane().add(btnSalir);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 97, 350, 120);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(DlgLisCam.class.getResource("/img/SV9.jpg")));
		label.setBounds(0, 0, 434, 261);
		getContentPane().add(label);

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnSalir) {
			actionPerformedBtnSalir(arg0);
		}
	}
	protected void actionPerformedBtnSalir(ActionEvent arg0) {
		System.exit(0);
	}
}
