package javamon.model;

public class PermanentStatistic extends Statistic{
	
	public PermanentStatistic(int value){ 
		this.value = value;	
		curValue = this.value;
		statLevel = 0;	
	}

	//Formula to be included
	public void increment(int value){ this.value += value; }
	
	@Override
	void adaptStat(){
		switch(statLevel){
			case -6: curValue = 25 * value / 100;
    				 break;
    		case -5: curValue = 29 * value / 100;
    				 break;
    		case -4: curValue = 33 * value / 100;
    				 break;
    		case -3: curValue = 40 * value / 100;
    				 break;
    		case -2: curValue = 50 * value / 100;
    				 break;
    		case -1: curValue = 67 * value / 100;
    				 break;
    		case 0: curValue = 100 * value / 100;
    				 break;
    		case 1: curValue = 150 * value / 100;
    				 break;
    		case 2: curValue = 200 * value / 100;
    				 break;
    		case 3: curValue = 250 * value / 100;
    				 break;
    		case 4: curValue = 300 * value / 100;
    				 break;
    		case 5: curValue = 350 * value / 100;
    				 break;
    		case 6: curValue = 400 * value / 100;
    				 break;
    	}
    }
}
