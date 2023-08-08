package fundamentos;
import java.math.*;

public class AreaCircunferencia {

	public static void main(String[] args) {
		boolean par;
		int num1 = 2;
		int num2 = 3;
		int resultado = (num1 + num2)%2;
		
		if(resultado == 0) {
			par = true;
		}
		else {
			par = false;
		}
		
		double quadrado = Math.pow(3,2);
		
		System.out.println(resultado);
		System.out.println(par);
		
		System.out.println("A soma dos numeros e igual a um numero par: " + par);
		System.out.println(quadrado);
	}
}
