package Herencia;
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Animales {
    boolean estado=true,activo=true;
    char sexo;
    String reproduccion, alimentacion;
    

    public Animales(){
    }

    public void Movimiento(){
        if(activo==true){
            System.out.println("Se está moviendo");
        }else{
            System.out.println("NO se está moviendo");
        }
    }

    public void Nacer(){

    }

    public void Morir(){

    }

    public void Reproducir(){

    }

    public void Comer(){
        
    }

    public void Dormir(){

    }

    public void Respirar(){
        if(estado==true){
            System.out.println("Está respirando");
        }else{
            System.out.println("NO está respirando. No está vivo");
        }
    }

    public void Desplazar(){

    }
}
