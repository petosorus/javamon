package javamon.model;

public class Bug extends Type{
	private static final Bug instance = new Bug();
	
	private Bug() {
		weak.add(Fight.getInstance());
		weak.add(Flying.getInstance());
		weak.add(Poison.getInstance());
		weak.add(Ghost.getInstance());
		weak.add(Steel.getInstance());
		weak.add(Fire.getInstance());
		weak.add(Fairy.getInstance());
		
		strong.add(Grass.getInstance());
		strong.add(Psychc.getInstance());
		strong.add(Dark.getInstance());
	}
	
	public static Bug getInstance() {
		return instance;
	}
}
