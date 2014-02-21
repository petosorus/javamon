package javamon.model;

public class DemoMatch{
	
	
	public static void main(String []args){
		TestPokemon pika = new TestPokemon("Pikachu", 100, new PermanentStatistic(1), Normal.getInstance());
		TestPokemon connard = new TestPokemon(500, new PermanentStatistic(1));
		Match match = new Match(pika, connard);
	
		connard.writeSlot1(new TestAttack(100, connard, pika, 1, AttackCategory.Physical, Fight.getInstance()));
		
		connard.writeSlot2(new TestAttack(100, connard, pika, 1, AttackCategory.Physical, Normal.getInstance()));
		
		System.out.println(pika.nickname + " a " + pika.hpCurrent + " PV.");
		match.solveAttack(connard.slot1);
		System.out.println(pika.nickname + " a " + pika.hpCurrent + " PV.");
		match.solveAttack(connard.slot2);
		System.out.println(pika.nickname + " a " + pika.hpCurrent + " PV.");
	}
}
