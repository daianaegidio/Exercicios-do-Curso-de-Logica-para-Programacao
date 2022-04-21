import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {

		Scanner leitor= new Scanner (System.in);
		float celsius=0.0f, f=0.0f;

		System.out.println("Digite a temperatura em graus Celsius:");
		celsius=leitor.nextFloat();
		
		f=(9* celsius +160)/5;
		
		System.out.println("A Temperatura é " + f + " Fahrenheit");
	}

}
