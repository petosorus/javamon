package javamon.model.fight;

public class Electr extends Type{
	private static final Electr instance = new Electr();
	
	private Electr() {
		noEffect.add(Ground.getInstance());
		
		weak.add(Grass.getInstance());
		weak.add(Electr.getInstance());
		weak.add(Dragon.getInstance());
		
		strong.add(Flying.getInstance());
		strong.add(Water.getInstance());
	}
	
	public static Electr getInstance() {
		return instance;
	}
}
