
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Problema3 {

    int suma, posicion;
    FileReader fr;

    Problema3() {
        this.suma = 0;
        this.fr = null;
        this.posicion = -1;
    }

    public void leerArchivo(String dir) {
        String linea;
        try {
            // direccion : C:\\Users\\teno1\\Documents\\Curso_java\\triangle.txt
            File archivo = new File(dir);
            this.fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(this.fr);

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                sumarNum(linea);
            }
        } catch (Exception e) {
            System.err.println("El error es: " + e);
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
            }
        }
        System.out.println("La suma es :" + suma);
    }

    public void sumarNum(String linea) {
        int numero1 = 0, numero2 = 0, nummayor = 0;

        String numeros[] = linea.split(" ");

        if (this.posicion == -1) {
            // buscamos el primer numero mayor de la primera fila de la piramide.
            for (int i = 0; i < numeros.length; i++) {
                numero1 = Integer.parseInt(numeros[i]);
                if (numero1 >= nummayor) {
                    nummayor = numero1;
                    this.posicion = i;
                }
            }

            System.out.println("---->" + nummayor);
            this.suma += nummayor;
        } else {

            for (int i = 0; i < numeros.length; i++) {

                if (this.posicion == i) {
                    numero1 = Integer.parseInt(numeros[i]);
                    numero2 = Integer.parseInt(numeros[i + 1]);
                    if (numero1 > numero2) {
                        nummayor = numero1;
                        this.posicion = i;

                    } else {
                        if (numero2 > numero1) {
                            nummayor = numero2;
                            this.posicion = i + 1;
                            break;
                        }

                    }
                }

            }
            System.out.println("---->" + nummayor);
            suma += nummayor;

        }

    }

}
