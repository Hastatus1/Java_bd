package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos alunos sao? ");
		int qtdAlunos = sc.nextInt();
		
		System.out.print("Quantas notas por aluno? ");
		int qtdNotas = sc.nextInt();
		
		double[][] notas = new double[qtdAlunos][qtdNotas];
		
		
		for(int a = 0; a < notas.length; a++) {
			
			for (int n = 0; n < notas[1].length; n++) {
				
				System.out.print("Digite a nota " + (n+1) + " do aluno: " + (a+1) + ": ");
				
				notas[a][n] = sc.nextDouble();
				
//				total += notas[a][n];
			}
		}
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Notas do aluno " + (i+1) + ": "+  Arrays.toString(notas[i]));
			
			
		}
		
		
		sc.close();
	}
}
