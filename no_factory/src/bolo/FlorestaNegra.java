package bolo;

public class FlorestaNegra extends Bolo{
	
	public FlorestaNegra(String nome, String tipo, Float preco) {
		setNome(nome);
		setPreco(preco);
		setTipo(tipo);
	}

	@Override
	public void receita() {
		System.out.println("receita de bolo de floresta negra\n");
	}

}
