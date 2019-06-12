package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class DlgLisPac extends JDialog implements ActionListener {
	private JLabel label;
	private JLabel lblPaciente;
	private JButton button;
	private JButton btnSalir;
	private JScrollPane scrollPane;
	private JTable tbllispac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgLisPac dialog = new DlgLisPac();
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
	public DlgLisPac() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgLisPac.class.getResource("/img/TriCell.jpg")));
		setTitle("Listar Paciente");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblPaciente = new JLabel("Paciente:");
		lblPaciente.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPaciente.setBounds(22, 51, 150, 22);
		getContentPane().add(lblPaciente);
		
		button = new JButton("Listar");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBounds(184, 54, 89, 23);
		getContentPane().add(button);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setBounds(283, 54, 89, 23);
		getContentPane().add(btnSalir);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 90, 350, 120);
		getContentPane().add(scrollPane);
		
		tbllispac = new JTable();
		tbllispac.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tbllispac.setBackground(Color.LIGHT_GRAY);
		tbllispac.setFillsViewportHeight(true);
		scrollPane.setViewportView(tbllispac);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(DlgLisPac.class.getResource("/img/SV9.jpg")));
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
