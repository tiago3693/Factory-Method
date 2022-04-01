package bolo;

public class FlorestaNegra extends Bolo{
	
	public FlorestaNegra() {
		setNome("bolo floresta negra");
		setPreco(3f);
		setTipo("floresta negra tipo");
	}

	@Override
	public void receita() {
		System.out.println("receita de bolo de floresta negra\n");
	}

}
