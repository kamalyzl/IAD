package Arreglo;

import java.io.*;
import java.util.ArrayList;
import clase.Cama;

public class ArregloCama {

	ArrayList<Cama> ca;
	private String archivo;

	public ArregloCama(String archivo) {
		ca = new ArrayList<Cama>();
		this.archivo = archivo;
		cargarCama();
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public int tamaño() {
		return ca.size();
	}

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
	public void eliminar(Cama i) {
		ca.remove(i);
	}

	public boolean existeArchivo() {
		File f = new File(archivo);
		return f.exists();
	}

	public void cargarCama() {
		try {

			BufferedReader br;
			String linea;
			String[] s;
			int ncama, tcama, estado;
			br = new BufferedReader(new FileReader(archivo));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				ncama = Integer.parseInt(s[0].trim());
				tcama = Integer.parseInt(s[1].trim());
				estado = Integer.parseInt(s[2].trim());
				adicionar(new Cama(ncama, tcama, estado));
			}
			br.close();
		} catch (Exception e) {
		}
	}

	public void grabarCama() {
		try {
			PrintWriter pw;
			String linea;
			Cama x;
			pw = new PrintWriter(new FileWriter(archivo));
			for (int i = 0; i < tamaño(); i++) {
				x = obtener(i);
				linea = x.getNcama() + ";" + x.getCategoria() + ";" + x.getEstado();
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

	public int camaDisponible() {
		for (int i = 0; i < tamaño(); i++) {
			if (obtener(i).detalleEstado() == "Libre") {
				return obtener(i).getNcama();
			}
		}
		return 101;
	}

	public int codigoCorrelativo() {
		if (tamaño() == 0)
			return 100001;
		else
			return obtener(tamaño() - 1).getNcama() + 1;
	}

}
