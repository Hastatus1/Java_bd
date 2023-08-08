package classe;

public class Pessoa {
	String nome;
	Double peso;

	void comer(Comida comida) {
		
		
		System.out.println("Nome: " + this.nome + " Peso inicial: " + this.peso );
		this.peso += comida.peso;
		System.out.println("Peso apos comer: " + peso);
		
	}
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	
	
	
}
