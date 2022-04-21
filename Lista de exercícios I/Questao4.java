import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner(System.in);
		String nome;
		float salario=0.0f, totalVendas=0.0f;
		
		
		System.out.println("Digite o Nome do Vendedor:");
		nome=leitor.nextLine();
		
		System.out.println("Digite o Salário fixo:");
		salario=leitor.nextFloat();
		
		System.out.println("Digite o valor total de vendas efetuadas:");
        totalVendas=leitor.nextFloat();
        
        float comissao= totalVendas * 0.15f;
     
        
        System.out.println("Nome do Vendedor: " + nome);
        System.out.println("Salario Fixo:" + salario);
        System.out.println("O Salario com Comissao:" + (salario +comissao));
        

	}

}
