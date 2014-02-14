package javamon.model;

public class StatusChanger extends Ability{

	Status status;

	public StatusChanger(String name, int accuracy, Type type, 
							Pokemon source, Pokemon target, Status status){
		super(name, accuracy, type, source, target);
		this.status = status;
	}

	@Override
	public void effect(){
		target.status = this.status;
	}
}
