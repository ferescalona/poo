package Examen.Electrodomesticos;
import javax.swing.JOptionPane;

public class Electrodomesticos {
    double precio,peso,altura,longitud;
    String color;

    public void Caracteristicas(){
        String color=JOptionPane.showInputDialog("Ingresa el color: ");
        System.out.println("Electrodoméstico color: "+color);
    }

    public void Precio(){
        String precio=JOptionPane.showInputDialog("Ingresa el precio: ");
        double p = Integer.parseInt(precio);
        p=p+(p*0.16);
        System.out.println("Precio + IVA: $"+p);
    }
}
