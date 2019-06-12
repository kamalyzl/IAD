package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;

public class DlgRepInternamientosPendientes extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgRepInternamientosPendientes dialog = new DlgRepInternamientosPendientes();
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
	public DlgRepInternamientosPendientes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgRepInternamientosPendientes.class.getResource("/img/TriCell.jpg")));
		setTitle("Reporte Internamientos Pagados");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

	}

}
