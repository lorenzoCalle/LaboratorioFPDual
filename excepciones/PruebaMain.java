package excepciones;

public class PruebaMain {

	public static void main(String[] args) {
		try {
			pruebaPersEx();
		}catch(NullPointerException n) {
			
		} catch (PersonalException e) {
			System.out.println("It's in catch");
			e.printStackTrace();
		}
	}
	public static void pruebaPersEx() throws PersonalException{
		PersonalException pEx = new PersonalException("correct error");
		throw pEx;
	}

}
