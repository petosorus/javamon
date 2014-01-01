package javamon.model;

public class StatusChanger extends Ability{

	Status status;

	public StatusChanger(String name, int accuracy, Status status){
		super(name, accuracy);
		this.status = status;
	}
	
	@Override
	public void effect(){
		
	}
}
