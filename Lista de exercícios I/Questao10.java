import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
	
		Scanner leitor= new Scanner(System.in);
	    float valor=0.0f, prestacoes=0.0f;
    System.out.println("Loja Mamão com Açucar");
	System.out.println("Qual o valor da compra?");
	valor=leitor.nextFloat();
	
	prestacoes=valor/5;
	
    System.out.print("Valor das Parcelas: R$ " );
    System.out.format("%.2f", prestacoes);
	
	}

}
