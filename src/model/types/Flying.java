package javamon.model;

public class Flying extends Type{
	private static Flying instance;
	
	private Flying() {

	}
	
	public static Flying getInstance() {
		if (instance == null){
			instance = new Flying();
		}
		return instance;
	}
}
