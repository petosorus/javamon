package javamon.model;

public class Attack extends Ability{
	
	int force;
	AbilityCategory category;
	
	public Attack(String name, int accuracy, Type type, int force){
		super(name, accuracy, type);
		this.force = force;
	}
	
	@Override
	public void effect(){
		
	}
	
	protected int damageCalculation(Pokemon attacker, Pokemon defender){
		int level = attacker.level;
		int attack = attacker.attack.value;
		double power = force * type.coefficientSTAB(attacker.type1) *
			type.coefficientSTAB(attacker.type2);
		int defense = attacker.defense.value;
		double coefficient = type.coefficient(defender.type1) * 
			type.coefficient(defender.type2);
		
		
		return (int)((((level * 0.4 + 2) * attack * power)/(defense * 50) +2) *
			coefficient);
	}
	
}
