package brayan.rojas.algoritmos;

public class Fibonacci {

	public static void main(String[] args) {

		/*
		 * mostrar el valor de la posicion del fibonacci dado
		 * 
		 */

		int fiboPos = 7; // 0 1 1 2 3 5 8 13

		System.out.print("BASE: ");

		if (fiboPos == 0) {
			System.out.println("Fibo posicion (0) = 0");
		} else if (fiboPos == 1) {
			System.out.println("Fibo posicion (1) = 1");
		} else if (fiboPos < 0) {
			System.out.println("No se permiten numeros negativos");

		} else if (fiboPos > 1) {

			printCasoBase();
			System.out.print("SIN LOGICA" + "," + 2 + "," + 3 + "," + 5 + "," + 8 + "," + 13 + "\n");
			System.out.println("****************");

			printCasoBase();
			int a = 1;
			int b = 1;
			int c = a + b;
			int d = c;
			int contadorSalida = 0;

			while (contadorSalida <= fiboPos) {

				// if (contadorSalida > 1) {
				a = b;
				b = c;

				// }

				c = a + b;
				System.out.print(","+ c);
				contadorSalida++;
				c = a + b;
				//System.out.print(","+ d);
			}

		}

	}

	static void printCasoBase() {
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.print(a + "," + b + "," + c);
	}

}
