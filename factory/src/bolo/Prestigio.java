package bolo;

public class Prestigio extends Bolo{
	
	public Prestigio(String nome, String tipo, Float preco) {
		setNome(nome);
		setPreco(preco);
		setTipo(tipo);
	}
	
	@Override
	public void receita() {
		System.out.println("receita de bolo de prestigio\n");
	}
}
