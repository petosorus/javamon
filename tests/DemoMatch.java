package javamon.model;

public class DemoMatch{
	
	
	public static void main(String []args){
		Pokemon pika = new Pokemon("Pikachu", 100, new PermanentStatistic(1));
		Pokemon connard = new Pokemon(500, new PermanentStatistic(1));
		Match match = new Match(pika, connard);
	
		connard.writeSlot1(new Attack(100, connard, pika, 1, AttackCategory.Physical));
		System.out.println(pika.nickname + " a " + pika.hpCurrent + " PV.");
		match.solveAttack(connard.slot1);
		System.out.println(pika.nickname + " a " + pika.hpCurrent + " PV.");
	}
}
