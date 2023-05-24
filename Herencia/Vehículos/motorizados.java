package Herencia.Vehículos;

public class motorizados extends vehiculos{
    int revoluciones;
    double torque,tipoCombustible,capacidadCombus,nivelComb,temperatura, kilometraje;
    boolean status;
    public void Consumircombistible(double conbConsumido){
        if(this.nivelComb-conbConsumido>=0){
            this.nivelComb=this.nivelComb;
        }
    }

    public void RecargarCombus(double combRecargado){
        if(this.nivelComb+combRecargado>this.capacidadCombus){
            System.out.println("Imposible recargar");
        }else{
            this.nivelComb=this.nivelComb+combRecargado;
        }
    }

    public void DarMantenimiento(String tipoMantenimiento) throws InterruptedException{
        System.out.println("Dando mantenimiento"+tipoMantenimiento);
        Thread.sleep(10000); //espera en milisegundos
        System.out.println("Mantenimiento realizado");
    }

    public void Prender(){
        if(this.status==false){
            System.out.println("Prendiendo");
        }else{
            System.out.println("Ya esta encendido");
        }
    }

    public void Apagar(){
        if(this.status==true){
            System.out.println("Apagando");
        }else{
            System.out.println("Ya esta apagado");
        }
    
    }



}
