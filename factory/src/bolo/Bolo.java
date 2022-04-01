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
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

}
