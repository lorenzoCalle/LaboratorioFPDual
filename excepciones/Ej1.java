package excepciones;

public class Ej1 {

	public static void main(String[] args) {
		try {
			int[] arrayInt = {0, 1, 2};
			arrayInt[3] = 3;
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Error en la longitud");
		} finally {
			System.out.println("El mayor valor que puedes cambiar es 2");
		}
	}

}
