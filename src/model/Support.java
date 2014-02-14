package javamon.model;

import javamon.model.Pokemon;

public class Support extends Ability{
	
	Statistic statistic;
	int force;

	public Support(String name, int accuracy, Type type, 
					Pokemon source, Pokemon target,
					Statistic statistic, int force){
		super(name, accuracy, type, source, target);
		this.statistic = statistic;
		this.force = force;
	}
	
	@Override
	public void effect(){
		target.improveStat(statistic, force);
	}
		
}
