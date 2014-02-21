package javamon.model;

public class Water extends Type{
	private static Water instance;
	
	private Water() {

	}
	
	public static Water getInstance() {
		if (instance == null){
			instance = new Water();
		}
		return instance;
	}
}
