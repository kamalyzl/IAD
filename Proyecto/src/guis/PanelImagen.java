package guis;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;

public class PanelImagen extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;
	public PanelImagen() {
		this.setSize(400,200);

	}
	public void pintar(Graphics p){
		
		Dimension tamanio=getSize();
		ImageIcon imagenFondo1=new ImageIcon(getClass().getResource("/img/SV2.jpg"));
		p.drawImage(imagenFondo1.getImage(), 0, 0, tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paint(p);
		
	}
	public void paintComponent(Graphics g){
		Dimension tamanio=getSize();
		ImageIcon imagenFondo=new ImageIcon(getClass().getResource("/img/SV1.jpg"));
		g.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paintComponent(g);
		
	}
	
}
