package javamon.model;

public class Fire extends Type{
	private static Fire instance;
	
	private Fire() {

	}
	
	public static Fire getInstance() {
		if (instance == null){
			instance = new Fire();
		}
		return instance;
	}
}
