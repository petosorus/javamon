package javamon.model;

public class Electr extends Type{
	private static final Electr instance = new Electr();
	
	private Electr() {

	}
	
	public static Electr getInstance() {
		return instance;
	}
}
