import java.util.Scanner;

public class Questao27 {

	public static void main(String[] args) {
       
		/**
		 * A concession�ria de ve�culos �CARANGO� est� vendendo os seus ve�culos com desconto. 
		 * Fa�a um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente.
		 *O desconto dever� ser calculado sobre o valor do ve�culo de acordo com o combust�vel 
		 *(�lcool � 25%, gasolina � 21% ou diesel�14%). Com valor do ve�culo zero encerra entrada de dados. 
		 *Informe total de desconto e total pago pelos clientes;
		 */
		
		
       Scanner leitor= new Scanner(System.in);
       float valor=0.0f, desconto=0.0f;
       int combustivel=0;
       
       do {
       
       System.out.println("---Concessionaria Carango ---");   
       System.out.println("Digite o valor do Carro:");
       valor=leitor.nextFloat();
       System.out.println("Qual o tipo de carro");
       System.out.println("1- Gasolina");
       System.out.println("2- Alcool");
       System.out.println("3- Disel");
       combustivel=leitor.nextInt();
       
       if(combustivel == 1) {  desconto= valor * 0.21f;
       
       System.out.println("O Valor do desconto � R$ " + desconto);
       System.out.println("O Valor do Carro com desconto � R$ " + (valor-desconto));
       
       }else if(combustivel == 2) {  desconto= valor * 0.25f;
       
       System.out.println("O Valor do desconto � R$ " + desconto);
       System.out.println("O Valor do Carro com desconto � R$ " + (valor-desconto));
       
       }else if(combustivel == 3) { desconto= valor * 0.14f;
       
       System.out.println("O Valor do desconto � R$ " + desconto);
       System.out.println("O Valor do Carro com desconto � R$ " + (valor-desconto));
       }else {System.out.println("Op��o Invalida!!");}
       
       }while(valor != 0);
}
}
