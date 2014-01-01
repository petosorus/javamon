package javamon.model;

public class Team{

    Pokemon slot1;
    Pokemon slot2;
    Pokemon slot3;
    Pokemon slot4;
    Pokemon slot5;
    Pokemon slot6;
 
    public void sort(Pokemon base, Pokemon dest){
        Pokemon tmp = base;
        base = dest;
        dest = tmp;
    }
    
    
       
}
