package auth;

import java.util.Scanner;

public class Metodos {

	static Scanner sc = new Scanner(System.in);
	static int escolha = 0;
	static int i = 0;
	static String novoUsuario;
	static String novaSenha;
	
	static String[] user = new String[10];
	static String[] password = new String[10];
	
	static void painel() {
		System.out.println("----------------------------------"
				+ "\nSelecione a opcao desejada: \n1 - Logar no sistema \n2 - Cadastrar usuario e senha \n3 - Sair"
				+ "\n----------------------------------");
		
	}
	
	static void escolha1() {
		
	}
	
	
	static void escolha2() {
		
		
		
		System.out.print("Digite o novo login: ");
		novoUsuario = sc.next();
		user[i] = novoUsuario;
		
		System.out.print("Digite a nova senha: ");
		novaSenha = sc.next();
		password[i] = novaSenha;
		
		criarUsuario();
		
		
		System.out.println("----------------------------------\n"
				+ "Parabens, usuario cadastrado com sucesso"
				+ "\n----------------------------------");
		i++;
		
		criarUsuario();
		
		System.out.println("púdim");
	}
	
	static void criarUsuario() {
		int[] DBA = {1,2,3,4,5,6,7,8,9,10};
		
		Usuario a = new Usuario(user[i], password[i]);
	}
}
