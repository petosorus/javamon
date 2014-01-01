package javamon.model;

public class Support extends Ability{
	
	Statistic statistic;

	public Support(String name, int accuracy, Statistic statistic){
		super(name, accuracy);
		this.statistic = statistic;
	}
	
	@Override
	public void effect(){
			
	}
		
}
