package javamon.model;

public class Dragon extends Type{
	private static Dragon instance;
	
	private Dragon() {
		noEffect.add(Fairy.getInstance());
		
		weak.add(Steel.getInstance());
		
		strong.add(Dragon.getInstance());
	}
	
	public static Dragon getInstance() {
		if (instance == null){
			instance = new Dragon();
		}
		return instance;
	}
}
