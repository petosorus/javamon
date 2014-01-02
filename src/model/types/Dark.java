package javamon.model;

public class Dark extends Type{
	private static final Dark instance = new Dark();
	
	private Dark() {

	}
	
	public static Dark getInstance() {
		return instance;
	}
}
