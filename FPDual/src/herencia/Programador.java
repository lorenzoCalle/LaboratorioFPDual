package herencia;

public class Programador extends Empleado {
	private int lineaCodigoHora;
	private String lenguajeDominante;

	// CONSTRUCTORS
	public Programador() {
		super();
	}

	public Programador(String nombre, String cedula, int edad, boolean casado, double salario) {
		super(nombre, cedula, edad, casado, salario);
	}

	public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineaCodigoHora,
			String lenguajeDominante) {
		super(nombre, cedula, edad, casado, salario);
		this.lineaCodigoHora = lineaCodigoHora;
		this.lenguajeDominante = lenguajeDominante;
	}

	// GETTERS&SETTERS
	public int getLineaCodigoHora() {
		return lineaCodigoHora;
	}

	public void setLineaCodigoHora(int lineaCodigoHora) {
		this.lineaCodigoHora = lineaCodigoHora;
	}

	public String getLenguajeDominante() {
		return lenguajeDominante;
	}

	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}

	// OTHER METHODS
	@Override
	public String toString() {
		return super.toString() + "\nLineas de codigo por hora: " + lineaCodigoHora + "\nLenguaje dominante: "
				+ lenguajeDominante;
	}

}
