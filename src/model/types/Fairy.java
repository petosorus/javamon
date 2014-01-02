package javamon.model;

public class Fairy extends Type{
	private static final Fairy instance = new Fairy();
	
	private Fairy() {

	}
	
	public static Fairy getInstance() {
		return instance;
	}
}
