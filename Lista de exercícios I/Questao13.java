import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner (System.in);
		int numero=0;
		
		System.out.println("Digite um numero inteiro:");
        numero= leitor.nextInt();
        
        if(numero>10) {
        	
        	System.out.println("O Numero"+ numero+ " é MAIOR que 10");
        }else {System.out.println("O Numero"+ numero+ " é MENOR que 10");}
	}

}
