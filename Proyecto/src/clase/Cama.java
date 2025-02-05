package clase;

public class Cama {
	private int ncama, categoria, estado;

	public Cama(int nc, int cat, int est) {
		this.ncama = nc;
		this.categoria = cat;
		this.estado = est;

	}

	public int getNcama() {
		return ncama;
	}

	public void setNcama(int ncama) {
		this.ncama = ncama;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	// elegimos las opciones para categoria
	public String detalleCategoria() {
		switch (categoria) {

		case 0:
			return "B�sico";
		case 1:
			return "Estandar";
		default:
			return "Premium";
		}
	}

	// elegimos las opciones para estado
	public String detalleEstado() {
		switch (estado) {
		case 0:
			return "libre";
		default:
			return "ocupado";
		}
	}

	// operacion complementaria

	public double precioCama() {
		switch (detalleCategoria()) {
		case "B�sico":
			return 70;
		case "Estandar":
			return 120;
		default:
			return 180;
		}

	}

}
