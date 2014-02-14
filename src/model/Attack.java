package javamon.model;

public class Attack extends Ability{
	
	int force;
	AttackCategory category;
	
	public Attack(String name, int accuracy, Type type, 
					Pokemon source, Pokemon target, int force){
		super(name, accuracy, type, source, target);
		this.force = force;
	}
	
	protected int damageCalculation(Pokemon attacker, Pokemon defender){
		int level = attacker.level;
		
		int attack = category == AttackCategory.Physical ? 
			attacker.attack.getValue() : attacker.attackSpe.getValue();
			
		int defense = category == AttackCategory.Physical ? 
			attacker.defense.getValue() : attacker.defenseSpe.getValue();
		
		double power = force * type.coefficientSTAB(attacker.type1) *
			type.coefficientSTAB(attacker.type2);

		double coefficient = type.coefficient(defender.type1) * 
			type.coefficient(defender.type2);
		
		return (int)((((level * 0.4 + 2) * attack * power)/(defense * 50) +2) *
			coefficient);
	}
	
	@Override
	public void effect(){
		target.decreaseHP(damageCalculation(source, target));
	}
	
}
