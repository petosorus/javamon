package javamon.model;

public class Water extends Type{
	private static final Water instance = new Water();
	
	private Water() {

	}
	
	public static Water getInstance() {
		return instance;
	}
}
