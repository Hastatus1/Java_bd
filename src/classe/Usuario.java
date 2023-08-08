package classe;

public class Usuario {

	String nome;
	String email;
	
	@Override
	public boolean equals(Object objeto) {

		
		Usuario outro = (Usuario) objeto;
		
		
		return outro.nome.equals(this.nome);
	}
}
