package javamon.model;

public class Dragon extends Type{
	private static final Dragon instance = new Dragon();
	
	private Dragon() {
		noEffect.add(Fairy.getInstance());
		
		weak.add(Steel.getInstance());
		
		strong.add(Dragon.getInstance());
	}
	
	public static Dragon getInstance() {
		return instance;
	}
}
