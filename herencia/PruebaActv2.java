package herencia;

public class PruebaActv2 {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Lucia Guapa", "23123123A", 18, true, 1800);
		Empleado e2 = new Empleado("Lady Amo", "111S", 23, false, 2000);
		Empleado e3 = new Empleado("Joaquin Carachapa", "12345678K", 25, true, 945);
		Programador e4 = new Programador("Jhonny Chaparron", "28765019Q", 37, false, 1245, 120, "JavaScript");

		System.out.println(e1.mostrarClasificacion());
		System.out.println(e3.mostrarClasificacion());
		System.out.println(e4.mostrarClasificacion());

		System.out.println("\n" + e2.toString());

		System.out.println("\n" + e4.toString());

	}

}
