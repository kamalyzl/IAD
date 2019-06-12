package Arreglo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import clase.Cama;

public class ArregloCama extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	ArrayList<Cama> ca;

	public ArregloCama() {
		ca = new ArrayList<Cama>();
		cargarCama();
	}

	// el tamaño del arreglo
	public int tamaño() {
		return ca.size();
	}

	// posicionarme en el punto del arreglo
	public Cama obtener(int i) {
		return ca.get(i);
	}

	public void adicionar(Cama x) {
		ca.add(x);
	}

	// cambiar los elementos dentro del arraylist
	public void modificar(int i, Cama x) {
		ca.set(i, x);
	}

	// metodo eliminar del arraylist
	public void eliminar( Cama i) {
		ca.remove(i);
	}

	public void cargarCama() {
		try {

			//   bufferedReader lee archivos
			BufferedReader br;
			String linea;
			String[] s;
			int ncama, tcama, estado;
			double precio;
			br = new BufferedReader(new FileReader("cama.txt"));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				ncama = Integer.parseInt(s[0].trim());
				tcama = Integer.parseInt(s[1].trim());
				precio = Double.parseDouble(s[2].trim());
				estado = Integer.parseInt(s[3].trim());
				adicionar(new Cama(ncama, tcama, precio, estado));
			}
			br.close();
		} catch (Exception e) {
		}
	}

	public void grabarCama() {
		try {

			// import del printWriter para escribir y obtener los elementos generados
			// ¿Para que sirve PrintWriter? ¿De que biblioteca es? java.io
			PrintWriter pw;
			String linea;
			Cama x;
			// import del FileWriter para escribir y obtener los elementos generados
			// ¿Para que sirve FileWriter? ¿De que biblioteca es? java.io rpta
			pw = new PrintWriter(new FileWriter("cama.txt"));
			for (int i = 0; i < tamaño(); i++) {
				x = obtener(i);
				linea = x.getNcama() + ";" + x.getCategoria() + ";" + x.getPrecio() + ";" + x.getEstado();
				pw.println(linea);
			}
			pw.close();
		} catch (Exception e) {
		}
	}

	// Metodo de búsqueda
	public Cama buscar(int num) {
		for (int i = 0; i < tamaño(); i++)
			if (obtener(i).getNcama() == num)
				return obtener(i);
		return null;
	}
	// VALIDAR archivos para guardado

	public boolean existeArchivo() {
		File f = new File("cama.txt");
		return f.exists();
	}

	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
