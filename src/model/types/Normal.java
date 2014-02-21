package javamon.model;

public class Normal extends Type{
	private static Normal instance;
	
	private Normal() {		
		noEffect.add(Ghost.getInstance());
		
		weak.add(Rock.getInstance());
		weak.add(Steel.getInstance());
	}
	
	public static Normal getInstance() {		
		if (instance == null){
			instance = new Normal();
		}
		return instance;
	}
}
