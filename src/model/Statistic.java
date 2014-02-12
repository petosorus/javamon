package javamon.model;

import java.util.HashMap;

public abstract class Statistic{
	
	protected HashMap<int, int> values;
	protected int statLevel;
	
	
	public void tempIncrement(int value){
		statLevel += value;
	}
	
	public void resetTempCondition(){ 
		statLevel = 0;
	}
	
//	abstract void adaptStat();
	
	abstract int getValue();
}
