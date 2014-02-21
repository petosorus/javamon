package javamon.model;

public class Grass extends Type{
	private static Grass instance;
	
	private Grass() {

	}
	
	public static Grass getInstance() {
		if (instance == null){
			instance = new Grass();
		}
		return instance;
	}
}
