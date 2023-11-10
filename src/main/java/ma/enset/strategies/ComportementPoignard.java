package ma.enset.strategies;

public class ComportementPoignard implements IComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("Combattre avec Poignard");
    }
}
