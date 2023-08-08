package classe;

public class Produto {

	String nome;
	double preco;
	double desconto; 
	static int nSaldo;

	
	public class Cadastro {
		
		static int saldo = nSaldo;
	}
	
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	Produto(){
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	double precoComDesconto(double preco1, double desconto1) {
		
		
		double precoDesconto = preco1 - (0.2*100);
		
		
		return precoDesconto;
	}
}
