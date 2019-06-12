package libreria;

import javax.swing.*;

public class Alerta {
	public static void mensaje(JDialog jd, String s) {
		JOptionPane.showMessageDialog(jd, s, "Mensaje", 2);
	}

	public static int confirmar(JDialog jd, String s) {
		return JOptionPane.showConfirmDialog(jd, s, "Mensaje *", 0, 3, null);
	}
}
