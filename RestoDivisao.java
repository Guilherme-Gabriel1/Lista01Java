package lista01;
import java.util.Scanner;

public class RestoDivisao {
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o primeiro numero: ");
		int numero1 = sc.nextInt();
	System.out.println("Dgite o segundo numero: ");
		int numero2 = sc.nextInt();
		
		int resultado = numero1 % numero2;
		
	System.out.println("O resto da divisão entre " + numero1 + " e " + numero2 + " é igual à: " + resultado);
	sc.close();
}		
}
