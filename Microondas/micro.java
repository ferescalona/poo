package Microondas;
import javax.swing.JOptionPane;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class micro {
    String modelo,color,size;
    int potenciaW,contTiempo,capDeTiempo;
    double hora;
    boolean status;
    
    //Constructor vacío
    public micro(){

    }

    //constructor completo
    public micro(String modelo,String color, String size, int potenciaW,int contTiempo,int capDeTiempo,double hora, boolean status){
        this.modelo = modelo;
    this.color = color;
    this.size = size;
    this.potenciaW = potenciaW;
    this.contTiempo = contTiempo;
    this.capDeTiempo = capDeTiempo;
    this.hora = hora;
    this.status = status;
    }

    //métodos
    public void Apagar(){
        if(this.status == true){
            this.status = false;
            JOptionPane.showMessageDialog(null, "Blip!\nMicro apagado...");
        }
    }

    public void Prender(){
        if(this.status == false){
            this.status = true;
            JOptionPane.showMessageDialog(null, "Blip\nMicro prendido...");
        }
    }

    public void UtilizarDefault(){
        String opc = JOptionPane.showInputDialog("Selecciona la opción para calentar tu comida:\n1.-Calentar medio\n2.-Calentar bajo\n3.-Descongelar");
        switch(opc){
            case "1":
            JOptionPane.showMessageDialog(null,"Calentando a nivel medio");
            break;

            case "2":
            JOptionPane.showMessageDialog(null,"Calentando a temperatura baja");
            break;

            case "3":
            JOptionPane.showMessageDialog(null,"Descongelando....");
            break;

            default:
            JOptionPane.showMessageDialog(null, "No se concluyó el proceso...");
            break;
        }
    }

    public void InsertarTiempo() throws InterruptedException{ //throws Exceptions
        String opc = JOptionPane.showInputDialog("Ingresalos segundos a calentar: ");
        int valorEntero = Integer.parseInt(opc); //
        //el valor entero en segundos lo mandamos al cap de tiempo que vamos a esperar.
        this.capDeTiempo = valorEntero;
        for(int i = 0; i<this.capDeTiempo; i++){
            this.contTiempo = this.contTiempo+1;
            TimeUnit.SECONDS.sleep(1);
            System.out.println(this.contTiempo);
        }
        JOptionPane.showMessageDialog(null, "Blip!\nTu comida esta lista");
    }

    public void Calentar(int tipoCalentar) throws InterruptedException{ //0 - Usar default, 1- InsertarTiempo
        if(this.status == true){
            if(tipoCalentar == 0){
                this.UtilizarDefault();
            }else if(tipoCalentar == 1){
                this.InsertarTiempo();
            }
        }
    }

    public void MostrarHora(){
        Date hora = new Date();
        JOptionPane.showMessageDialog(null, hora.getTime());
    }
}
