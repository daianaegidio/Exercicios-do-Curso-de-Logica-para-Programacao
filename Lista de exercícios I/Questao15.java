import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
      
		Scanner leitor= new Scanner (System.in);
		int numero=0;
		
		System.out.println("Digite um numero Inteiro:");
	    numero= leitor.nextInt();
	    
	    if((numero > 100) && (numero < 200)) {
	    	
	    	System.out.println("O Numero esta dentro do intervalo de 100 a 200");
	    }else {
	    	
	    	System.out.println("O Numero NAO esta dentro do intervalo");
	    }
		

	}

}
