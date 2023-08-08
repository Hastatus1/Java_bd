package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Leo", 65);
		Pessoa p2 = new Pessoa("Juan", 92);
		
		Comida c1 = new Comida("Bacon", 0.3);
		Comida c2 = new Comida ("Carne", 0.430);
		
		
		
		p1.comer(c1);
		
		p2.comer(c2);
		
		
//		System.out.println(p1.nome);
//		System.out.println(p1.peso);
//		System.out.println(p2.nome);
//		System.out.println(p2.peso);
//		
	}

}

