import java.util.Scanner;

public class Questao21 {

	public static void main(String[] args) {
	
      
	
      Scanner leitor= new Scanner (System.in);
      String nome;
      int saude=0, idade=0,sexo=0, resposta=0, contador=0;
      do {
      
      System.out.println("Digite o nome:");
      nome=leitor.next();
      
      System.out.println("Digite o Sexo:");
      System.out.println("1- Feminino");
      System.out.println("2- Masculino");
      sexo=leitor.nextInt();
      System.out.println("Digite o Idade:");
      idade=leitor.nextInt();
      System.out.println("Estado de Saude");
      System.out.println("1- Bom");
      System.out.println("2- Ruim");
      saude= leitor.nextInt();
      
    
      if(idade<=18 && saude==1 && sexo==2) {
    	  
    	  System.out.println(nome + ": Está Apto para o Servico Obrigatorio" );
      }else {
    	  
    	  System.out.println(nome + ": Não está apto para Servico Obrigatorio");
      }
      
      System.out.println("Deseja fazer uma nova consulta? ");
      System.out.println("1- Sim 2- Nao ");
      resposta=leitor.nextInt();
      
      contador++;
	}while(resposta == 1);
System.out.println("O Total de Cadastros analisados é: " +contador);
	}

}
