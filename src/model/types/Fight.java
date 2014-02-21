package javamon.model;

public class Fight extends Type{
	private static Fight instance;
	
	private Fight() {
		noEffect.add(Ghost.getInstance());
		
		weak.add(Flying.getInstance());
		weak.add(Poison.getInstance());
//		weak.add(Bug.getInstance());
		weak.add(Psychc.getInstance());
//		weak.add(Fairy.getInstance());
		
		strong.add(Normal.getInstance());
		strong.add(Rock.getInstance());
		strong.add(Steel.getInstance());
		strong.add(Ice.getInstance());
//		strong.add(Dark.getInstance());
	}
	
	public static Fight getInstance() {
		if (instance == null){
			instance = new Fight();
		}
		return instance;
	}
}
