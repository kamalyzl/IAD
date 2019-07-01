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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class DlgLisMed extends JDialog implements ActionListener {
	private JLabel label;
	private JLabel lblListar;
	private JButton btnListar;
	private JButton btnSalir;
	private JScrollPane scrollPane;
	private JTable tbllismed;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgLisMed dialog = new DlgLisMed();
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
	public DlgLisMed() {
		setTitle("Listar Medicina");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgLisMed.class.getResource("/img/TriCell.jpg")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblListar = new JLabel("Medicamento:");
		lblListar.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblListar.setBounds(20, 70, 150, 22);
		getContentPane().add(lblListar);
		
		btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnListar.setBounds(193, 73, 89, 23);
		getContentPane().add(btnListar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setBounds(281, 73, 89, 23);
		getContentPane().add(btnSalir);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 106, 350, 120);
		getContentPane().add(scrollPane);
		
		tbllismed = new JTable();
		tbllismed.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tbllismed.setFillsViewportHeight(true);
		tbllismed.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(tbllismed);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(DlgLisMed.class.getResource("/img/SV9.jpg")));
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
