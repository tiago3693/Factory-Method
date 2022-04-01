package bolo;

public abstract class Bolo {

	private String nome;
	private String tipo;
	private Float preco;

	public void sobreoBolo() {
		System.out.println(nome + "\n" + preco + "\n" + tipo);
	}

	public void receita() {

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

}
