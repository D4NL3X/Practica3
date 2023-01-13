import java.util.Arrays;

public class Diagonales {

	public static void main(String[] args) {
		int contador2 =7;
		int contador1=0;
		int[][] matriz = new int[8][8];
		int suma_iz = 0, suma_de = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int x = 0; x < matriz[i].length; x++) {
				matriz[i][x] = (int) (Math.random() * 99);
			}

		}
		for (int q = 0; q < matriz.length; q++) {
			System.out.println(Arrays.toString(matriz[q]));
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int q = 0; q < matriz.length; q++) {
				if (i == q) {
					suma_iz = suma_iz + matriz[i][q];
				}
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int q = matriz.length -1; q >=-1 ; q--) {
				if (contador1==i && contador2==q) {
					suma_de = suma_de + matriz[i][q];
					contador1=contador1+1;
					contador2=contador2-1;
				}

			}
		}
		System.out.println("La suma de la diagonal izquierda es igual a: " + suma_iz);
		System.out.println("La suma de la diagonal izquierda es igual a: " + suma_de);
	}

}
