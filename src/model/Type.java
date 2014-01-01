package javamon.model;

import java.util.HashSet;

public abstract class Type{
	HashSet<Type> noEffect;
	HashSet<Type> weak;
	HashSet<Type> strong;

	public double coefficient(Type attacked){
		if(noEffect.contains(attacked)){ return 0; }
		if(weak.contains(attacked)){ return 0.5; }
		if(strong.contains(attacked)){ return 2; }
		return 1;
	}
	
	public double coefficientSTAB(Type attacker){
		if(this.equals(attacker)){ return 1.5; }
		return 1;
	}
}
