import java.util.Scanner;

public class Questao25 {

	public static void main(String[] args) {
        
		/**
		 * Fa�a um algoritmo que leia dois n�meros e identifique se s�o iguais ou diferentes.
		 *  Caso eles sejam iguais imprima uma mensagem dizendo que eles s�o iguais. 
		 *  Caso sejam diferentes, informe qual n�mero � o maior, e uma mensagem que s�o diferentes;
		 */
		
		
		Scanner leitor= new Scanner (System.in);
		int numero1=0, numero2=0;
		
        System.out.println("Digite o primeiro Numero inteiro:");
        numero1=leitor.nextInt();
        
        System.out.println("Digite o segundo Numero inteiro:");
        numero2=leitor.nextInt();
        
        if(numero1 == numero2) {System.out.println("Os n�meros sao Iguais!");
        }else if(numero1 > numero2) {System.out.println("Os n�meros sao Diferentes!");
        System.out.println("O numero " + numero1 + " � o maior que o numero " + numero2);
        }else {System.out.println("Os n�meros sao Diferentes!");
        System.out.println("O numero " + numero2 + " � o maior que o numero " + numero1);
        }
	}

}
