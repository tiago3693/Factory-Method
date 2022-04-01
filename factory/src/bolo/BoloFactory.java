package bolo;

public class BoloFactory {
	
	public enum Sabor {
		ABACAXI, CHOCONINHO, FLORESTA, PRESTIGIO;
	}

	public Bolo getBolo(Sabor t) {
		Bolo f = null;

		switch (t) {
		case ABACAXI:
			f = new Abacaxi("abacaxi nome", "abacaxi tipo", 10.2f);
			break;
		case CHOCONINHO:
			f = new Choconinho("choconinho nome", "choconinho tipo", 11.2f);
			break;
		case FLORESTA:
			f = new FlorestaNegra("floresta nome", "floresta tipo", 13.2f);
			break;
		case PRESTIGIO:
			f = new Prestigio("prestigio nome", "prestigio tipo", 15.2f);
		}
		return f;
	}
}
