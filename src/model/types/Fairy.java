package javamon.model;

public class Fairy extends Type{
	private static Fairy instance;
	
	private Fairy() {
		weak.add(Poison.getInstance());
		weak.add(Steel.getInstance());
		weak.add(Fire.getInstance());
		
		strong.add(Fight.getInstance());
		strong.add(Dragon.getInstance());
		strong.add(Dark.getInstance());
	}
	
	public static Fairy getInstance() {
		if (instance == null){
			instance = new Fairy();
		}
		return instance;
	}
}
