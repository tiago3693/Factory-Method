package bolo;

public class Abacaxi extends Bolo {
	
	public Abacaxi() {
		setNome("bolo abacaxi");
		setPreco(1f);
		setTipo("abacaxi tipo");
	}

	@Override
	public void receita() {
		System.out.println("receita do bolo de abacaxi\n");
	}
	
}
