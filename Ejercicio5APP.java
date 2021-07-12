public class Ejercicio5APP {
	public static void main(String[] args) {

		// Aquí declararemos las variables.
		int a = 5, b = 11, c = 14, d = 21, aux = 0;

		// Aquí vamos a hacer el cambio de las variables.
		aux = b;
		b = c;
		c = a;
		a = d;
		d = aux;

		// Ahora vamos a mostrar el valor de las variables.
		System.out.println("Valor de la variable A =" + a);
		System.out.println("Valor de la variable B =" + b);
		System.out.println("Valor de la variable C =" + c);
		System.out.println("Valor de la variable D =" + d);

	}
}
