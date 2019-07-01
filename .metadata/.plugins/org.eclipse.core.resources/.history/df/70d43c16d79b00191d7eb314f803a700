package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class DlgAdiMed extends JDialog implements ActionListener {
	private JLabel label;
	private JLabel lblBuscarPacientePor;
	private JTextField txtcod;
	private JTable table;
	private JButton btnConsultar;
	private JButton btnAdicionarMedicamento;
	private JLabel lblindiqueElCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgAdiMed dialog = new DlgAdiMed();
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
	public DlgAdiMed() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgAdiMed.class.getResource("/img/TriCell.jpg")));
		setTitle("Adicionar Medicina");
		setBounds(100, 100, 550, 300);
		getContentPane().setLayout(null);
		
		lblBuscarPacientePor = new JLabel("Buscar paciente:");
		lblBuscarPacientePor.setBounds(30, 22, 120, 14);
		getContentPane().add(lblBuscarPacientePor);
		
		txtcod = new JTextField();
		txtcod.setBounds(134, 19, 86, 20);
		getContentPane().add(txtcod);
		txtcod.setColumns(10);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		table.setForeground(Color.WHITE);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBounds(39, 61, 390, 150);
		getContentPane().add(table);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(230, 18, 100, 23);
		getContentPane().add(btnConsultar);
		
		btnAdicionarMedicamento = new JButton("Adicionar");
		btnAdicionarMedicamento.setBounds(329, 18, 100, 23);
		getContentPane().add(btnAdicionarMedicamento);
		
		lblindiqueElCodigo = new JLabel("(*)Indique el codigo del paciente a consultar luego adicione un medicamento.");
		lblindiqueElCodigo.setForeground(Color.RED);
		lblindiqueElCodigo.setBounds(39, 222, 495, 14);
		getContentPane().add(lblindiqueElCodigo);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Z3r0Limited\\Documents\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\bin\\img\\SV12.jpg"));
		label.setBounds(0, 0, 534, 261);
		getContentPane().add(label);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(arg0);
		}
	}
	protected void actionPerformedBtnConsultar(ActionEvent arg0) {
	}
}
