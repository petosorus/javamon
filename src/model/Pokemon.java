package javamon.model;

public class Pokemon{
    
    int id;
    
    String race;
    String name;
    
    Gender gender;
    
    Type type1;
    Type type2;
    
    int hpMax;
    int hpCurrent;
    int level;
    
    Ability slot1;
    Ability slot2;
    Ability slot3;
    Ability slot4;
    
    public Pokemon(int id, String race, String name, Gender gender,
    			Type type1, Type type2, int hpMax, int hpCurrent, int level,
    			Ability slot1, Ability slot2, Ability slot3, Ability slot4){
    	this.id = id;
    	this.race = race;
    	this.name = name;
    	this.gender = gender;
    	this.type1 = type1;
    	this.type2 = type2;
    	this.hpMax = hpMax;
    	this.hpCurrent = hpCurrent;
    	this.level = level;
    	this.slot1 = slot1;
    	this.slot2 = slot2;
    	this.slot3 = slot3;
    	this.slot4 = slot4;
    }
    
    
    public void decreaseHP(int damage){
    	hpCurrent -= damage;
    }
    
}
