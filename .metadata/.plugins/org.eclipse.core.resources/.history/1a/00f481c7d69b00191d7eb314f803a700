package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class DlgEliPac extends JDialog implements ActionListener {
	private JLabel lblConsultar;
	private JButton btnConsultar;
	private JButton btnListar;
	private JScrollPane scrollPane;
	private JTable tblelipac;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgEliPac dialog = new DlgEliPac();
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
	public DlgEliPac() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgEliPac.class.getResource("/img/TriCell.jpg")));
		setTitle("Eliminar Paciente");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblConsultar = new JLabel("        Consultar:");
		lblConsultar.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConsultar.setBounds(10, 11, 180, 14);
		getContentPane().add(lblConsultar);
		
		btnConsultar = new JButton("Buscar/Eliminar");
		btnConsultar.addActionListener(this);
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConsultar.setBounds(10, 204, 127, 23);
		getContentPane().add(btnConsultar);
		
		btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnListar.setBounds(155, 204, 127, 23);
		getContentPane().add(btnListar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 409, 150);
		getContentPane().add(scrollPane);
		
		tblelipac = new JTable();
		tblelipac.setBackground(Color.LIGHT_GRAY);
		tblelipac.setForeground(Color.WHITE);
		tblelipac.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblelipac.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblelipac);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setBounds(292, 204, 127, 23);
		getContentPane().add(btnSalir);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			actionPerformedBtnSalir(e);
		}
		if (e.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(e);
		}
	}
	protected void actionPerformedBtnConsultar(ActionEvent e) {
	}
	protected void actionPerformedBtnSalir(ActionEvent e) {
		System.exit(0);
	}
}
