package javamon.model;

public class Rock extends Type{
	private static Rock instance;
	
	private Rock() {

	}
	
	public static Rock getInstance() {
		if (instance == null){
			instance = new Rock();
		}
		return instance;
	}
}
