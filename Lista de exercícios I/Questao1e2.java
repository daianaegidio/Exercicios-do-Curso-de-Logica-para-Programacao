import java.util.Scanner;

public class Questao1e2 {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner(System.in);
		float num1= 0.0f;
		float num2= 0.0f;
		int opcao=0;
		
		System.out.println("Digite o primeiro Número:");
		num1= leitor.nextFloat();
		
		System.out.println("Digite o Segundo Número");
		num2=  leitor.nextFloat();
		
		System.out.println("1- Somar");
		System.out.println("2- Subtração");
		System.out.println("3- Multiplicação");
		System.out.println("4- Divisão");
		opcao=leitor.nextInt();
		
		switch (opcao) {
		
		case 1:
			float soma= num1+num2;
			
			System.out.println("A Soma dos Números é:"+ soma);
			
			break;
			
		case 2 :
			
			float sub= num1 - num2;
			System.out.println("A Subtração dos Números é:" + sub);
			
			break;
			
		case 3:
			float mult= num1 * num2;
			System.out.println("A Multiplicação dos Números é:" + mult);
			
			break;
			
		case 4:
			float divisao=num1 / num2;
			System.out.println("A Divisão dos Números é:" + divisao);
			break;
			
		default:
			System.out.println("Opção Inválida!");
		}
		
		

	}

}
