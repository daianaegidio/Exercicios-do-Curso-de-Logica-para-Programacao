import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		
		Scanner leitor=new Scanner(System.in);
		
		int numero1=0, numero2=0;
		
		System.out.println("Digite o primeiro numero inteiro: ");
		numero1=leitor.nextInt();
		System.out.println("Digite o segundo numero inteiro: ");
		numero2=leitor.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O Numero "+ numero1+ " é MAIOR que o Numero " + numero2);
			
		}else if(numero1 < numero2) {
			System.out.println("O Numero "+ numero2+ " é MAIOR que o Numero " + numero1);
			}else {System.out.println("Os Numeros sao Iguais");}
	}

}
