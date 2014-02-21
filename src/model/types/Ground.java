package javamon.model;

public class Ground extends Type{
	private static Ground instance;
	
	private Ground() {

	}
	
	public static Ground getInstance() {
		if (instance == null){
			instance = new Ground();
		}
		return instance;
	}
}
