package classe;

public class Equals {

	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro silva";
		u1.email = "pedro.silva@ezemail.com";
		Usuario u2 = new Usuario();
		u2.nome = "Pedro silva";
		u2.email = "pedro.silva@ezemail.com";
		
		System.out.println(u1.equals(u2));
	}
}
