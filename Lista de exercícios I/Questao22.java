import java.util.Scanner;

public class Questao22 {

	public static void main(String[] args) {
		
		/**
		 * Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos.
		 * Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. 
		 * Informe o valor de custo de cada produto, o valor de venda de cada produto, 
		 * a média de preço de custo e do preço de venda;
		 */
		
		Scanner leitor=new Scanner (System.in);
		float valorVenda=0.0f, valorCusto=0.0f;
		float mediaCusto=0.0f, mediaVenda=0.0f;
		float lucroTotal=0.0f, prejuizoTotal=0.0f;
		
		for(int i=0; i<40;i++) {
		System.out.println("Digite o valor de Custo:");
		valorCusto=leitor.nextFloat();
		
		System.out.println("Digite o valor de Venda:");
		valorVenda=leitor.nextFloat();
		
		if(valorVenda > valorCusto) {
			 System.out.println("O Produto teve o lucro de R$ " + (valorVenda- valorCusto));
		     lucroTotal=lucroTotal +(valorVenda- valorCusto);
		     
		}else if (valorVenda < valorCusto) {
			 System.out.println("O Produto teve o prejuizo de R$ " + (valorVenda- valorCusto));
		      prejuizoTotal= prejuizoTotal + (valorCusto - valorVenda);
		      
		} else {System.out.println("O Produto Não teve lucro e nem prejuizo " );}
	
	    mediaCusto= mediaCusto + valorCusto;
	    mediaVenda= mediaVenda + valorCusto;
		}
		
	    System.out.println("A media de Custo é R$ " + (mediaCusto/40));
	    System.out.println("A media de Venda é R$ " + (mediaVenda/40));
	    
	    if(lucroTotal > prejuizoTotal) {System.out.println("Teve o lucro total de R$ " +lucroTotal);
	    }else if (lucroTotal < prejuizoTotal) {System.out.println("Teve o prejuizo total de R$ " +prejuizoTotal);
	    } else {System.out.println("Não teve lucro e nem prejuizo");}
	    
	}

}
