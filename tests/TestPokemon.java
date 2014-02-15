package javamon.model;

public class TestPokemon extends Pokemon{
    
    public TestPokemon(String name, int hpMax, PermanentStatistic defense){
    	this.nickname = name;
    	this.hpCurrent = this.hpMax = hpMax;
    	this.defense = defense;
    }
    
    public TestPokemon(int level, PermanentStatistic attack){
    	this.level = level;
    	this.attack = attack;
    }
    
    public void writeSlot1(TestAttack slot1){this.slot1 = slot1;}
    
          
}
