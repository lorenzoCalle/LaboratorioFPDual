package herencia;

import java.util.Date;

public class PCongelado extends Producto {
	private float tempRecomendada;
	private TipoCongelacion tipo;

	public PCongelado(Date fCaducidad, int numLote, int codProducto, float tempRecomendada, TipoCongelacion tipo) {
		super(fCaducidad, numLote, codProducto);
		this.tempRecomendada = tempRecomendada;
		this.tipo = tipo;
	}

	// GETTERS&SETTERS

	public float getTempRecomendada() {
		return tempRecomendada;
	}

	public void setTempRecomendada(float tempRecomendada) {
		this.tempRecomendada = tempRecomendada;
	}

	public TipoCongelacion getTipo() {
		return tipo;
	}

	public void setTipo(TipoCongelacion tipo) {
		this.tipo = tipo;
	}

	// OTHER METHODS
	@Override
	public String toString() {
		return super.toString() + "la temperatura recomendada es: " + tempRecomendada + ", y se debe congelar por: "
				+ tipo + ".\n";
	}

}
