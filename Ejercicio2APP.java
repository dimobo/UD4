public class Ejercicio2APP {
	public static void main(String[] args) {

		// Aqu� declaro las variables para poder realizar el ejercicio.
		int n = 7;
		double a = 3.48;
		char c = 'F';

		// Esta l�nea mostrar� el valor de las tres variables por pantalla
		System.out.println("Variable N = " + n + "\n" + "Variable A = " + a + "\n" + "Variable C = " + c);

		// Esta l�nea mostrar� la suma entre la variable N y A
		System.out.println(n + " + " + a + " = " + (n + a));

		// Esta l�nea mostrar� la diferencia entre la variable A y N
		System.out.println(a + " - " + n + " = " + (a - n));

		// Esta l�nea mostrar� el valor numerico de la variable C
		System.out.println("Valor num�rico del car�cter " + c + " = " + (int) c);
	}
}
