import java.util.Scanner;


public class Questao9 {

	public static void main(String[] args) {

     Scanner leitor=  new Scanner (System.in);
     float deposito=0.0f, valorFinal=0.0f;
     
     System.out.println("Qual o valor para deposito:");
     deposito=leitor.nextFloat();
  
     valorFinal= deposito + (deposito * 0.07f);
     System.out.print("Valor com rendimento: R$ " );
     System.out.format("%.2f", valorFinal);

	}

}
