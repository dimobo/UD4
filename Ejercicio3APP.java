public class Ejercicio3APP {
	public static void main(String[] args) {

		// Aquí declararemos las variables.
		int x = 6, y = 3;
		double n = 4.56, m = 9.32;

		// Esta línea mostrará el valor de las variables por pantalla
		System.out.println("Variable X = " + x + "\n" + "Variable Y = " + y + "\n" + "Variable N = " + n + "\n"
				+ "Variable M = " + m + "\n");

		// Las siguientes líneas muestran la +, - *, / y % entre X y Y
		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(x + " / " + y + " = " + (x / y));
		System.out.println(x + " % " + y + " = " + (x % y) + "\n");

		// Las siguientes líneas muestran la +, - *, / y % entre N y M
		System.out.println(n + " + " + m + " = " + (n + m));
		System.out.println(n + " - " + m + " = " + (n - m));
		System.out.println(n + " * " + m + " = " + (n * m));
		System.out.println(n + " / " + m + " = " + (n / m));
		System.out.println(n + " % " + m + " = " + (n % m) + "\n");

		// Esta línea mostrará el valor de la suma entre X y N
		System.out.println(x + " + " + n + " = " + (x + n));

		// Esta línea mostrará el valor del cociente entre Y y M
		System.out.println(y + " / " + m + " = " + (y / m));

		// Esta línea mostrará el valor del resto entre Y y M
		System.out.println(y + " % " + m + " = " + (y % m) + "\n");

		// Estas líneas mostrarán el doble de cada una de las variables.
		System.out.println(x + " * 2 = " + (x * 2));
		System.out.println(y + " * 2 = " + (y * 2));
		System.out.println(n + " * 2.0 = " + (n * 2.0));
		System.out.println(m + " * 2.0 = " + (m * 2.0) + "\n");

		// Aquí sumaremos todas las variables.
		System.out.println(x + " + " + y + " + " + n + " + " + m + " = " + (x + y + n + m) + "\n");

		// Aquí obtendremos el producto de todas las variables.
		System.out.println(x + " * " + y + " * " + n + " * " + m + " = " + (x * y * n * m));

	}
}
