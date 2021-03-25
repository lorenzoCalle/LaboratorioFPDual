package herencia;

import java.util.Date;

public class Producto {
	private Date fCaducidad;
	private int numLote;
	private int codProducto;

	// CONSTRUCTORS
	public Producto(Date fCaducidad, int numLote, int codProducto) {
		super();
		this.fCaducidad = fCaducidad;
		this.numLote = numLote;
		this.codProducto = codProducto;
	}

	// GETTERS&SETTERS
	public Date getfCaducidad() {
		return fCaducidad;
	}

	public void setfCaducidad(Date fCaducidad) {
		this.fCaducidad = fCaducidad;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}

	public int getCodProducto() {
		return codProducto;
	}

	public void setcodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	// OTHER METHODS
	@Override
	public String toString() {
		return "\nEl producto " + codProducto + ", con numero de lote: " + numLote + ", y fecha de caducidad: "
				+ fCaducidad + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		Producto p = (Producto) obj;
		return this.getNumLote() == p.getNumLote();
	}

}
