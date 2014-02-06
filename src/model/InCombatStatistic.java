package javamon.model;

public class InCombatStatistic extends Statistic{

	public InCombatStatistic(){
		this.value = 1000;	//Value is by default of 100. 
							//To avoid floats, it will be 1000.
		curValue = this.value;
		statLevel = 0;	
	}

	@Override
	private void adaptStat(){
		switch(statLevel){
			case -6: curLevel = 333;
    				 break;
    		case -5: curLevel = 375;
    				 break;
    		case -4: curLevel = 429;
    				 break;
    		case -3: curLevel = 500;
    				 break;
    		case -2: curLevel = 600;
    				 break;
    		case -1: curLevel = 750;
    				 break;
    		case 0: curLevel = 1000;
    				 break;
    		case 1: curLevel = 1333;
    				 break;
    		case 2: curLevel = 1667;
    				 break;
    		case 3: curLevel = 2000;
    				 break;
    		case 4: curLevel = 2333;
    				 break;
    		case 5: curLevel = 2667;
    				 break;
    		case 6: curLevel = 3000;
    				 break;
    	}
    }
	
