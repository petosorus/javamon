package javamon.model;

public class StatusChanger extends Ability{

	Status status;

	public StatusChanger(String name, int accuracy, Type type, Status status){
		super(name, accuracy, type);
		this.status = status;
	}
	

	void effect(Pokemon defender){
		defender.status = this.status;
	}
}
