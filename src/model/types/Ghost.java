package javamon.model;

public class Ghost extends Type{
	private static Ghost instance;
	
	private Ghost() {

	}
	
	public static Ghost getInstance() {
		if (instance == null){
			instance = new Ghost();
		}
		return instance;
	}
}
