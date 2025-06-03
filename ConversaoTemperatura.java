package lista01;
	import java.util.Scanner;
	
public class ConversaoTemperatura {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
			float celsius = sc.nextFloat();
			
			float Fahrenheit = (celsius * 9/5) + 32;
		System.out.println(+celsius+ "°C convertido em Fahrenheit é igual à: " +Fahrenheit+ "°F");
		sc.close();
	}
}
