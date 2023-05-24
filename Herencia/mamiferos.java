package Herencia;
import java.util.Scanner;
public class mamiferos extends Animales {
    Scanner entrada=new Scanner(System.in);
    boolean pelaje=true;

    public void Pelaje(){
        if(pelaje==true){
            System.out.println("Tiene pelaje");
        }else{
            System.out.println("NO tiene pelaje");
        }
    }

    public void Extremidades(){
        System.out.println("Ingresa el número de extremidades");
        int extremidades=entrada.nextInt();
        System.out.println("Tiene "+extremidades+" extremidades");
    }
}
