package javamon.model;

public class DemoMatch{
	
	static Pokemon pika = new Pokemon("Pikachu", 100, new PermanentStatistic(1));
	static Pokemon connard = new Pokemon(500, new PermanentStatistic(1));
	
	/*
	pika.nickname = "Pikachu";
	pika.hpCurrent = pika.hpMax = 100;
	pika.defense = new PermanentStatistic(2);
	*/
	/*
	connard.level = 4;
	connard.attack = new PermanentStatistic(50);
	connard.slot1 = new Attack("test", 100, Normal.getInstance(), 
								connard, pika, 1);
	*/
	static Match match = new Match(pika, connard);
	
	public static void main(String []args){
		connard.writeSlot1(new Attack(100, connard, pika, 1));
		System.out.println(pika.nickname + " a " + pika.hpCurrent + " PV.");
		match.solveAttack(connard.slot1);
		System.out.println(pika.nickname + " a " + pika.hpCurrent + " PV.");
	}
}
