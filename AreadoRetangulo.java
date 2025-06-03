package lista01;
import java.util.Scanner;

public class AreadoRetangulo {
	public static void main (String []args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o primeiro numero: ");
		double altura = sc.nextDouble();
	System.out.println("Digite o segundo valor: ");
		double largura = sc.nextDouble();
		double resultado = (altura * largura);
	System.out.println("A area do retangulo é igual à: "+resultado);
	sc.close();
}
}
