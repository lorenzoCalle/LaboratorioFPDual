package prueba;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre:");
		String studentName = sc.next();
		System.out.println(studentName.matches(".*\\d.*") 
				? "No se pueden usar numeros" : "Hola " + studentName);
		sc.close();
	}
	
}
