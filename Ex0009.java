package entrada_processamento_saída;

import java.util.Scanner;

public class Ex0009 {

	public static void main(String[] args) {
	
		Scanner ler= new Scanner(System.in);
		
		double p1,p2,p3,p4,p5,total,troco,valor;
		
		System.out.printf("Valor do 1° produto:");
			p1 = ler.nextDouble();
		
		System.out.printf("Valor do 2° produto:");
			p2 = ler.nextDouble();
		
		System.out.printf("Valor do 3° produto:");
			p3 = ler.nextDouble();
		
		System.out.printf("Valor do 4° produto:");
			p4 = ler.nextDouble();
		
		System.out.printf("Valor do 5° produto:");
			p5 = ler.nextDouble();
		
		total = p1+p2+p3+p4+p5;
		
		System.out.printf("O valor da sua compra foi:R$%.2f", total);
		
		System.out.printf("\n");
				
		System.out.printf("Informe o valor de pagamento:");
		valor = ler.nextDouble();
		
		troco = valor - total;
		
		System.out.printf("O troco será:R$%.2f", troco);
	}

}