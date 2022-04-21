import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner (System.in);
		String variavelA, variavelB, auxi;
		
		System.out.println("Digite o conteudo da Variavel A:");
		variavelA=leitor.nextLine();
		
		System.out.println("Digite o conteudo da Variavel B:");
		variavelB=leitor.nextLine();
		
		auxi=variavelA;
		variavelA= variavelB;
		variavelB=auxi;
		
		System.out.println("Impressão das Variaveis");
		System.out.println("VARIAVEL A:"+ variavelA);
		System.out.println("VARIAVEL B:"+ variavelB);
	}

}
