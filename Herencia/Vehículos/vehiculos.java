package Herencia.Vehículos;

public class vehiculos {
    double aceleracion,longitud,altura,peso,velMax,velActual,posicion,direccion,precio;
    String color,marca;
    int numVelocidades,capacidadAsientos;

    public vehiculos(){

    }

    //metodos
    public void Avanzar(){
    System.out.println("Estoy avanzando");

    }

    public void Acelerar(double aceleracion){
        this.aceleracion=this.aceleracion+aceleracion;
        if(aceleracion>0){
            System.out.println("Estoy acelerando");
        }else{
            System.out.println("Estoy frenando");
        }
    }

    public void CambiarVelocidades(int velocidad){
        if(velocidad==numVelocidades){
            this.velActual=velocidad;
            System.out.println("Se cambió la velocidad");
        }else{
            System.out.println("Velocidad fuera del rango");
        }
    }

    public void CambiarDireccion(double cambio){
        System.out.println("Se cambió la dirección");
    }
}
