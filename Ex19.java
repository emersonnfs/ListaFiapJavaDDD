package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double p1, p2, media;
		
		System.out.printf("Informe a nota da P1: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Informe a nota da P2: ");
		p2 = ler.nextDouble();
		
		media = (((p2 * 2) + p1)/3);
		
		if (media > 5) {
			System.out.printf("Voc� foi Aprovado e sua m�dia foi %.2f", media);
		}else if (media < 5) {
			System.out.printf("Voc� N�O FOI Aprovado e sua m�dia foi %.2f", media);
		}else {
			System.out.printf("Voc� pasou raspando %.2f", media);
		}
	}

}
