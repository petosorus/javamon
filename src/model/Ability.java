package javamon.model;

public abstract class Ability{

	String name;
	int accuracy;
	
	public Ability(String name, int accuracy){
		this.name = name;
		this.accuracy = accuracy;
	}
	
		public abstract void effect();
}
