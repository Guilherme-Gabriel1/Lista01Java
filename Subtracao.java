package lista01;
import java.util.Scanner;

public class Subtracao {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de X: ");
			int x = sc.nextInt();
		System.out.println("Digite o valor de Y: ");
			int y = sc.nextInt();
			
			int resultado = x - y;
		System.out.println("Subtraindo X - y é igual a "+ resultado); 
		sc.close();
	}

}
