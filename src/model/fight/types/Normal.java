package javamon.model.fight;

public class Normal extends Type{
	private static final Normal instance = new Normal();
	
	private Normal() {
		noEffect.add(Ghost.getInstance());
		weak.add(Rock.getInstance());
		weak.add(Steel.getInstance());
	}
	
	public static Normal getInstance() {
		return instance;
	}
}
