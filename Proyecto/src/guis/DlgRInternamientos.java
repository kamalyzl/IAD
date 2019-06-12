package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;

public class DlgRInternamientos extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgRInternamientos dialog = new DlgRInternamientos();
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
	public DlgRInternamientos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgRInternamientos.class.getResource("/img/TriCell.jpg")));
		setTitle("Internamientos");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

	}

}
