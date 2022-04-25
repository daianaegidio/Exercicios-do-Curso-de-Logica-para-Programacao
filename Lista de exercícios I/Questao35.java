import java.util.Scanner;

public class Questao35 {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner(System.in);
		int kw=0, tipoCliente=0;
		float gasto=0.0f;
		
		System.out.println("Digite os Kilowatts:");
		kw= leitor.nextInt();
		
		System.out.println("Digite o tipo de Cliente:");
		System.out.println("1- Residencia");
		System.out.println("2- Comercio");
		System.out.println("3- Industria");
		tipoCliente= leitor.nextInt();
		
		switch (tipoCliente) {
		
		case 1:
			gasto=kw * 0.60f;
			 System.out.format("O Valor da Conta de luz é R$ %.2f " , gasto);
			
			break;
		case 2:
			gasto=kw * 0.48f;
			System.out.format("O Valor da Conta de luz é R$ %.2f" , gasto);
			break;
			
		case 3:
			gasto=kw * 1.29f;
			System.out.format("O Valor da Conta de luz é R$ %.2f " , gasto);
			break;
		default:
			System.out.println("Codigo Invalido!");
		}
		
      
	}

}
