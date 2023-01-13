
import java.util.Scanner;

public class Sorteo {
	String numeroPremiado;
	char serie;
	static long numeroSorteo = 0;
	String numero = "";
	char serie_p;
	// metodo para imprimir sorteo
	public void imprimeSorteo(long numeroPremiado, char serie, int [] sorteos) {
		int[] sorteos1 = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < sorteos1.length; i++) {
			numeroPremiado = (long) (Math.random() * 10000);
			serie = (char) (Math.random() * 9 + 65);
			System.out.println("El numero premiado para el sorteo " + sorteos1[i]+ " es= " + numeroPremiado + "-" + serie);
		}
		
	}

	// metodo para comprobar premio
	public void compruebaPremio(String numero, String numeroPremiado, String serie, long numeroSorteo) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero");
		numero = teclado.nextLine();
		System.out.println("Introduce el numero del sorteo");
		serie_p = teclado.next();
		teclado.close();
		if (serie.equals(serie_p)) {
			System.out.println("Has ganado 100€");
		}

	public String getNumeroPremiado() {
		return numeroPremiado;
	}

	public void setNumeroPremiado(String numeroPremiado) {
		this.numeroPremiado = numeroPremiado;
	}

	public char getSerie() {
		return serie;
	}

	public void setSerie(char serie) {
		this.serie = serie;
	}

	public static long getNumeroSorteo() {
		return numeroSorteo;
	}

	public static void setNumeroSorteo(long numeroSorteo) {
		Sorteo.numeroSorteo = numeroSorteo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public char getSerie_p() {
		return serie_p;
	}

	public void setSerie_p(char serie_p) {
		this.serie_p = serie_p;
	}

	private Object charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
