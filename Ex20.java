package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double p1, p2;
		
		System.out.printf("Informe a sua nota da P1:");
		p1 = ler.nextDouble();
		
		p2 = (15 - p1) / 2;
		
		System.out.printf("Voc� precis�ra tirar %.2f ou mais na P2, para ser aprovado", p2);
	}
}
