package javamon.model;

public class Dragon extends Type{
	private static final Dragon instance = new Dragon();
	
	private Dragon() {

	}
	
	public static Dragon getInstance() {
		return instance;
	}
}
