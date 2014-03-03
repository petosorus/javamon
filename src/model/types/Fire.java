package javamon.model;

public class Fire extends Type{
	private static final Fire instance = new Fire();
	
	private Fire() {

	}
	
	public static Fire getInstance() {
		return instance;
	}
}
