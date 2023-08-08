package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		double media = 0;
		
		
		System.out.print("Digite a quantidade de notas que terao na lista: ");
		double quantNotas = sc.nextDouble();
		
		double notas[] = new double[(int) quantNotas];
		
		for(int i = 0; i <quantNotas; i++) {
			
			System.out.print("Digite a nota " + (i+1) + ": ");
			double novaNota = sc.nextDouble();
			
			notas[i] = novaNota;
			
		}
		
		
		for(double nota: notas) {
			total += nota;
			media = total/quantNotas;
			
		}
		
		System.out.println("Media total: " + media);
		
		
		
		
		
	
		
		
		
		
		
		
		sc.close();
	}
}
