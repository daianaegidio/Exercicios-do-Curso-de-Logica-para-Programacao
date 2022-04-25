import java.util.Scanner;

public class Questao33 {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner(System.in);
		int nivel=0, resposta=0;
		float horas;
		
		do {
		
		System.out.println("Escola Aprender");
		System.out.println("Digite o Nivel do Professor:");
		nivel=leitor.nextInt();
		System.out.println("Digite quantas horas trabalhadas:");
		horas= leitor.nextFloat();
		
		if (nivel== 1) {
			System.out.println("O Salario é R$ " + (12 * horas));
		}else if(nivel ==2) {System.out.println("O Salario é R$ " + (17 * horas));
		}else if(nivel ==3) {System.out.println("O Salario é R$ " + (25 * horas));
		}else {System.out.println("Nivel Invalido!");}
		
		System.out.println("Deseja Continuar:");
		System.out.println("1- Sim");
		System.out.println("2- Nao");
		resposta=leitor.nextInt();
		}while(resposta !=2);
	}

}
