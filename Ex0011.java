package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex0011 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.printf("Digite o primeiro n�mero: ");
			a = ler.nextInt();
			
		System.out.printf("Digite o segundo n�mero: ");
			b = ler.nextInt();
			
		if (a < b) {
			System.out.printf("%d � o menor n�mero", a);
		}else if(a == b) {
			System.out.printf("Os n�meros s�o iguais.");
		}else {
			System.out.printf("%d � o menor n�mero", b);
		}

	}

}
