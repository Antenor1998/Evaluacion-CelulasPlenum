
import javax.swing.JOptionPane;

public class Problema1 {

    int num, residuo;
    long numalreves;

    Problema1() {
        this.num = 0;
        this.residuo = 0;
        this.numalreves = 0L;
    }

    public void invertiNum() {
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(Integer.MIN_VALUE);

        try {
            this.num = Integer.parseInt(JOptionPane.showInputDialog("ingresa el  numero a inverit"));

            while (this.num < 0 || this.num > 0) {
                this.residuo = this.num % 10;
                //System.err.println("---> " + this.residuo);
                this.numalreves = this.numalreves * 10 + this.residuo;
                this.num /= 10;
            }
            JOptionPane.showMessageDialog(null, "El numero es :  " + this.numalreves);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El numero es :  " + this.numalreves);
        }
    }

}
