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
    
    PermanentStatistic attack;
    PermanentStatistic defense;
    PermanentStatistic speed;
    PermanentStatistic attackSpe;
    PermanentStatistic defenseSpe;
    
	InCombatStatistic accuracy;
	InCombatStatistic evasion;
    
    Ability slot1;
    Ability slot2;
    Ability slot3;
    Ability slot4;
    
    public Pokemon(String name, int hpMax, PermanentStatistic defense){
    	this.nickname = name;
    	this.hpCurrent = this.hpMax = hpMax;
    	this.defense = defense;
    }
    
    public Pokemon(int level, PermanentStatistic attack){
    	this.level = level;
    	this.attack = attack;
    	this.slot1 = slot1;
    }
    public void writeSlot1(Attack slot1){this.slot1 = slot1;}
    
    public Pokemon(int id, String race, String name, Gender gender,
    			Type type1, Type type2, int hpMax, int hpCurrent, int level,
    			Ability slot1, Ability slot2, Ability slot3, Ability slot4,
    			PermanentStatistic attack, PermanentStatistic defense, 
    			PermanentStatistic speed, PermanentStatistic attackSpe, 
    			PermanentStatistic defenseSpe){
    			
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
    	
//    	this.accuracy = new(InCombatStatistic);
    }
    
    public void decreaseHP(int damage){ hpCurrent -= damage; }
    
    public void improveStat(Statistic stat, int value){
    	stat.tempIncrement(value);
    }
          
}
