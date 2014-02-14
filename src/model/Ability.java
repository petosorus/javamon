package javamon.model;

import java.lang.Math;

public abstract class Ability{

	String name;
	int accuracy;				//Here accuracy is scaled on 100.
	Type type;
	Pokemon source;
	Pokemon target;
/*	
	public Ability(String name, int accuracy, Type type, 
					Pokemon source, Pokemon target){
		this.name = name;
		this.accuracy = accuracy;
		this.type = type;
		this.source = source;
		this.target = target;
	}
*/	
		
	protected double currentAccuracy(int attackerAccuracy){
		return this.accuracy * attackerAccuracy / 100000;
	}
		
	protected boolean strike(int attackerAccuracy){
		if (Math.random() <= currentAccuracy(attackerAccuracy)){
			return true;
		}
		return false;
	}
	
	public abstract void effect();

}
