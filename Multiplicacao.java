package lista01;
	import java.util.Scanner;
	
public class Multiplicacao {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Digite o primeiro valor: ");
		int numero1 = sc.nextInt();
	System.out.println("Digite o segundo valor: ");
		int numero2 = sc.nextInt();
		
		int resultado = numero1 * numero2;
		
	System.out.println("Se multiplicar " + numero1 + " X " + numero2 + " é igual à: " + resultado);
		sc.close();
	}	
}
