package javamon.model;

public class Steel extends Type{
	private static Steel instance;
	
	private Steel() {

	}
	
	public static Steel getInstance() {
		if (instance == null){
			instance = new Steel();
		}
		return instance;
	}
}
