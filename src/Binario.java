import java.util.Iterator;

public class Binario {

	public static void main(String[] args) {
		boolean[] binarios = new boolean[8];
		int[] vbinarios = new int[8];
		int num_al_boleano;
		double v_dec = 0;
		double resultado = 0;
		int contador1=0;
		int contador2=0;
		for (int i = binarios.length -1; i >=0; i--) {
			num_al_boleano = (int) (Math.random() * 2);
			if (num_al_boleano == 1) {
				binarios[i] = true;
			} else {
				binarios[i] = false;
			}
			//fin relleno vector boolean
			
			if (binarios[i] == true) {
				vbinarios[i] = 1;
				v_dec=Math.pow(2,i);
				resultado=resultado+v_dec;
				contador1=contador1+1;
			} else {
				vbinarios[i] = 0;
				contador2=contador2+1;
			}
			if (vbinarios[i]==1) {
			}
			System.out.print(vbinarios[i]);

		}
		System.out.println("-- el valor es "+resultado);
		System.out.println("Hay "+contador1+" unos y "+contador2+" ceros.");

	}

}

	