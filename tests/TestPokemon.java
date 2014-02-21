package javamon.model;

public class TestPokemon extends Pokemon{
    
    public TestPokemon(String name, int hpMax, PermanentStatistic defense){
    	this.nickname = name;
    	this.hpCurrent = this.hpMax = hpMax;
    	this.defense = defense;
    }
    
    public TestPokemon(String name, int hpMax, PermanentStatistic defense, Type 			type){
    	this.nickname = name;
    	this.hpCurrent = this.hpMax = hpMax;
    	this.defense = defense;
    	this.type1 = type;
    }
    
    public TestPokemon(int level, PermanentStatistic attack){
    	this.level = level;
    	this.attack = attack;
    }
    
    public void writeSlot1(TestAttack slot1){this.slot1 = slot1;}
    public void writeSlot2(TestAttack slot2){this.slot2 = slot2;}
    
          
}
