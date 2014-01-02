package javamon.model;

public class Ice extends Type{
	private static final Ice instance = new Ice();
	
	private Ice() {

	}
	
	public static Ice getInstance() {
		return instance;
	}
}
