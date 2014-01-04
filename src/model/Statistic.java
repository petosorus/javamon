package javamon.model;

public class Statistic{
	
	int value;
	int curValue;
	
	public Statistic(int value){ this.value = value; }
	
	public void increment(int value){ this.value += value; }
	
	public void tempDecrement(int value){ curValue -= value; }
	
	public void tempIncrement(int value){ curValue += value; }
	
	public void resetTempCondition(){ curValue = value; }
}
