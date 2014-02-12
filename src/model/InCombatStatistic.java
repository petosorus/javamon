package javamon.model;

public class InCombatStatistic extends Statistic{

	public InCombatStatistic(){
		statLevel = 0;	

//		values = {{-6, 333},
//				  {-5, 375}};
					
	}
/*
	@Override
	void adaptStat(){
		switch(statLevel){
			case -6: curValue = 333;
    				 break;
    		case -5: curValue = 375;
    				 break;
    		case -4: curValue = 429;
    				 break;
    		case -3: curValue = 500;
    				 break;
    		case -2: curValue = 600;
    				 break;
    		case -1: curValue = 750;
    				 break;
    		case 0: curValue = 1000;
    				 break;
    		case 1: curValue = 1333;
    				 break;
    		case 2: curValue = 1667;
    				 break;
    		case 3: curValue = 2000;
    				 break;
    		case 4: curValue = 2333;
    				 break;
    		case 5: curValue = 2667;
    				 break;
    		case 6: curValue = 3000;
    				 break;
    	}
    }
*/    
    int getValue(){
    	return values.get(statLevel);
    }   	
}
