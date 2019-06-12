package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;

public class DlgRepConsultasPendientes extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgRepConsultasPendientes dialog = new DlgRepConsultasPendientes();
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
	public DlgRepConsultasPendientes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgRepConsultasPendientes.class.getResource("/img/TriCell.jpg")));
		setTitle("Consultas Pendientes");
		setBounds(100, 100, 450, 300);

	}

}
