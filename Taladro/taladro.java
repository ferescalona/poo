//Escalona_Lopez_Maria_Fernanda Expediente: 315269
package Taladro;
import javax.swing.JOptionPane;

public class taladro {
    double taladro;
    boolean status;

    public taladro(){

    }

    public taladro(double taladro){
        this.taladro=taladro;
    }

    public void Encender(){
        if(this.status==false){
            this.status=true;
            JOptionPane.showMessageDialog(null, "Taladro encendido");
        }
    }

    public void TamañoBroca(){
        JOptionPane.showInputDialog(null,"Seleccione la broca a usar","BROCA", JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Seleccione","1/4", "3/8","1/8","1/16","3/16","5/16","3/32","5/32","7/32","15/32","5/64","7/64","9/64","11/64","13/64"},"Seleccione");
    }

    public void LuzLed(){
        int resp=JOptionPane.showConfirmDialog(null,"Encender Luz LED");
        if (JOptionPane.OK_OPTION == resp){
        System.out.println("SI");
        }else{
        System.out.println("NO");
        }
    }

    public void Velocidad(){
        JOptionPane.showInputDialog(null,"Seleccione la velocidad","VELOCIDAD", JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Seleccione","Baja", "Alta"},"Seleccione");
    }

    public void SentidoGiro(){
        JOptionPane.showInputDialog(null,"Seleccione el sentido del giro","SENTIDO", JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Seleccione","Derecha", "Izquierda"},"Seleccione");
    }

    public void Funcionamiento(){
        JOptionPane.showMessageDialog(null, "Taladrando...");
    }

    public void Apagar(){
        if(this.status==true){
            this.status=false;
            JOptionPane.showMessageDialog(null, "Taladro apagado");
        }
    }
}
