import java.util.Scanner;

public class Questao20 {

	public static void main(String[] args) {
		
		/**
		 * A concessionária de veículos “CARANGO VELHO” está vendendo
		 * os seus veículos com desconto. Faça um algoritmo que calcule 
		 * e exiba o valor do desconto e o valor a ser pago pelo cliente
		 * de vários carros. O desconto deverá ser calculado de acordo 
		 * com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. 
		 * O sistema deverá perguntar se deseja continuar calculando desconto
		 * até que a resposta seja: “(N) Não”. Informar total de carros com ano 
		 * até 2000 e total geral;
		 * 
		 */
		
		Scanner leitor= new Scanner ( System.in);
		float valor=0.0f, valorDesconto=0.0f, valorFinal=0.0f;
		int ano=0; 
		boolean validacao=false;
	    String resposta="n";
	    
	    
	    System.out.println("--- CARANGO VELHO ---");
	    while(validacao != true) {
		
		System.out.println("Qual o valor do Carro?");
		valor= leitor.nextFloat();
		
		System.out.println("Qual o ano do carro?");
		ano=leitor.nextInt();
		
		if(ano > 2000) {
			valorDesconto= valor * 0.07f;
			valorFinal= valor - valorDesconto;
			
		}else {valorDesconto= valor * 0.12f;
		valorFinal=valor - valorDesconto;
		}

		System.out.println("O Valor do desconto é: R$ "+ valorDesconto);
		System.out.println("O Valor do carro com desconto é: R$ "+ valorFinal);
		
		System.out.println("Deseja Continuar?");
		System.out.println("S ou N");
		resposta= leitor.next();
	
		 int result= resposta.compareToIgnoreCase("N");
		 if(result ==0) {
			 
			 validacao=true;
		 }
		
	    }
	
	}

}
