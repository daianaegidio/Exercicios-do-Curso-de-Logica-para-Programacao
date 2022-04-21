import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		
		Scanner leitor=new Scanner(System.in);
		float custo=0.0f, valorFinal=0.0f;
		System.out.println("Digite o custo de Fabrica do Carro:");
		custo=leitor.nextFloat();
		
		valorFinal= custo + (custo* 0.45f);
		valorFinal= valorFinal + (valorFinal * 0.28f);
		
		System.out.print("O valor de venda é R$ ");
        System.out.format("%.2f", valorFinal);
	}

}
