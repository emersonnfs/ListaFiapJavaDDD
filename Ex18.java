package entrada_processamento_sa�da;

import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a , v0, t, vm, vk;
		
		System.out.printf("Informe a acelar��o em metros por segundo: ");
		a = ler.nextDouble();
		
		System.out.printf("Informe a velocidade inicial em metros por segundo: ");
		v0 = ler.nextDouble();
		
		System.out.printf("Informe o tempo do percuso em segundos: ");
		t = ler.nextDouble();
		
		vm = v0 + (a * t);
		vk = vm * 3.6;
		
		if (vk <= 40) {
				System.out.printf("%.1f km/h---Ve�culo muito lento", vk);
			}else if ((40 < vk) && (vk <= 60)){
				System.out.printf("%.1f km/h---Ve�culo na velocidade permitida", vk);
			}else if ((60 < vk) && (vk <= 80)) {
				System.out.printf("%.1f km/h---Ve�culo na velocidade de cruzeiro", vk);
			}else if ((80 < vk) && (vk <= 120)) {
				System.out.printf("%.1f km/h---Ve�culo r�pido", vk);
			}else if((vk > 120)) {
				System.out.printf("%.1f km/h---Ve�culo muito r�pido", vk);
		}
	}
}
