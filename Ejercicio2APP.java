public class Ejercicio2APP {
	public static void main(String[] args) {

		// Aquí declaro las variables para poder realizar el ejercicio.
		int n = 7;
		double a = 3.48;
		char c = 'F';

		// Esta línea mostrará el valor de las tres variables por pantalla
		System.out.println("Variable N = " + n + "\n" + "Variable A = " + a + "\n" + "Variable C = " + c);

		// Esta línea mostrará la suma entre la variable N y A
		System.out.println(n + " + " + a + " = " + (n + a));

		// Esta línea mostrará la diferencia entre la variable A y N
		System.out.println(a + " - " + n + " = " + (a - n));

		// Esta línea mostrará el valor numerico de la variable C
		System.out.println("Valor numérico del carácter " + c + " = " + (int) c);
	}
}
