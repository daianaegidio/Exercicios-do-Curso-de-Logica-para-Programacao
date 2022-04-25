import java.util.Scanner;

public class Questao32 {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner(System.in);
		int lado1=0, lado2=0,lado3=0;
		
		System.out.println("Digite o primeiro numero Inteiro:");
		lado1=leitor.nextInt();
		
		System.out.println("Digite o segundo numero Inteiro:");
		lado2=leitor.nextInt();
		
		System.out.println("Digite o terceiro numero Inteiro:");
		lado3=leitor.nextInt();
		
		if(lado1 > (lado3 +lado2) ||lado2 >(lado1 + lado3) || lado3 > (lado2 +lado1)) {
			System.out.println("Não é um triangulo!");
		}else if (lado1== lado2 && lado2==lado3) {
			System.out.println("Triangulo Equilatero!");
		}else if(lado1!= lado2 && lado2!=lado3 && lado1 != lado3) {
			System.out.println("Triangulo Escaleno!");
		}else {System.out.println("Triângulo Isóscele!");}

	}

}
