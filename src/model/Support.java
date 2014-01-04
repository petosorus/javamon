package javamon.model;

public class Support extends Ability{
	
	Statistic statistic;

	public Support(String name, int accuracy, Type type, Statistic statistic){
		super(name, accuracy, type);
		this.statistic = statistic;
	}
	
	@Override
	public void effect(){
			
	}
		
}
