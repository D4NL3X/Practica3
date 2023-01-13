import java.util.Scanner;

public class GestionSorteo {

	public static void main(String[] args) {
		char serie = 0;
		long numeroSorteo = 1;
		String numero = "";
		Scanner teclado = new Scanner(System.in);
		Sorteo sor = new Sorteo();
		int eleccion = 0;
		String[] opciones = { "0,-Salir", "1.-Mostrar Sorteos", "2.-Comprobar Premios" };
		do {
			for (int i = 0; i < opciones.length; i++) {
				System.out.println(opciones[i]);
			}
			eleccion = teclado.nextInt();
			switch (eleccion) {
			case 1:// Mostrar sorteos
				sor.imprimeSorteo(numeroSorteo, serie, null);
			case 2:// Comprueba Premio
				sor.compruebaPremio(numero, numero, numero, numeroSorteo);
			}
		} while (eleccion != 0);
		teclado.close();
	}

}
