package Arreglo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import clase.Internamiento;

public class ArregloInternamiento {
	private ArrayList<Internamiento> inter;
	private String archivo;

	public ArregloInternamiento(String archivo) {
		inter = new ArrayList<Internamiento>();
		this.archivo = archivo;
		cargarInternamiento();
	}

	public int tamaño() {
		return inter.size();
	}

	public Internamiento obtener(int i) {
		return inter.get(i);
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public String getArchivo() {
		return archivo;
	}

	public void adicionar(Internamiento x) {
		inter.add(x);
	}

	public void eliminar(Internamiento x) {
		inter.remove(x);
	}

	public Internamiento buscar(int codigo) {
		Internamiento x;
		for (int i = 0; i < tamaño(); i++) {
			x = obtener(i);
			if (x.getCodigoInternamiento() == codigo)
				return x;
		}
		return null;
	}

	public int codigoCorrelativo() {
		if (tamaño() == 0)
			return 2001;
		else
			return obtener(tamaño() - 1).getCodigoInternamiento() + 1;
	}

	public boolean existeArchivo() {
		File f = new File(archivo);
		return f.exists();
	}

	public void cargarInternamiento() {
		try {
			BufferedReader br;
			String linea, fechaIngreso, horaIngreso;
			String s[];
			int codigoInternamiento, codigoPaciente, numeroCama, estado;
			double totalPagar;
			br = new BufferedReader(new FileReader(archivo));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				codigoInternamiento = Integer.parseInt(s[0].trim());
				codigoPaciente = Integer.parseInt(s[1].trim());
				numeroCama = Integer.parseInt(s[2].trim());
				fechaIngreso = s[3].trim();
				horaIngreso = s[4].trim();
				totalPagar = Double.parseDouble(s[5].trim());
				estado = Integer.parseInt(s[6].trim());
				adicionar(new Internamiento(codigoInternamiento, codigoPaciente, numeroCama, fechaIngreso, horaIngreso,
						totalPagar, estado));
			}
			br.close();
		} catch (Exception e) {
		}
	}

	public void grabarFunciones() {
		try {
			PrintWriter pw;
			String linea;
			Internamiento x;
			pw = new PrintWriter(new FileWriter(archivo));
			for (int i = 0; i < tamaño(); i++) {
				x = obtener(i);
				linea = x.getCodigoInternamiento() + ";" + x.getCodigoPaciente() + ";" + x.getNumeroCama() + ";" + ";"
						+ x.getFechaIngreso() + ";" + x.getHoraIngreso() + ";" + x.getTotalPagar() + ";" + x.getEstado()
						+ ";";
				pw.println(linea);
			}
			pw.close();
		} catch (Exception e) {
		}
	}

	public int ReporteCodigoPaciente(int x) {
		return obtener(x).getCodigoPaciente();
	}

	public int ReporteCama(int x) {
		return obtener(x).getNumeroCama();
	}

	public String ReporteFechaIngreso(int x) {
		return obtener(x).getFechaIngreso();
	}
}
