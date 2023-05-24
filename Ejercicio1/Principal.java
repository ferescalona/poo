package Ejercicio1;


public class Principal {
    public static void main(String[]Args){
        CuentaBancaria cuenta1=new CuentaBancaria(1000,"Fernanda");
        System.out.println("ID: "+cuenta1.id);
        

        System.out.println(cuenta1.nombre);
        System.out.println(cuenta1.getPsw());
        cuenta1.RetirarDinero();
        cuenta1.IngresarDinero();

        
    }
}
