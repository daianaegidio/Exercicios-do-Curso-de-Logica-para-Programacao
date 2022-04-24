import java.util.Scanner;

public class Questao25 {

	public static void main(String[] args) {
        
		/**
		 * Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes.
		 *  Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais. 
		 *  Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes;
		 */
		
		
		Scanner leitor= new Scanner (System.in);
		int numero1=0, numero2=0;
		
        System.out.println("Digite o primeiro Numero inteiro:");
        numero1=leitor.nextInt();
        
        System.out.println("Digite o segundo Numero inteiro:");
        numero2=leitor.nextInt();
        
        if(numero1 == numero2) {System.out.println("Os números sao Iguais!");
        }else if(numero1 > numero2) {System.out.println("Os números sao Diferentes!");
        System.out.println("O numero " + numero1 + " é o maior que o numero " + numero2);
        }else {System.out.println("Os números sao Diferentes!");
        System.out.println("O numero " + numero2 + " é o maior que o numero " + numero1);
        }
	}

}
