package herencia;

import java.util.ArrayList;
import java.util.List;

public class Gestion {
	private int nPedido;
	private String medio;
	private List<Producto> productos = new ArrayList<Producto>();

	// CONSTRUCTORS
	public Gestion(int nProducto) {
		super();
		this.nPedido = nProducto;
	}

	// GETTERS&SETTERS
	public int getnPedido() {
		return nPedido;
	}

	public void setnPedido(int nPedido) {
		this.nPedido = nPedido;
	}

	public String getMedio() {
		return medio;
	}

	public void definirMedio(String medio) {
		this.medio = medio;
	}

	// OTHER METHODS
	public void pedir(Producto producto) {
		productos.add(producto);
	}

	public String mostrarPedido() {
		return "El pedido " + nPedido + "\nContiene: " + productos + "\nY ha sido realizado: " + medio + ".\n\n";
	}

}
