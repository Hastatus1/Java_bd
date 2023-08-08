package auth;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int escolha = 0;
		
		Usuario a1 = new Usuario("Leo", "abc");
		
		
		
		Metodos.painel();
		
		escolha = sc.nextInt();
		
		if(escolha == 1 ) {
			
		}
		
		else if(escolha == 2) {
			
			Metodos.escolha2();
			
		}
		

		
		sc.close();
	}
	
}
