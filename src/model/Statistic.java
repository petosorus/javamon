package javamon.model;

public abstract class Statistic{
	
	int value;
	int curValue;
	int statLevel;
	
	
	public void tempIncrement(int value){
		statLevel += value;
		adaptStat();
	}
	
	public void resetTempCondition(){ 
		curValue = value;
		statLevel = 0;
	}
	
	abstract void adaptStat();
	
}
