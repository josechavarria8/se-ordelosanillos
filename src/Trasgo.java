package src;

/**
 *
 * @author blue
 */
public class Trasgo extends Bestias{

    private static int contadorInstancias;


    public static int getInstancias(){
        return Trasgo.contadorInstancias;
    }


    public Trasgo(String nombre){
        super(325,46,nombre);
        Trasgo.contadorInstancias++;
    }
    
}
