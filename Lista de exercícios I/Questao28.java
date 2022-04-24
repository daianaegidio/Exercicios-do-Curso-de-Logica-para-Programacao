import java.util.Scanner;

public class Questao28 {

	public static void main(String[] args) {
		
		
		Scanner leitor= new Scanner (System.in);
		String nome;
		float salario=0.0f, salarioMinimo=0.0f, reajuste=0.0f;
		
		System.out.println("Digite o Valor do Salario Minimo:");
		salarioMinimo=leitor.nextFloat();
		
	for(int i=0; i <584; i++) {
       System.out.println("Digite o Nome do Funcionario:");
       nome= leitor.nextLine();
       System.out.println("Digite o Salario do Funcionario:");
       salario= leitor.nextFloat();
       
       if(salario < (salarioMinimo * 3)) {
    	   reajuste= salario * 0.50f;
    	   
       }else if (salario > (salarioMinimo * 3) && salario < (salarioMinimo * 10) ) {
    	   
    	   reajuste= salario * 0.20f;
    	   
       }else if (salario > (salarioMinimo * 10) && salario < (salarioMinimo * 20) ) {
    	   reajuste= salario * 0.15f; 
       }else {
    	   reajuste= salario * 0.10f; 
       }
       
       
       System.out.println("Funcionario: " + nome);
	   System.out.println("Salário Atual: " + salario);
	   System.out.println("Reajuste: " + reajuste);
	   System.out.println("Novo Salario: " + (salario+ reajuste));
	   
	}
	}

}
