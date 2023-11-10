package ma.enset.context;

import lombok.Data;
import ma.enset.strategies.IComportementArme;

@Data
public class Personnage {
    public IComportementArme arme ;
    public void combattre(){
        this.arme.utiliserArme();
    }
}
