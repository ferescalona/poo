package Ejercicio1.yop;

public class Principal {
    public static void main(String[]Args){
        CuentaBancaria2 cuenta1=new CuentaBancaria2(1000,"Fer",1548279);
        System.out.println(cuenta1.id);
        System.out.println(cuenta1.nombre);
        System.out.println(cuenta1.getPsw());
        System.out.println(cuenta1.getSaldo());
        cuenta1.getSaldo();
        cuenta1.login();
        cuenta1.CambioPsw();
        //cuenta1.Funcionamiento();
        System.out.println(cuenta1.getSaldo());
        cuenta1.Deposito(0);
        System.out.println(cuenta1.getSaldo());
        cuenta1.Transferencia(cuenta1);
    }
}
