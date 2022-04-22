import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
	    
		/**
		 * Escreva um algoritmo que leia o nome e as três notas
		 * obtidas por um aluno durante o semestre. 
		 * Calcular a sua média (aritmética), informar o nome e
		 * sua menção aprovado (media >= 7), Reprovado (media <= 5)
		 * e Recuperação (media entre 5.1 a 6.9)
		 */
		
		
		Scanner leitor=  new Scanner (System.in);
		float nota1=0.0f, nota2=0.0f, nota3=0.0f, media=0.0f;
		String nome;
		
		System.out.println("Digite o Nome:");
		nome= leitor.nextLine();
		
		System.out.println("Digite a primeira Nota:");
		nota1=leitor.nextFloat();
		
		System.out.println("Digite a segunda Nota:");
		nota2=leitor.nextFloat();
		
		System.out.println("Digite a terceira Nota:");
		nota3=leitor.nextFloat();
		
		media= (nota1+ nota2+ nota3)/3;
		
		if(media >= 7) {
			System.out.println("Parabens!!! "+ nome + " foi aprovado");
			
		}else if(media >5) {
			
			System.out.println(nome + " está de recuperação!");
		}else {
			
			System.out.println(nome + " está Reprovado");
		}
		

	}

}
