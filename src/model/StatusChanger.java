package javamon.model;

public class StatusChanger extends Ability{

	Status status;

	public StatusChanger(String name, Status status){
		super(name);
		this.status = status;
	}
}
