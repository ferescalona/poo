package Ejercicio1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CuentaBancaria {
    Scanner entrada=new Scanner(System.in);
    int id=0,numMov=0;
    int saldoInicial=1000;
    int saldoActual,montoARetirar;
    String nombre="Default";
    double saldo; //datos privados
    private boolean activo=true; //para saber si el usuario esta logeado
    private String psw="generico";
    static int idAux=100000; //valor que no se modifica para registar los id

    //se genera el número de id y se suma+1 para que sean diferentes los que se generen
    public CuentaBancaria(){
        this.id=CuentaBancaria.idAux+1; //es un vaor estático de la clase CuentaBancaria
        CuentaBancaria.idAux++;
    }

    //constructor con valores
    public CuentaBancaria(double saldo,String nombre){
        System.out.println("ID: "+(this.id=CuentaBancaria.idAux+1));
        this.saldo=saldo; //el saldo se ingresará
        this.nombre=nombre; //el nombre se ingresará
        this.psw=this.nombre+this.id; //la psw será el nombre y el id juntos
    }

    public void MostrarDatos(){
        System.out.println("Saldo="+saldoActual);
        System.out.println("Activo: "+activo);
    }

    //parte del login para ingresar
    public void login(){
        if(this.activo){
            JOptionPane.showMessageDialog(null, "Ya estas Logeado","Error",JOptionPane.WARNING_MESSAGE);
            activo=true;
        }else{
                JOptionPane.showMessageDialog(null, "Fallo en inicio de sesión","Error",JOptionPane.ERROR_MESSAGE);
            }
        }

        public void RetirarDinero(){
            String cantidad=JOptionPane.showInputDialog("Ingresa la cantidad a retirar");
            int c= Integer.parseInt(cantidad);
            saldoActual=saldoInicial-c;
            if(saldoInicial<c){
                JOptionPane.showMessageDialog(null, "No cuentas con el dinero");
            }else{
                JOptionPane.showMessageDialog(null, "Retiro exitoso");
                JOptionPane.showMessageDialog(null, "Tu saldo actual es de: "+saldoActual);
            }

        }

        public void IngresarDinero(){
            String cantidad=JOptionPane.showInputDialog("Ingresa la cantidad a ingresar");
            int c= Integer.parseInt(cantidad);
            saldoActual=saldoActual+c;
            JOptionPane.showMessageDialog(null, "Tu cuenta tiene: $"+saldoActual);
        }

    //deposito
    public void Deposito(int monto){
        if(this.activo==true){
            this.saldo=this.saldo+monto;
        }else{
            if(this.activo==true){
                this.saldo=this.saldo+monto;
            }else{
                System.out.println("ERROR AL INICIO DE SESIÓN");
            }
        }
    }

    


    //get de activo
    public boolean getActivo(){
        return activo;
    }

    public void setId(boolean activo){
        this.activo=activo;
    }

    

    
    public double getSaldo(){
        if(this.activo==true){
            return saldo;
        }else{
            this.login();
            if(this.activo==true){
                return saldo;
            }else{
                return -1;
            }
        }
    }
    
    public void setSaldo(double saldo){
        this.login();
        if(this.activo==true){
            this.saldo=saldo;
        }else{
            this.login();
            if(this.activo==true){
                this.saldo=saldo;
            }
        }
    }

    public String getPsw(){
        this.login();
        if(this.activo){
            return psw;
        }else{
            return "-1";
        }
    }

    public void setPsw(String psw){
        this.psw=psw;
    }

    
}
