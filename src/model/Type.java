package javamon.model;

import java.util.HashSet;

public abstract class Type{
	HashSet<Type> noEffect = new HashSet();
	HashSet<Type> weak = new HashSet();
	HashSet<Type> strong = new HashSet();
	
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
