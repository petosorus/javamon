package javamon.model;

public class Dark extends Type{
	private static Dark instance;
	
	private Dark() {
		weak.add(Fight.getInstance());
		weak.add(Dark.getInstance());
		weak.add(Fairy.getInstance());
		
		strong.add(Ghost.getInstance());
		strong.add(Psychc.getInstance());
	}
	
	public static Dark getInstance() {
		if (instance == null){
			instance = new Dark();
		}
		return instance;
	}
}
