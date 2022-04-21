import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner (System.in);
		float cotacao=0.0f,dolar=0.0f, real=0.0f;
		
		System.out.println("Qual o valor da cotação do dolar:");
		cotacao= leitor.nextFloat();
		System.out.println("Qual a quantidade de dolares disponivel:");
		dolar= leitor.nextFloat();
		
		real=dolar/cotacao;
		
		System.out.println(dolar + " Dolares Corresponde a " + real + " Reais" );
	}

}
