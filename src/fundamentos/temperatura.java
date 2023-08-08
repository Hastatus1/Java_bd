package fundamentos;
import java.math.*;
import java.text.DecimalFormat;
import java.util.Scanner;


public class temperatura {
	public static void main(String[] args) {

		
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius que gostaria de transformar em Farenheit: ");
		
		double temperatura = sc.nextDouble();
		
		final double converter = (temperatura - 32) * 5 / 9;
		
		System.out.println(temperatura + " Em Celsius e igual a " + new DecimalFormat("#.#").format(converter) + " em Farenheit");
		System.out.println(converter);
		
		
		
		
		
		
		
		
	}
}
