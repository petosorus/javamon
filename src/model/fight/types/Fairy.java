package javamon.model.fight;

public class Fairy extends Type{
	private static final Fairy instance = new Fairy();
	
	private Fairy() {
		weak.add(Poison.getInstance());
		weak.add(Steel.getInstance());
		weak.add(Fire.getInstance());
		
		strong.add(Fight.getInstance());
		strong.add(Dragon.getInstance());
		strong.add(Dark.getInstance());
	}
	
	public static Fairy getInstance() {
		return instance;
	}
}
