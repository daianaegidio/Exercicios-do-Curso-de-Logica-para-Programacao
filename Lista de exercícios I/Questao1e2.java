import java.util.Scanner;

public class Questao1e2 {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner(System.in);
		float num1= 0.0f;
		float num2= 0.0f;
		int opcao=0;
		
		System.out.println("Digite o primeiro N�mero:");
		num1= leitor.nextFloat();
		
		System.out.println("Digite o Segundo N�mero");
		num2=  leitor.nextFloat();
		
		System.out.println("1- Somar");
		System.out.println("2- Subtra��o");
		System.out.println("3- Multiplica��o");
		System.out.println("4- Divis�o");
		opcao=leitor.nextInt();
		
		switch (opcao) {
		
		case 1:
			float soma= num1+num2;
			
			System.out.println("A Soma dos N�meros �:"+ soma);
			
			break;
			
		case 2 :
			
			float sub= num1 - num2;
			System.out.println("A Subtra��o dos N�meros �:" + sub);
			
			break;
			
		case 3:
			float mult= num1 * num2;
			System.out.println("A Multiplica��o dos N�meros �:" + mult);
			
			break;
			
		case 4:
			float divisao=num1 / num2;
			System.out.println("A Divis�o dos N�meros �:" + divisao);
			break;
			
		default:
			System.out.println("Op��o Inv�lida!");
		}
		
		

	}

}
