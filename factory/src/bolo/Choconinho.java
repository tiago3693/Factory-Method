package bolo;

public class Choconinho extends Bolo{
	
	public Choconinho() {
		setNome("bolo choconinho");
		setPreco(2f);
		setTipo("choconinho tipo");
	}
	
	@Override
	public void receita() {
		System.out.println("receita de bolo de choconinho\n");
	}
}
