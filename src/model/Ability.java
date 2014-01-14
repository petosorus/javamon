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
		
	protected double currentAccuracy(int attackerAccuracy){
		return this.accuracy / 100 * attackerAccuracy / 1000;
	}
		
	protected boolean strike(int attackerAccuracy){
		if (Math.random() <= currentAccuracy(attackerAccuracy)){
			return true;
		}
		return false;
	}

}
