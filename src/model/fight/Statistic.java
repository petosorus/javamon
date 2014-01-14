package javamon.model.fight;

public class Statistic{
	
	int value;
	int curValue;
	int statLevel;
	
	public Statistic(int value){ this.value = value; }
	
	public void increment(int value){ this.value += value; }
	
	public void tempIncrement(int value){
		statLevel += value;
		adaptStat();
	}
	
	public void resetTempCondition(){ 
		curValue = value;
		statLevel = 0;
	}
	
	private void adaptStat(){
		switch(statLevel){
			case -6: curValue = 25;
    				 break;
    		case -5: curValue = 29;
    				 break;
    		case -4: curValue = 33;
    				 break;
    		case -3: curValue = 40;
    				 break;
    		case -2: curValue = 50;
    				 break;
    		case -1: curValue = 67;
    				 break;
    		case 0: curValue = 100;
    				 break;
    		case 1: curValue = 150;
    				 break;
    		case 2: curValue = 200;
    				 break;
    		case 3: curValue = 250;
    				 break;
    		case 4: curValue = 300;
    				 break;
    		case 5: curValue = 350;
    				 break;
    		case 6: curValue = 400;
    				 break;
    	}
    }
	
}
