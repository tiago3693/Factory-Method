package bolo;

public class BoloMain {

	public static void main(String[] args) {
		Abacaxi boloA = new Abacaxi("abacaxi", "bolo tipo A", 10.2f);
		Choconinho boloC = new Choconinho("choconinho", "bolo tipo C", 15.2f);
		FlorestaNegra boloF = new FlorestaNegra("floresta", "bolo tipo F", 11.6f);
		Prestigio boloP = new Prestigio("prestigio", "bolo tipo P", 19.5f);
		
		boloA.sobreoBolo();
		boloA.receita();
		
		boloC.sobreoBolo();
		boloC.receita();
		
		boloF.sobreoBolo();
		boloF.receita();
		
		boloP.sobreoBolo();
		boloP.receita();
	}
}
