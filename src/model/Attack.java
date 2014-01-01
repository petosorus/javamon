package javamon.model;

public class Attack extends Ability{
	
	int force;
	Type type;
	
	public Attack(String name, int force, Type type){
		super(name);
		this.force = force;
		this.type = type;
	}
	
		
}
