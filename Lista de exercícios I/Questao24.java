import java.util.Scanner;

public class Questao24 {

	public static void main(String[] args) {
		
		/**
		 *  Faça um algoritmo que receba “N” números e mostre positivo,
		 *  negativo ou zero para cada número;
		 */
		
		Scanner leitor= new Scanner (System.in);
		float numero=0.0f;
		int resposta= 0;
		
		do {
		
		System.out.println("Digite um numero:");
		numero=leitor.nextFloat();
		
		if(numero > 0) {System.out.println(" Numero Positivo");
		} else if (numero < 0) {System.out.println("Numero Negativo");
		}else {System.out.println("E ZERO");}
		
		System.out.println("Deseja Coninuar?");
		System.out.println("1- sim");
		System.out.println("2- nao");
		resposta=leitor.nextInt();
	}while(resposta != 2);
	}

}
