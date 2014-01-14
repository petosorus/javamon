package javamon.model.fight;

public class Poison extends Type{
	private static final Poison instance = new Poison();
	
	private Poison() {

	}
	
	public static Poison getInstance() {
		return instance;
	}
}
