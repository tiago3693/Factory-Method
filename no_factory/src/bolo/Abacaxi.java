package bolo;

public class Abacaxi extends Bolo {
	
	public Abacaxi(String nome, String tipo, Float preco) {
		setNome(nome);
		setPreco(preco);
		setTipo(tipo);
	}

	@Override
	public void receita() {
		System.out.println("receita do bolo de abacaxi\n");
	}
	
}
