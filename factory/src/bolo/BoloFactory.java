package bolo;

public class BoloFactory implements FormaBolo{
	
	public enum Sabor {
		ABACAXI, CHOCONINHO, FLORESTA, PRESTIGIO;
	}

	public Bolo getBolo(Sabor t) {
		Bolo f = null;

		switch (t) {
		case ABACAXI:
			f = new Abacaxi();
			break;
		case CHOCONINHO:
			f = new Choconinho();
			break;
		case FLORESTA:
			f = new FlorestaNegra();
			break;
		case PRESTIGIO:
			f = new Prestigio();
		}
		return f;
	}
}
