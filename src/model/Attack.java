package javamon.model;

public class Attack extends Ability{
	
	int force;
	
	public Attack(String name, int accuracy, Type type, int force){
		super(name, accuracy, type);
		this.force = force;
	}
	
	@Override
	public void effect(){
		
	}
	
}
