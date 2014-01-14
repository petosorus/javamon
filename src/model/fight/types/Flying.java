package javamon.model.fight;

public class Flying extends Type{
	private static final Flying instance = new Flying();
	
	private Flying() {

	}
	
	public static Flying getInstance() {
		return instance;
	}
}
