package javamon.model;

public class Match{
	
	Pokemon player;
	Pokemon game;
	
	public Match(Pokemon player, Pokemon game){
		this.player = player;
		this.game = game;
	}
	
	void solveAttack(Attack attack){
		attack.effect();		
	}
}
