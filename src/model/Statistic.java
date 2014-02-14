package javamon.model;

import java.util.HashMap;

public abstract class Statistic{
	
	protected HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();
	protected int statLevel = 0;
	
	
	public void tempIncrement(int value){
		statLevel += value;
	}
	
	public void resetTempCondition(){ 
		statLevel = 0;
	}
	
	
	abstract int getValue();
}
