
import javax.swing.JOptionPane;

public class Problema2 {

    int num, residuo;
    long numalreves;

    Problema2() {
        this.num = 0;
        this.residuo = 0;
        this.numalreves = 0L;
    }

    public void aplindromo() {
        boolean respuesta;
        this.num = Integer.parseInt(JOptionPane.showInputDialog("ingresa un mumero: "));
        int varint = this.num;
        while (varint < 0 || varint > 0) {
            this.residuo = varint % 10;
            this.numalreves = this.numalreves * 10 + this.residuo;
            varint /= 10;
        }

        respuesta = this.num == numalreves;
        JOptionPane.showMessageDialog(null, "Respuesta :  " + respuesta);
    }
}
