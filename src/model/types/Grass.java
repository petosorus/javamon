package javamon.model;

public class Grass extends Type{
	private static final Grass instance = new Grass();
	
	private Grass() {

	}
	
	public static Grass getInstance() {
		return instance;
	}
}
