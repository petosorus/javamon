package javamon.model;

public class Statistic{
	
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
	
	private abstract void adaptStat();
	
}
