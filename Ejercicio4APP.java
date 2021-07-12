public class Ejercicio4APP {
	public static void main(String[] args) {

		// Aquí declararemos la variable entera y la iniciaremos.
		int n = 17;

		/*
		 * A partir de aquí en orden vamos a mostrar la variable, le sumaremos 77, le
		 * restaremos 3 y duplicaremos el valor de la variable (en ese orden).
		 */
		System.out.println("Valor inicial de N " + n);
		System.out.println("N + 77 = " + (n = (n + 77)));
		System.out.println("N - 3 = " + (n = (n - 3)));
		System.out.println("N * 2 = " + (n = (n * 2)));
	}
}
