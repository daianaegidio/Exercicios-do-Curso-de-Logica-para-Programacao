import java.util.Scanner;

public class Questao23 {

	public static void main(String[] args) {
		
		/**
		 * Fa�a um algoritmo que receba um n�mero e mostre uma mensagem caso este
		 *  n�mero seja maior que 80,menor que 25 ou igual a 40;
		 */
		
		Scanner leitor= new Scanner(System.in);
		float numero=0.0f;
		
		System.out.println("Digite um numero:");
        numero=leitor.nextFloat();
        
        if(numero > 80) {
        	
        	System.out.println("Numero maior de 80");
        }else if (numero < 25) {
        	System.out.println("Numero  menor de 25");
        }else if(numero== 40) {System.out.println("Numero igual a 40");}
	}

}
