import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
	
		/**
		 * Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. 
		 * No final informe total de homens e de mulheres
		 */
		
		Scanner leitor= new Scanner ( System.in);
		String nome;
		int sexo=0, mulher=0, homem=0;
		
		
		 for(int i=0; i< 56; i++) {
			 
			 System.out.println("Digite o Nome:");
			  nome= leitor.next();
			 
			 System.out.println("Digite:");
			 System.out.println("1- Feminino");
			 System.out.println("2- Masculino");
			 sexo=leitor.nextInt();
			 
			 if(sexo==1) {
				 
				 System.out.println(nome + " é do sexo feminino");
				 
				 mulher++;
			 }else {System.out.println(nome + " é do sexo masculino");
			 homem ++;
			 }
			 
			 
		 }
		 System.out.println("O Total de Mulheres é:" + mulher);
		 System.out.println("O Total de Homens é:" + homem);
	}

}
