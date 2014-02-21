package javamon.model;

public class Electr extends Type{
	private static Electr instance;
	
	private Electr() {
		noEffect.add(Ground.getInstance());
		
		weak.add(Grass.getInstance());
		weak.add(Electr.getInstance());
		weak.add(Dragon.getInstance());
		
		strong.add(Flying.getInstance());
		strong.add(Water.getInstance());
	}
	
	public static Electr getInstance() {
		if (instance == null){
			instance = new Electr();
		}
		return instance;
	}
}
