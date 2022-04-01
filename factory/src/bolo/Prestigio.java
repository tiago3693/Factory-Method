package bolo;

public class Prestigio extends Bolo{
	
	public Prestigio() {
		setNome("presitigio bolo");
		setPreco(5f);
		setTipo("prestigio tipo");
	}
	
	@Override
	public void receita() {
		System.out.println("receita de bolo de prestigio\n");
	}
}
