import java.util.Scanner;

public class Questao29 {

	public static void main(String[] args) {
		
		/**
		 * Faça um algoritmo que receba o número do mês e mostre o mês correspondente. 
		 * Valide mês inválido;
		 * 
		 */
		
		Scanner leitor= new Scanner( System.in);
		int numero=0;
		
		System.out.println("Digite o numero do Mes:");
		numero=leitor.nextInt();
		
		if(numero==1 || numero==01) {
			System.out.println("Janeiro");
			
		}else if(numero==2 || numero==02) {
			
			System.out.println("Fevereiro");
			
		}else if(numero==3 || numero==03) {
			
			System.out.println("Março");
			
		}else if(numero==4 || numero==04) {
			
			System.out.println("Abril");
		
		}else if(numero==5 || numero==05) {
			System.out.println("Maio");
		
		}else if(numero==6 || numero==06) {
			System.out.println("Junho");
		
		}else if(numero==7 || numero==07) {
			System.out.println("Julho");
			
		}else if(numero== 8) {System.out.println("Agosto");
		}else if(numero== 9) {System.out.println("Setembro");
		
		}else if(numero== 10) {System.out.println("Outubro");
		
		} else if (numero== 11) {System.out.println("Novembro");
		
		}else if (numero== 12) {System.out.println("Dezembro");

		}else {System.out.println("Mes Invalido!!");}
	}

}
