package javamon.model.fight;

public class Rock extends Type{
	private static final Rock instance = new Rock();
	
	private Rock() {

	}
	
	public static Rock getInstance() {
		return instance;
	}
}
