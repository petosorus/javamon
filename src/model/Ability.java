package javamon.model;

public abstract class Ability{

	String name;
	int accuracy;
	Type type
	
	public Ability(String name, int accuracy, Type type){
		this.name = name;
		this.accuracy = accuracy;
		this.type = type;
	}
	
		public abstract void effect();
}
