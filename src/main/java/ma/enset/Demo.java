package ma.enset;


import ma.enset.context.Chevalier;
import ma.enset.context.Personnage;
import ma.enset.context.Troll;
import ma.enset.strategies.ComportementArcEtFleches;
import ma.enset.strategies.ComportementHache;
import ma.enset.strategies.ComportementPoignard;

public class Demo {
    public static void main(String[] args) {
        Personnage personnage=new Chevalier();
        personnage.setArme(new ComportementHache());
        personnage.combattre();
        personnage.setArme(new ComportementPoignard());
        personnage.combattre();
        personnage=new Troll();
        personnage.setArme(new ComportementArcEtFleches());
        personnage.combattre();
    }
}
