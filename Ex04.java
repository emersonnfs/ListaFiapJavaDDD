package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double lado, �rea;
		
		System.out.printf("Digite a medida da aresta:");
		lado = ler.nextDouble();
		
		�rea = lado * lado;
		
		System.out.printf("A �rea do quadrado �: %.2f" , �rea);
	}

}
