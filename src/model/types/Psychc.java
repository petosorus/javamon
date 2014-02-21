package javamon.model;

public class Psychc extends Type{
	private static Psychc instance;
	
	private Psychc() {

	}
	
	public static Psychc getInstance() {
		if (instance == null){
			instance = new Psychc();
		}
		return instance;
	}
}
