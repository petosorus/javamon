package javamon.model;

public class PermanentStatistic extends Statistic{
	
	int baseValue;
	
	public PermanentStatistic(int value){ 
		baseValue = value;	
		
		values.put(-6, 25);
		values.put(-5, 29);
		values.put(-4, 33);
		values.put(-3, 40);
		values.put(-2, 50);
		values.put(-1, 67);
		values.put(0, 100);
		values.put(1, 150);
		values.put(2, 200);
		values.put(3, 250);
		values.put(4, 300);
		values.put(5, 350);
		values.put(6, 400);
		
	}


    @Override
 	int getValue(){
 		return baseValue * (values.get(statLevel) / 100);
 	}
}
