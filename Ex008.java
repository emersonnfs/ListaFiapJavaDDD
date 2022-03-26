package entrada_processamento_saída;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
	
		Scanner ler= new Scanner(System.in);
		
		double a, b, cotacao;
		
		System.out.printf("Informe a cotação do dia:");
		a = ler.nextDouble();
		
		System.out.printf("Informe o valor:");
		b = ler.nextDouble();
		
		cotacao = a * b;
		
		System.out.printf("Sua cotação do dia é:R$ %.2f", cotacao);
	}

}
