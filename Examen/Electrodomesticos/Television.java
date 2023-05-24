package Examen.Electrodomesticos;
import javax.swing.JOptionPane;

public class Television extends Electrodomesticos{
    boolean prendida;
    String resolucion,canalesVideo;
    //por defecto
    public Television(){

    }
    //recibe precio y peso
    public Television(double precio,double peso){
        System.out.println("2° Constructor");
        System.out.println("El precio es: $"+(this.precio=precio));
        System.out.println("El peso es: "+(this.peso=peso)+" kg");
    }

    //recibe todos los atributos
    public Television(double precio,double peso,double altura,double longitud,String color,String resolucion){
        System.out.println("3° Constructor");
        System.out.println("El precio es: $"+(this.precio=precio));
        System.out.println("El peso es: "+(this.peso=peso));
        System.out.println("La altura es: "+(this.altura=altura));
        System.out.println("La longitud es: "+(this.longitud=longitud));
        System.out.println("El color es: "+(this.color=color));
        System.out.println("La resolucion es: "+(this.resolucion=resolucion));
    }

    public void Prender(){
        if(this.prendida==false){
            this.prendida=true;
            JOptionPane.showMessageDialog(null, "Televisión encendida");
        }else{
            this.prendida=false;
            System.out.println("Televisión apagada");
        }
    }

    public void CambiarCanal(){
        String canal=JOptionPane.showInputDialog("Ingresa el número del canal");
        int c = Integer.parseInt(canal);
        if((c<=100)&&(c>=1)){
            JOptionPane.showMessageDialog(null, "Estás en el canal: "+c);
        }else{
            JOptionPane.showMessageDialog(null, "No existe el canal: "+c);
        }

    }

    public void Apagar(){
        if(this.prendida==true){
            JOptionPane.showMessageDialog(null, "Televisión apagada");
            this.prendida=false;
        }
    }
}
