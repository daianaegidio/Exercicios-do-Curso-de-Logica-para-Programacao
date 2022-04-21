import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner(System.in);
        float precoCusto=0.0f,lucro=0.0f, valorFinal=0.0f;
        
        System.out.println("Digite o valor de custo do Produto:");
        precoCusto=leitor.nextFloat();
        
        System.out.println("Digite o percetual do lucro desejado:");
        lucro= leitor.nextFloat();
        
        valorFinal= precoCusto + (precoCusto * (lucro/100));
        
        System.out.println("Valor da Venda é R$ " + valorFinal);
	}

}
