package javamon.model;

public class Psychc extends Type{
	private static final Psychc instance = new Psychc();
	
	private Psychc() {

	}
	
	public static Psychc getInstance() {
		return instance;
	}
}
