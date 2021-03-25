package excepciones;

public class Ej4 {
	private static Integer attemp;

	public static void main(String[] args) {
		try {
			attemp = null;
			System.out.println(attemp.toString());
		} catch (NullPointerException e){
			System.out.println("The object is null");
			e.printStackTrace();;
		}
	}
}
