	package entrada_processamento_sa�da;

	import java.util.Scanner;
	
	public class Ex012 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.printf("Informe a base do ret�ngulo");
		base = ler.nextDouble();
		
		System.out.printf("Informe a altura do ret�ngulo");
		altura = ler.nextDouble();
		
		area = base * altura;
		
		if (100<area){
			System.out.printf("Esse terreno � pequeno");
		}else if(100 > area) {
				System.out.printf("Esse terreno � pequeno");
		}


	}

}
