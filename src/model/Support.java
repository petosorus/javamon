package javamon.model;

public class Support extends Ability{
	
	Statistic statistic;
	int force;

	public Support(String name, int accuracy, Type type, Statistic statistic, int force){
		super(name, accuracy, type);
		this.statistic = statistic;
		int force;
	}
	
	@Override
	public void effect(Pokemon defender){
		defender.improveStat(this, 
	}
		
}
