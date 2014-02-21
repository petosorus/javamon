package javamon.model;

public class TestAttack extends Attack{
	
	public TestAttack(int accuracy, Pokemon source, Pokemon target, int force,
		AttackCategory category){
		this.accuracy = accuracy;
		this.source = source;
		this.target = target;
		this.force = force;
		this.category = category;
	}
	
	public TestAttack(int accuracy, Pokemon source, Pokemon target, int force,
		AttackCategory category, Type type){
		this.accuracy = accuracy;
		this.source = source;
		this.target = target;
		this.force = force;
		this.category = category;
		this.type = type;
	}
	
	@Override
	protected int damageCalculation(Pokemon attacker, Pokemon defender){
		int level = attacker.level;
		System.err.println(level);
		int attack = (category == AttackCategory.Physical) ? 
			attacker.attack.getValue() : attacker.attackSpe.getValue();
		System.err.println(attack);
		int defense = (category == AttackCategory.Physical) ? 
			defender.defense.getValue() : attacker.defenseSpe.getValue();
		System.err.println(defense);
		double power = force ;//* type.coefficientSTAB(attacker.type1) *
//			type.coefficientSTAB(attacker.type2);
		System.err.println(power);
		double coefficient = type.coefficient(defender.type1) ;//* 
//			type.coefficient(defender.type2);
		
//		int coefficient = 1; //Testing
		
		return (int)((((level * 0.4 + 2) * attack * power)/(defense * 50) +2) *
			coefficient);
	}
	
}
