package javamon.model;

public class Ice extends Type{
	private static Ice instance;
	
	private Ice() {

	}
	
	public static Ice getInstance() {
		if (instance == null){
			instance = new Ice();
		}
		return instance;
	}
}
