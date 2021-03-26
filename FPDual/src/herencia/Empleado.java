package herencia;

public class Empleado {
	private String nombre;
	private String cedula;
	private int edad;
	private boolean casado;
	private double salario;

	// CONSTRUCTORS
	public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		if (edad < 18 || edad > 45) {
			System.out.println("La edad de " + nombre + " debe ser entre 18 y 45");
		} else {
			this.edad = edad;
		}
		this.casado = casado;
		this.salario = salario;
	}

	public Empleado() {
		super();
	}

	// GETTERS&SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad < 18 || edad > 45) {
			System.out.println("La edad de " + nombre + " debe ser entre 18 y 45");
		} else {
			this.edad = edad;
		}
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// OTHER METHODS

	public String mostrarClasificacion() {
		return edad <= 21 ? nombre + " es principiante" : edad > 35 ? nombre + " es senior" : nombre + " es intermedio";
	}

	@Override
	public String toString() {
		return casado
				? "Nombre: " + nombre + "\nDNI: " + cedula + "\nEdad: " + edad + "\nEsta casado" + "\nSalario: "
						+ salario
				: "Nombre: " + nombre + "\nDNI: " + cedula + "\nEdad: " + edad + "\nNo esta casado" + "\nSalario: "
						+ salario;
	}

	public void aumentarSalario(float porcentaje) {
		this.salario = salario * (porcentaje / 100);
	}

}
