import java.util.Arrays;
import java.util.Scanner;

public class Questao30 {

	public static void main(String[] args) {
		
		/**
		 * Escreva um algoritmo que leia três valores inteiros distintos
		 * e os escreva em ordem crescente.
		 */
		
		Scanner leitor= new Scanner(System.in);
		int numeros []= new int [3];
		
		System.out.println("Digite o primeiro numero inteiro:");
		numeros[0]=leitor.nextInt();
		
		System.out.println("Digite o segundo numero inteiro:");
		numeros[1]=leitor.nextInt();
		
		System.out.println("Digite o terceiro numero inteiro:");
		numeros[2]=leitor.nextInt();
		
		Arrays.sort(numeros);
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
	}

}
