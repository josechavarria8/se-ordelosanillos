package src;

/**
 *
 * @author blue
 */
public class Hobbit extends Heroes {

    private static int contadorInstancias;


    public static int getInstancias(){
        return Hobbit.contadorInstancias;
    }


    public Hobbit(String nombre){
        super(200, 40, nombre);
        Hobbit.contadorInstancias++;
    }

    

    
    
}
