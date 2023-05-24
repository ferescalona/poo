package RepasoExamen.Figuras;
import javax.swing.JOptionPane;

public class Cuadrado extends Figura2d {
    int numLados=4;
    double l,a;

    public void CalcularPerimetro(){
        String lado=JOptionPane.showInputDialog("Ingresa la medida del 1 lado");
        double l = Integer.parseInt(lado); 
        perimetro=l*numLados;
        a=l;
    }

    public void CalcularArea(){
        area=a*a;
    }

    public void MostrarInformacion(){
        JOptionPane.showMessageDialog(null, "El perímetro es: "+perimetro);
        JOptionPane.showMessageDialog(null, "El área es: "+area);
    }
}
