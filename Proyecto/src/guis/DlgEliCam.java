package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgEliCam extends JDialog implements ActionListener {
	private JLabel label;
	private JLabel lblBuscareliminar;
	private JComboBox comboBox;
	private JScrollPane scrollPane;
	private JTable tblelicam;
	private JButton btnSalir;
	private JButton btnListarCamas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgEliCam dialog = new DlgEliCam();
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
	public DlgEliCam() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgEliCam.class.getResource("/img/TriCell.jpg")));
		setTitle("Eliminar Cama");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblBuscareliminar = new JLabel("Buscar/Eliminar:");
		lblBuscareliminar.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBuscareliminar.setBounds(45, 11, 153, 32);
		getContentPane().add(lblBuscareliminar);
		
		comboBox = new JComboBox();
		comboBox.setBounds(45, 43, 89, 20);
		getContentPane().add(comboBox);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setBounds(144, 42, 89, 23);
		getContentPane().add(btnSalir);
		
		btnListarCamas = new JButton("Listar camas");
		btnListarCamas.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnListarCamas.setBounds(240, 11, 123, 52);
		getContentPane().add(btnListarCamas);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 69, 318, 180);
		getContentPane().add(scrollPane);
		
		tblelicam = new JTable();
		scrollPane.setViewportView(tblelicam);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(DlgEliCam.class.getResource("/img/SV7.jpg")));
		label.setBounds(0, 0, 434, 261);
		getContentPane().add(label);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			actionPerformedBtnSalir(e);
		}
	}
	protected void actionPerformedBtnSalir(ActionEvent e) {
		System.exit(0);
	}
}
