import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor= new Scanner(System.in);
		float distancia=0.0f, combustivel=0.0f, consumo=0.0f;
		
		System.out.println("---CALCULAR CONSUMO DE COMBUSTIVEL---");
		
		System.out.println("Digite a Distancia percorrida:");
		distancia=leitor.nextFloat();
		
		System.out.println("Digite o total de Combustivel gasto:");
		combustivel=leitor.nextFloat();
		
		consumo= distancia/ combustivel;
		
		System.out.println("O Consumo Médio do Automovel é:" + consumo);
		
	}

}
