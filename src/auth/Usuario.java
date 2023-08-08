package auth;

import java.util.Objects;

public class Usuario {

	String nome;
	String senha;
	
	Usuario(String nome, String senha){
		this.nome = nome;
		this.senha = senha;
		
	}

	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha);
	}
	
	
	
	
}
