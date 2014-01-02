package javamon.model;

public class Fight extends Type{
	private static final Fight instance = new Fight();
	
	private Fight() {

	}
	
	public static Fight getInstance() {
		return instance;
	}
}
