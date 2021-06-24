package src;

/**
 *
 * @author blue
 */
public class Bestias extends Personaje {
    
    private static int ataqueMax = 90;

    public Bestias(int vida, int armadura, String nombre){
        super(vida, armadura, Bestias.ataqueMax ,nombre, false);
    }

    @Override
    public int getAtaque(){
        return Dado.tirarDado(0, Bestias.ataqueMax , 1, true);
    }
    
}
