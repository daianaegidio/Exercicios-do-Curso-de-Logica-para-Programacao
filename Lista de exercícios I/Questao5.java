import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner (System.in);
		String nome;
		float nota1=0.0f, nota2=0.0f, nota3=0.0f, media=0.0f;
		
		
		System.out.println("Digite o Nome do Aluno:");
		nome= leitor.nextLine();
		System.out.println("Digite a primeira nota:");
		nota1=leitor.nextFloat();
		System.out.println("Digite a segunda nota:");
		nota2=leitor.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		nota3=leitor.nextFloat();
		
		media=(nota1+ nota2+ nota3)/3;
		
		
		System.out.print("O Aluno: " + nome + " Tem a Media: ");
		System.out.format("%.2f", media);
	}

}
