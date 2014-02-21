package javamon.model;

public class Poison extends Type{
	private static Poison instance;
	
	private Poison() {

	}
	
	public static Poison getInstance() {
		if (instance == null){
			instance = new Poison();
		}
		return instance;
	}
}
