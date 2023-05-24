package Licuadora;
import javax.swing.JOptionPane;

public class licuadora {
    double capacidad=0;
    String marca,color;
    boolean status,vacia=true,encendida=false,girando=false;
    int velocidades=6, velAcual;

    public licuadora(double capacidad,String marca,String color,int velocidades,int velAcual){
        this.capacidad=capacidad;
        this.marca=marca;
        this.color=color;
    }

    public void Encender(){
        if(this.encendida==false){
            this.encendida=true;
            JOptionPane.showMessageDialog(null, "Licuadora conectada");
            //this.girando=true;
            //setVelAcual(1);
        }else{
            this.encendida=false;
            System.out.println("Licuadora apagada");
        }
    }

    public void isEmpty(){
        if(this.encendida==true){
            if(vacia==true){
                JOptionPane.showMessageDialog(null, "Licuadora vacía...");
            }else{
                this.Girar();
            }  
        }else{
            this.Encender();
            JOptionPane.showMessageDialog(null, "Licuadora vacía. Inserte alimento(s) a licuar");
        }
    }

    public void Lllenar(){
        if(this.encendida==true){
            if(vacia==true){
                JOptionPane.showInputDialog(null, "Inserte alimento(s) a licuar");
                JOptionPane.showMessageDialog(null, "Licuadora llena");
                vacia=false;
            }else{
                this.Girar();
            }
        }else{
            this.Encender();
            JOptionPane.showMessageDialog(null, "Licuadora vacía. Inserte alimento(s) a licuar");
            JOptionPane.showInputDialog(null, "Inserte alimento(s) a licuar");
            JOptionPane.showMessageDialog(null, "Licuadora llena");
        }
    }

    public void Girar(){
        if(encendida==true){
            if(vacia==false){
                JOptionPane.showMessageDialog(null, "Licuadora girando");
            }else{
                this.Lllenar();
            }
        }else{
            this.Encender();
        }
    }

    public void cambiarVel(){
            JOptionPane.showMessageDialog(null, "La velocidad actual es 1");
            while(this.status==false){
            String opc=JOptionPane.showInputDialog(null, "Cambiar la velocidad (1-4): ", "VELOCIDAD", JOptionPane.QUESTION_MESSAGE);
            int vel = Integer.parseInt(opc);
                switch(vel){
                    case 1:
                    JOptionPane.showMessageDialog(null, "Girando en velocidad 1");
                    this.status=true;
                    break;
        
                    case 2:
                    JOptionPane.showMessageDialog(null, "Girando en velocidad 2");
                    this.status=true;
                    break;
        
                    case 3:
                    JOptionPane.showMessageDialog(null, "Girando en velocidad 3");
                    this.status=true;
                    break;
        
                    case 4:
                    JOptionPane.showMessageDialog(null, "Girando en velocidad 4");
                    this.status=true;
                    break;
        
                    default:
                    JOptionPane.showMessageDialog(null, "No es una opción. Selecciona una velocidad entre 1 y 4");
                    this.status=false;
                    break;
                }
            }   
        }

    public void Apagar(){
        if(this.encendida==true){
            this.girando=false;
            JOptionPane.showMessageDialog(null, "Listo!!! Vacía tu licuado. Licuadora apagada");
            this.encendida=false;
        }
    }

    public void Vaciar(){
        if(this.encendida==false){
            JOptionPane.showMessageDialog(null, "Mezcla vaciada");
        }else{
            JOptionPane.showMessageDialog(null, "Error. Apaga la licuadora para poder vaciar");
            this.Apagar();
        }
    }
}
