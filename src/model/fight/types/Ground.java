package javamon.model.fight;

public class Ground extends Type{
	private static final Ground instance = new Ground();
	
	private Ground() {

	}
	
	public static Ground getInstance() {
		return instance;
	}
}
