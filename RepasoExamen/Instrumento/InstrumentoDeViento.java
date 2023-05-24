package RepasoExamen.Instrumento;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class InstrumentoDeViento {
    int numCuerdas,capDeTiempo,contTiempo,valorEntero=100;
    boolean estadoAfinado=false,ocupado=false;
    double largo,ancho;

    //métodos
    public InstrumentoDeViento(double largo,double ancho,int numCuerdas){
        this.ancho=ancho;
        this.largo=largo;
    }

    public void Afinar()throws InterruptedException{
        System.out.println("Dimensiones del instrumento: "+largo+" x "+ancho+" mts");
        JOptionPane.showMessageDialog(null, "Guitarra desafinada. Afinando...");
        this.capDeTiempo = valorEntero;
        for(int i=0; i<this.capDeTiempo; i+=10){
            this.contTiempo = this.contTiempo+10;
            TimeUnit.SECONDS.sleep(1);
            System.out.println(this.contTiempo+" %");
        }
        JOptionPane.showMessageDialog(null, "Guitarra afinada");
    }

    public void Tocar(){
        if(ocupado==false){
            System.out.println("Puedes tocar la guitarra");
            JOptionPane.showMessageDialog(null, "Tocando la guitarra...");
            ocupado=true;
        }else{
            System.out.println("No puedes tocar la guitarra. Está ocupada.");
        }
    }
}
