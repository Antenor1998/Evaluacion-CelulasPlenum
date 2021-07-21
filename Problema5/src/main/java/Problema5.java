
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Problema5 {

    List<String> maso1, maso2;
    int w;

    Problema5() {
        this.maso1 = Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        this.maso2 = maso1;
        this.w = 0;
    }

    public void juego() {
        System.out.println("El maso 1 -----> " + maso1);
        System.out.println("El maso 2  -----> " + maso2);
        revolver();
    }

    public void revolver() {
        Collections.shuffle(this.maso1);
        System.out.println("maso 1 varageado --->" + maso1);
        Collections.shuffle(this.maso2);
    }

    public ArrayList repartirCartas() {
        ArrayList cartas = new ArrayList();
        cartas.add(this.maso1.get(this.w));
        cartas.add(this.maso2.get(this.w));
        this.maso1.remove(w);
        this.maso2.remove(w);
        w++;
        return cartas;
    }
}
