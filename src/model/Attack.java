package javamon.model;

public class Attack extends Ability{
	
	int force;
	Type type;
	
	public Attack(String name, int accuracy, int force, Type type){
		super(name, accuracy);
		this.force = force;
		this.type = type;
	}
	
	@Override
	public void effect(){
		
	}
		
}
