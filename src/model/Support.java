package javamon.model;

public class Support extends Ability{
	
	Statistic statistic;
	int value;

	public Support(String name, Statistic statistic, int value){
		super(name);
		this.statistic = statistic;
		this.value = value;
	}
		
}
