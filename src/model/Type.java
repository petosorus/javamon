package javamon.model;

import java.util.Set;

public abstract class Type{
	Set<Type> noEffect;
	Set<Type> weak;
	Set<Type> strong;

	public double coefficient(Type attacked){
		if(noEffect.contains(attacked)){ return 0;}
		if(weak.contains(attacked)){ return 0.5;}
		if(strong.contains(attacked)){ return 2;}
		return 1;
	}
}
