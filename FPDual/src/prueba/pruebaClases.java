package prueba;

public class pruebaClases {

	public static void main(String[] args) {

		System.out.println(countYZ("fez day"));
	}

	public static int countYZ(String str) {
		String[] separated = str.split(" ");
		int numWords = 0;
		for (String words : separated) {
			char[] letters = words.toCharArray();
			if (letters[letters.length-1] == 'y' || letters[letters.length-1] == 'z') {
			numWords++;
			}
		}
		return numWords;
	}
	
	public static String withoutString(String base, String remove) {
		
		return null;
	}

}
