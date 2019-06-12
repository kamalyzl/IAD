package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;

public class DlgRepConsultasPagadas extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgRepConsultasPagadas dialog = new DlgRepConsultasPagadas();
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
	public DlgRepConsultasPagadas() {
		setTitle("Consultas Pagadas");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgRepConsultasPagadas.class.getResource("/img/TriCell.jpg")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

	}

}
