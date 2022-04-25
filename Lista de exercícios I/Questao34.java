import java.util.Scanner;

public class Questao34 {

	public static void main(String[] args) {
		Scanner leitor= new Scanner (System.in);
		int idade=0;
		
		System.out.println("Digite a Idade:");
		idade=leitor.nextInt();
		
		if(idade >=5 && idade<=7) {System.out.println("Nadador Infantil A!");
		}else if (idade>= 8 && idade <= 10) {System.out.println("Nadador Infantil B!");
		}else if (idade>= 11 && idade<= 13) {System.out.println("Nadador Juvenil A!");
		}else if(idade >= 14 && idade<=17) {System.out.println("Nadador Juvenil B!");
		}else if(idade>= 18 && idade <=25) {System.out.println("Nadador Senior!");
		}else {System.out.println("Idade fora da faixa etária");}
	}

}
