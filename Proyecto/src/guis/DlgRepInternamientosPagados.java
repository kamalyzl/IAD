package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;

public class DlgRepInternamientosPagados extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgRepInternamientosPagados dialog = new DlgRepInternamientosPagados();
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
	public DlgRepInternamientosPagados() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgRepInternamientosPagados.class.getResource("/img/TriCell.jpg")));
		setTitle("Internamientos Pagados");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

	}

}
