//Escalona_Lopez_Maria_Fernanda Expediente: 315269
package Caminadora;
import javax.swing.JOptionPane;
import java.util.concurrent.TimeUnit;


public class caminadora {
    double caminadora;
    int Tiempo,contTiempo;
    boolean status;

    public caminadora(){

    }

    public caminadora(double caminadora){
        this.caminadora=caminadora;
    }

    public void Encender(){
        if(this.status==false){
            this.status=true;
            JOptionPane.showMessageDialog(null, "Caminadora encendida");
        }
    }

    public void Inclinación(){
        JOptionPane.showInputDialog(null,"Seleccione el nivel de inclinación","INCLINACIÓN", JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Seleccione","0", "0.5%", "1.0%","1.5%","2.0%","2.5%","3.0%","3.5%","4.0%" },"Seleccione");
    }

    public void Velocidad(){
        JOptionPane.showInputDialog(null,"Seleccione el nivel de velocidad","VELOCIDAD", JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Seleccione","1", "2", "3","4","5","6","7","8","9","10" },"Seleccione");
    }

    public void Tiempo() throws InterruptedException{
        String opc = JOptionPane.showInputDialog("Ingresa los minutos a caminar: ");
        int valorEntero = Integer.parseInt(opc); //
        //el valor entero en segundos lo mandamos al cap de tiempo que vamos a esperar.
        this.Tiempo = valorEntero;
        for(int i = 0; i<this.Tiempo; i++){
            this.contTiempo = this.contTiempo+1;
            TimeUnit.SECONDS.sleep(1);
            System.out.println(this.contTiempo);
        }
        JOptionPane.showMessageDialog(null, "Terminaste tu sesión");
    }

    public void Apagar(){
        if(this.status==true){
            this.status=false;
            JOptionPane.showMessageDialog(null, "Caminadora apagada");
        }
    }
}
