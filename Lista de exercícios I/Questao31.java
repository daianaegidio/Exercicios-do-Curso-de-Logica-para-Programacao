import java.util.Scanner;

public class Questao31 {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner(System.in);
		float a=0.0f, b=0.0f;
		char c;
		
		System.out.println("Digite o valor de A:");
		a=leitor.nextFloat();
		System.out.println("Digite o valor de B:");
		b=leitor.nextFloat();
		
		System.out.println("Digite operador aritmético:");
		c=leitor.next().charAt(0);
		
		if(c == '+') {
			System.out.println(a + " + "  +b + ": "+ (a+b) );
		}else if (c == '-') {System.out.println(a + " - " +b + ": "+ (a-b) );
		}else if(c=='x' || c== 'X') {System.out.println(a + " X " +b + ": "+ (a*b) );
		}else if (c== '/') {
			if(b != 0) {
			System.out.println(a + " / " +b + ": "+ (a/b));}else {
				System.out.println("Não é Possivel Dividir por Zero!");
			}
		}else {System.out.println("Operador Não Válido!");}
	}

}
