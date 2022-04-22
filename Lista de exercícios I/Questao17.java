import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		
		/**
		 * Leia 80 números e ao final informar quantos número(s)
		 * estao no intervalo entre 10 (inclusive) e 150 (inclusive)
		 */
		
		Scanner leitor= new Scanner (System.in);
		int numero=0, contador=0;
		
		for(int i=0; i< 80; i++) {
			
			System.out.println("Digite um numero inteiro:");
			numero= leitor.nextInt();
			
			if((numero >=10) && (numero <= 150)) {contador++;}
			
		}
		
		System.out.println("Possui "+ contador +" numeros no intervalo entre 10 e 150");
	}

}
