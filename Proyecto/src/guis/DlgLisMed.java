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
	private JLabel lblListar;
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
		getContentPane().setBackground(new Color(224, 255, 255));
		setTitle("Listar Medicina");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgLisMed.class.getResource("/img/TriCell.jpg")));
		setBounds(100, 100, 450, 416);
		getContentPane().setLayout(null);
		
		lblListar = new JLabel("Medicamento");
		lblListar.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblListar.setBounds(143, 43, 150, 22);
		getContentPane().add(lblListar);
		
		btnSalir = new JButton("Agregar");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnSalir.setBounds(163, 98, 89, 23);
		getContentPane().add(btnSalir);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 175, 408, 181);
		getContentPane().add(scrollPane);
		
		tbllismed = new JTable();
		tbllismed.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tbllismed.setFillsViewportHeight(true);
		tbllismed.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(tbllismed);

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
