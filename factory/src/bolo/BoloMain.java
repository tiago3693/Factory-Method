package bolo;

public class BoloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoloFactory bolof = new BoloFactory();
		
		Bolo bolo1 = bolof.getBolo(BoloFactory.Sabor.ABACAXI);
		bolo1.sobreoBolo();
		bolo1.receita();
		
		Bolo bolo2 = bolof.getBolo(BoloFactory.Sabor.CHOCONINHO);
		bolo2.sobreoBolo();
		bolo2.receita();
		
		Bolo bolo3 = bolof.getBolo(BoloFactory.Sabor.FLORESTA);
		bolo3.sobreoBolo();
		bolo3.receita();
		
		Bolo bolo4 = bolof.getBolo(BoloFactory.Sabor.PRESTIGIO);
		bolo4.sobreoBolo();
		bolo4.receita();
	}
}
