package entrada_processamento_saída;

import java.util.Scanner;

public class Ex0011 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.printf("Digite o primeiro número: ");
			a = ler.nextInt();
			
		System.out.printf("Digite o segundo número: ");
			b = ler.nextInt();
			
		if (a < b) {
			System.out.printf("%d é o menor número", a);
		}else if(a == b) {
			System.out.printf("Os números são iguais.");
		}else {
			System.out.printf("%d é o menor número", b);
		}

	}

}
