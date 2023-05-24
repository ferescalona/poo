//Escalona_Lopez_Maria_Fernanda Expediente: 315269
package Celular;
import javax.swing.JOptionPane;

public class celu {
    double telefono;
    boolean status,status2,status3,status4,llamar,msj,x,y;
    //status=encendido,apagado
    //status2=HacerLlamadas
    //status3=Funciones
    //status4=mensajes
    //llamar=llamadas

    //constructor vacío
    public celu(){

    }

    //constructor 
    public celu(double telefono){
        this.telefono=telefono;
    }

        //métodos
    public void Encender(){
        if(this.status==false){
            this.status=true;
            JOptionPane.showMessageDialog(null, "Teléfono encendido");
        }
    }

    public void Apagar(){
        if(this.status==true){
            this.status=false;
            JOptionPane.showMessageDialog(null, "Teléfono apagado");
        }
    }

    public void Funciones(){
        while(this.status3==false){
            String opc2=JOptionPane.showInputDialog("Ingresa la opción que deseas\n1.-Llamada\n2.-Mensaje");
            switch(opc2){
                case "1":
                this.llamar=true;
                this.status3=true;
                break;

                case "2":
                this.msj=true;
                this.status3=true;
                break;

                default:
                JOptionPane.showMessageDialog(null,"No es una opción válida");
                this.status3=false;
                break;
            }
        }
    }

    public void HacerLlamadas(){
            while((this.status2==false)||(this.llamar==true)){
                String opc=JOptionPane.showInputDialog("Selecciona una opción\n1.- Ingresa el número al que quieres llamar\n2.-Salir");
                switch(opc){
                    case "1":
                    JOptionPane.showInputDialog("Ingresa el número al que deseas marcar");
                    JOptionPane.showMessageDialog(null,"Llamando");
                    this.status2=true;
                    break;
                    
                    case "2":
                    this.status2=true;
                    this.llamar=false;
                    break;
                    
                    default:
                    JOptionPane.showMessageDialog(null,"No es una opción válida");
                    this.status2=false;
                    break;
            }
        }
        
    }
    
    public void MandarMensajes(){
            while((this.msj==true)||(this.status4==false)){
                String opc=JOptionPane.showInputDialog("Selecciona una opción\n1.- Selecciona un contacto\n2.-Salir");
                switch(opc){
                    case "1":
                    Object contacto =JOptionPane.showInputDialog(null,"Seleccione un contacto","CONTACTOS", JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Seleccione","Contacto 1", "Contacto 2", "Contacto 3" },"Seleccione");
                    JOptionPane.showInputDialog("Escribe tu mensaje");
                    this.status4=true;
                    break;
    
                    case "2":
                    this.status4=true;
                    this.msj=false;
                    break;
    
                    default:
                    JOptionPane.showMessageDialog(null,"No es una opción válida");
                    this.status4=false;
                    break;
            }
        }
        
    }
}

