package modificadorAcceso;
import java.util.Scanner;
//protected int numero=15;
public class prueba {
    private String mensaje="contraseña";
    public prueba(){

    }
    //getters - obtienen un valor
    public String getMensaje(){
        System.out.println("Ingresa *pin");
        Scanner entrada=new Scanner(System.in);
        String pin=entrada.nextLine();
        if(pin.equals("Fer")){
            return this.mensaje;
        }else{
            return "No tienes permiso";
        }

    }


    //setters - ingresan o declaran el valor de la variable
    public void SetMensaje(String men){
        this.mensaje=mensaje;
    }
}


