package src;

/**
 *
 * @author blue
 */
public class Heroes extends Personaje {

    private static int ataqueMax = 100;

    private static int instanciasHeroes;

    public Heroes(int vida, int armadura, String nombre){
        super(vida, armadura, ataqueMax, nombre, true);
        Heroes.instanciasHeroes++;
    }

    public static int getInstancias(){
        return Heroes.instanciasHeroes;
    }

    @Override
    public int getAtaque(){
        return Dado.tirarDado(0, Heroes.ataqueMax, 2, true);
    }
    
}
