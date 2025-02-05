package Arreglo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import clase.Consulta;

public class ArregloConsulta {

	ArrayList<Consulta> con;
	private String archivo;

	public ArregloConsulta(String archivo) {
		con = new ArrayList<Consulta>();
		this.archivo = archivo;
		cargarConsulta();
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public int tama�o() {
		return con.size();
	}

	public Consulta obtener(int i) {
		return con.get(i);
	}

	public void adicionar(Consulta x) {
		con.add(x);
	}

	// cambiar los elementos dentro del arraylist
	public void modificar(int i, Consulta x) {
		con.set(i, x);
	}

	// metodo eliminar del arraylist
	public void eliminar(Consulta i) {
		con.remove(i);
	}

	public boolean existeArchivo() {
		File f = new File(archivo);
		return f.exists();
	}

	public void cargarConsulta() {
		try {

			BufferedReader br;
			String linea, fechaAtencion, horaAtencion;
			String[] s;
			int codigoConsulta, codigoPaciente, estado;
			double totalPagar;
			br = new BufferedReader(new FileReader(archivo));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				codigoConsulta = Integer.parseInt(s[0].trim());
				codigoPaciente = Integer.parseInt(s[1].trim());
				fechaAtencion = s[2].trim();
				horaAtencion = s[3].trim();
				totalPagar = Double.parseDouble(s[4].trim());
				estado = Integer.parseInt(s[5].trim());
				adicionar(
						new Consulta(codigoConsulta, codigoPaciente, fechaAtencion, horaAtencion, totalPagar, estado));
			}
			br.close();
		} catch (Exception e) {
		}
	}

	/*public void grabarConsulta() {
		try {
			PrintWriter pw;
			String linea;
			Consulta x;
			pw = new PrintWriter(new FileWriter(archivo));
			for (int i = 0; i < tama�o(); i++) {
				x = obtener(i);
				linea = x.getCodigoConsulta() + ";" + x.getCodigoPaciente() + ";" + x.getFechaAtencion() + ";"
						+ x.getHoraAtencion() + ";" + x.getTotalPagar() + ";" + x.getEstado();
				pw.println(linea);
			}
			pw.close();
		} catch (Exception e) {
		}
	}*/

	// Metodo de b�squeda
	public Consulta buscar(int num) {
		for (int i = 0; i < tama�o(); i++)
			if (obtener(i).getCodigoConsulta() == num)
				return obtener(i);
		return null;
	}

	public int camaDisponible() {
		for (int i = 0; i < tama�o(); i++) {
			if (obtener(i).detalleEstado() == "Libre") {
				return obtener(i).getCodigoConsulta();
			}
		}
		return 101;
	}

	public int codigoCorrelativo() {
		if (tama�o() == 0)
			return 400001;
		else
			return obtener(tama�o() - 1).getCodigoConsulta() + 1;
	}

	public String ReporteCodConsulta(int x) {
		if (obtener(x).getEstado() == 1) {
			return Integer.toString(obtener(x).getCodigoConsulta());
		}
		return null;
	}
}
