import java.util.Scanner;

public class Questao26 {

	public static void main(String[] args) {
		
		/**
		 * Fa�a um algoritmo que leia um n�mero de 1 a 5 e escreva por extenso. 
		 * Caso o usu�rio digite um n�mero que n�o esteja neste intervalo, exibir
		 * a seguinte mensagem: n�mero inv�lido;
		 */
		
		Scanner leitor= new Scanner(System.in);
		float numero=0.0f;
        
		System.out.println("Digite um numero:");
		numero=leitor.nextFloat();
		
		if(numero > 1 && numero <5) {
			System.out.println("Est� dentro Intervalo");
		}else {System.out.println(" Numero Invalido!");}
	}

}
