package javamon.model;

public class Steel extends Type{
	private static final Steel instance = new Steel();
	
	private Steel() {

	}
	
	public static Steel getInstance() {
		return instance;
	}
}
