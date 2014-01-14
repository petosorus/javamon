package javamon.model;

import java.lang.Math;

public abstract class Ability{

	String name;
	int accuracy;
	Type type;
	
	public Ability(String name, int accuracy, Type type){
		this.name = name;
		this.accuracy = accuracy;
		this.type = type;
	}
	
//	public abstract void effect();
		
	public double accuracy(int attackerAccuracy){
		return this.accuracy / 100 * attackerAccuracy / 1000;
	}
		
	public boolean strike(int attackerAccuracy){
		if (Math.random() <= accuracy(attackerAccuracy)){
			return true;
		}
		return false;
	}

}
