package javamon.model;

public class Dark extends Type{
	private static final Dark instance = new Dark();
	
	private Dark() {
		weak.add(Fight.getInstance());
		weak.add(Dark.getInstance());
		weak.add(Fairy.getInstance());
		
		strong.add(Ghost.getInstance());
		strong.add(Psychc.getInstance());
	}
	
	public static Dark getInstance() {
		return instance;
	}
}
