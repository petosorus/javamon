package javamon.model;

public class Pokemon{
    
    int id;
    String nickname;
        
    String race;
    Gender gender;
    Type type1;
    Type type2;
    
    int hpMax;
    int hpCurrent;
    int level;
    int xp;
    Status status;
    
    Statistic attack;
    Statistic defense;
    Statistic speed;
    Statistic attackSpe;
    Statistic defenseSpe;
    
    int accuracy;
    int accuracyLevel;
    
    Ability slot1;
    Ability slot2;
    Ability slot3;
    Ability slot4;
    
    public Pokemon(int id, String race, String name, Gender gender,
    			Type type1, Type type2, int hpMax, int hpCurrent, int level,
    			Ability slot1, Ability slot2, Ability slot3, Ability slot4,
    			Statistic attack, Statistic defense, Statistic speed,
    			Statistic attackSpe, Statistic defenseSpe){
    	this.id = id;
    	this.nickname = nickname;
    	
    	this.race = race;
    	this.gender = gender;
    	this.type1 = type1;
    	this.type2 = type2;
    	
    	this.hpMax = hpMax;
    	this.hpCurrent = hpCurrent;
    	this.level = level;
    	this.xp = xp;
    	
    	this.attack = attack;
    	this.defense = defense;
    	this.speed = speed;
    	this.attackSpe = attackSpe;
    	this.defenseSpe = defenseSpe;
    	
    	this.slot1 = slot1;
    	this.slot2 = slot2;
    	this.slot3 = slot3;
    	this.slot4 = slot4;
    	
    	accuracy = 1000;
    	accuracyLevel = 0;
    }
    
    public void decreaseHP(int damage){ hpCurrent -= damage; }
    
    public void decreaseStat(Statistic stat, int value){
    	stat.tempDecrement(value);
    }
    
    public void improveStat(Statistic stat, int value){
    	stat.tempIncrement(value);
    }
    
    public void adaptAccuracy(){
    	switch (accuracyLevel){
    		case -6: accuracy = 333;
    				 break;
    		case -5: accuracy = 375;
    				 break;
    		case -4: accuracy = 429;
    				 break;
    		case -3: accuracy = 500;
    				 break;
    		case -2: accuracy = 600;
    				 break;
    		case -1: accuracy = 750;
    				 break;
    		case 0: accuracy = 1000;
    				 break;
    		case 1: accuracy = 1333;
    				 break;
    		case 2: accuracy = 1667;
    				 break;
    		case 3: accuracy = 2000;
    				 break;
    		case 4: accuracy = 2333;
    				 break;
    		case 5: accuracy = 2667;
    				 break;
    		case 6: accuracy = 3000;
    				 break;
    	}
    }
    
    
}
