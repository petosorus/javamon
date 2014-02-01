package javamon.model;

import java.util.HashSet;

public abstract class Type{
	HashSet<Type> noEffect;
	HashSet<Type> weak;
	HashSet<Type> strong;
	
	protected double coefficient(Type defender){
		if(noEffect.contains(defender)){ return 0; }
		if(weak.contains(defender)){ return 0.5; }
		if(strong.contains(defender)){ return 2; }
		return 1;
	}
	
	protected double coefficientSTAB(Type attacker){
		if(this.equals(attacker)){ return 1.5; }
		return 1;
	}
	
}
