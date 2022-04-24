import java.util.Scanner;

public class Questao26 {

	public static void main(String[] args) {
		
		/**
		 * Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. 
		 * Caso o usuário digite um número que não esteja neste intervalo, exibir
		 * a seguinte mensagem: número inválido;
		 */
		
		Scanner leitor= new Scanner(System.in);
		float numero=0.0f;
        
		System.out.println("Digite um numero:");
		numero=leitor.nextFloat();
		
		if(numero > 1 && numero <5) {
			System.out.println("Está dentro Intervalo");
		}else {System.out.println(" Numero Invalido!");}
	}

}
