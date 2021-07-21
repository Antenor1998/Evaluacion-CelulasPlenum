
import java.util.ArrayList;


public class Jugador {
  
    ArrayList cartas;
    int puntuacion;
    Jugador(ArrayList cartas){
        this.cartas = cartas;
        this.puntuacion = 0;
    }
    
    public void comparar(){
        String carta1 = (String) cartas.get(0);
        String carta2 = (String) cartas.get(1);
        System.out.println("Carta 1: " + carta1 + "carta 2 :" + carta2);
    }
    
    

}
