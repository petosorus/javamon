package javamon.model;

public class InCombatStatistic extends Statistic{

	public InCombatStatistic(){

		values.put(-6, 333);
		values.put(-5, 375);
		values.put(-4, 429);
		values.put(-3, 500);
		values.put(-2, 600);
		values.put(-1, 750);
		values.put(0, 1000);
		values.put(1, 1333);
		values.put(2, 1667);
		values.put(3, 2000);
		values.put(4, 2333);
		values.put(5, 2667);
		values.put(6, 3000);
					
	}


    int getValue(){
    	return values.get(statLevel);
    }   	
}
