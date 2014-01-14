package javamon.model;

public class Attack extends Ability{
	
	int force;
	AbilityCategory category;
	
	public Attack(String name, int accuracy, Type type, int force){
		super(name, accuracy, type);
		this.force = force;
	}
	
	protected int damageCalculation(Pokemon attacker, Pokemon defender){
		int level = attacker.level;
		int attack = attacker.attack.curValue;
		double power = force * type.coefficientSTAB(attacker.type1) *
			type.coefficientSTAB(attacker.type2);
		int defense = attacker.defense.curValue;
		double coefficient = type.coefficient(defender.type1) * 
			type.coefficient(defender.type2);
		
		return (int)((((level * 0.4 + 2) * attack * power)/(defense * 50) +2) *
			coefficient);
	}
	
	public void effect(Pokemon attacker, Pokemon defender){
		defender.decreaseHP(damageCalculation(attacker, defender));
	}
	
}
