package classe;



public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		
		var saldo = p1.nSaldo = 3;
		System.out.println(saldo);
		System.out.println(Produto.Cadastro.saldo);
		
		
		Produto a1= new Produto();
		Produto a2= new Produto();
		
		a1.nome ="Leo";
		a2.nome = "Leo";
		
		System.out.println(a1 == a2);
		
		
		
		
		var ex = p1.precoComDesconto(100,10);
		
		System.out.println(ex);
		
		
	}
}
