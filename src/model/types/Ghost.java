package javamon.model;

public class Ghost extends Type{
	private static final Ghost instance = new Ghost();
	
	private Ghost() {

	}
	
	public static Ghost getInstance() {
		return instance;
	}
}
