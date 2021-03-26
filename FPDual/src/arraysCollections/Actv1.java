package arraysCollections;


public class Actv1 {

	public static void main(String[] args) {
		int[] tabla1 = { 6, 2, 3 };
		int[] tabla2 = { 1, 4, 6, 12 };
		int[] tabla3 = { 1, 2, 3, 6 };

		/**System.out.println("true, false, true\n" + Actv1.hay6(tabla1) + Actv1.hay6(tabla2) + Actv1.hay6(tabla3));

		System.out.println("true, false" + Actv1.hay2o3(tabla3) + Actv1.hay2o3(tabla2));
		System.out.println("[2, 3]\n");
		for (int i = 0; i < 2; i++) {
			System.out.println(Actv1.parejaCentral(tabla3)[i]);
		}*/
		for (int j = 0; j < tabla3.length; j++) {
			System.out.println(returnReverse(tabla3)[j]);
		}

	}

	public static boolean hay6(int[] numeros) {
		return numeros[0] == 6 || numeros[numeros.length - 1] == 6;
	}

	public static boolean hay2o3(int[] numeros) {
		boolean hay = false;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == 2 || numeros[i] == 3) {
				hay = true;
			}
		}
		return hay;
	}

	public static int[] parejaCentral(int[] numeros) {
		if (numeros.length%2 == 0) {
			int centro = numeros.length/2;
			int[] centrales = { numeros[centro-1], numeros[centro] };
			return centrales;
		} else {
			return null;
		}
	}
	public static int[] returnReverse(int[] nums) {
		int[] reverse = new int[nums.length];
		for (int i=0; i<nums.length;i++) {
			//run nums (parametrized arrays)
				reverse[i] = nums[nums.length-1-i];
		}
		return reverse;
	}
}
