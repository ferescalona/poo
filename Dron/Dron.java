package Dron;

public class Dron {
    int nivelComb,combMax,prendido,motorGirando,elevacion,posicion,elevacionMax;
    int posicionX=0,posicionY,posicionZ=0;
    boolean encendido=false;

    public Dron(int combMax,int nivelComb,int posicionY){
        this.combMax=combMax;
        this.nivelComb=nivelComb;
    }

    public void Prender(){
        if(this.encendido==false){
            this.encendido=true;
            System.out.println("Dron encendido");
        }else{
            this.encendido=false;
            System.out.println("Dron apagado");
        }
    }

    public void Despegar(){
        if(nivelComb>10){
            System.out.println("Dron despegando");
            this.nivelComb=nivelComb-5;
            System.out.println("Nivel actual de combustile: "+nivelComb);
        }else{
            System.out.println("Combustible insuficiente...Tu nivel de combustible es:"+nivelComb);
        }
    }

    public void ConsumirComb(){
        System.out.println("Dron encendido");
    }

    public void EstarEnAire(){
        
        //this.posicionY=posicionY+10;
        if(posicionY>0){
            System.out.println("Dron en el aire");
            System.out.println(posicionY);
        }else{
            System.out.println("Dron en el suelo");
        }
    }

    public void AcelerarH(){
        System.out.println("Acelerando H");
    }

    public void AcelerarV(){
        System.out.println("Acelerando V");
    }

    public void Recargar(){
        System.out.println("Recargando...");
        this.nivelComb=nivelComb+5;
        System.out.println("Recargando...");
        this.nivelComb=nivelComb+5;
        System.out.println("Recargando...");
        this.nivelComb=nivelComb+5;
        System.out.println("Nivel de combustible actual: "+nivelComb);
        if(nivelComb>10){
            this.Despegar();    
        }else{
            System.out.println("Combustible insuficiente...Tu nivel de combustible es:"+nivelComb);
            this.Recargar();
        }

    }
}
