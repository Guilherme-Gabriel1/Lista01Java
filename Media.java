package lista01;
	import java.util.Scanner;
	
public class Media {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeira nota: ");
			float numero1 = sc.nextFloat();
		System.out.println("Digite o segunda nota: ");
			float numero2 = sc.nextFloat();
		System.out.println("Digite o terceira nota: ");
			float numero3 = sc.nextFloat();
			float media = (numero1 + numero2 + numero3) / 3;
			
		System.out.println("A media entre " + numero1 + ", " + numero2 + " e " + numero3 + " é igual à: " + media);
		
		sc.close();
	}
	
}
