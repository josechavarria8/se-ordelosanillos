package src;

/**
 *
 * @author blue
 */
public class Juego {

    private Bestias ejercitoBestias[];
    private Heroes ejercitoHeroes[];
    private final int cantidadTotal = 5;

  
    
    public Juego(){
        ejercitoBestias = new Bestias[cantidadTotal];
        ejercitoHeroes = new Heroes[cantidadTotal];
    }

    public void presentarPersonajes(Personaje ejercito[]){

        if (ejercito.length> 0 ){
            String tempo = "";
            if (ejercito[0] instanceof Bestias){
                tempo = "Bestia";
            }
            else{
                tempo = "Heroe";
            }

            System.out.println("\nEjercito de "+tempo);
       

            for (int i = 0; i < ejercito.length; i++) {
                ejercito[i].saludar();
            }

        }
        else {
            System.out.println("No hay un ejercito ");
        }
    }

    public void jugar(){
        System.out.println("     Juego del Señor de los Anillos: \n\n");
        
        this.inicializarHeroes();
        this.inicializarBestias();

        this.presentarPersonajes(ejercitoBestias);
        this.presentarPersonajes(ejercitoHeroes);
        System.out.println("\n");
        System.out.println("\n");
        
        this.pelea();
        
    }

    public void pelea(){
   
         for (int i = 0; i < cantidadTotal; i++) {
               
            
        ejercitoBestias[i].recibirAtaque(ejercitoHeroes[i]);
        ejercitoHeroes[i].recibirAtaque(ejercitoBestias[i]);
         }
         

    }
        

    public void inicializarHeroes(){
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Dado.tirarDado(0, 2, 1, false);
            switch (random) {
                case 0:
                    ejercitoHeroes[i] = new Humano("Humano "+Humano.getInstancias());
                    break;
                case 1:
                    ejercitoHeroes[i] = new Elfo("Elfo "+Elfo.getInstancias());
                    break;
                case 2:
                    ejercitoHeroes[i] = new Hobbit("Hobbit "+Hobbit.getInstancias());
                    break;
                default:
                    ejercitoHeroes[i] = new Elfo("Elfo "+Elfo.getInstancias());
                    break;
            }
        }
    }

    public void inicializarBestias(){
        int random = 0;
        for (int i = 0; i < ejercitoBestias.length; i++) {
            random = Dado.tirarDado(0, 1, 1, false);
            switch (random) {
                case 0:
                    ejercitoBestias[i] = new Trasgo("Trasgo "+Trasgo.getInstancias());
                    break;
                case 1:
                    ejercitoBestias[i] = new Orco("Orco "+Orco.getInstancias());
                    break;
                default:
                    ejercitoBestias[i] = new Orco("Orco "+Orco.getInstancias());
                    break;
            }
        }
    }
}
