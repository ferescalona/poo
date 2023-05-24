package Ejercicio1.yop;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class CuentaBancaria2 {
    Scanner entrada=new Scanner(System.in);
    int id=0,mov=0;
    String nombre="Default";
    private double saldo; 
    private boolean activo=false; 
    private String psw="generico";
    private double telefono;
    static int idAux=100000;


    public CuentaBancaria2(){
        this.id=CuentaBancaria2.idAux+1; //es un valor estático de la clase CuentaBancaria
        CuentaBancaria2.idAux++;
        
    }

    public CuentaBancaria2(double saldo,String nombre, double telefono){
        this.id=CuentaBancaria2.idAux+1;
        this.saldo=saldo; //el saldo se ingresará
        this.nombre=nombre; //el nombre se ingresará
        this.psw=this.nombre+this.id; //la psw será el nombre y el id juntos
        this.telefono=telefono;
    }

    //parte del login para ingresar
    public void login(){
        if(this.activo){
            JOptionPane.showMessageDialog(null, "Ya estas Logeado","Error",JOptionPane.WARNING_MESSAGE);
        }else{
            String tel=JOptionPane.showInputDialog(null, "Ingresa tu número de teléfono (442): ", "Login", JOptionPane.QUESTION_MESSAGE);
            double number = Integer.parseInt(tel);
                if(this.telefono==number){
                    JOptionPane.showMessageDialog(null, "¡Teléfono correcto!","Login",JOptionPane.PLAIN_MESSAGE);
                    //this.activo=true;
                    String psw2=JOptionPane.showInputDialog(null, "Ingresa tu contraseña: ", "Login", JOptionPane.QUESTION_MESSAGE);
                if(this.psw.equals(psw2)){
                    JOptionPane.showMessageDialog(null, "¡Has iniciado sesión!","Login",JOptionPane.PLAIN_MESSAGE);
                    this.activo=true;
                }else{
                    JOptionPane.showMessageDialog(null, "Fallo en inicio de sesión","Error",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Fallo en inicio de sesión","Error",JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
    }

    //deposito
    public void Deposito(int monto){
        if(this.activo==true){
            System.out.println("Ingresa la cantidad a depositar");
            monto=entrada.nextInt();
            mov++;
            System.out.println("Número de movimientos: "+mov);
            this.saldo=this.saldo+monto;
            

            
        }else{
            this.login();
            if(this.activo==true){
                this.saldo=this.saldo+monto;
            }else{
                System.out.println("ERROR AL INICIO DE SESIÓN");
            }
        }
    }

    public void CambioPsw(){
        if(this.activo==true){
            String psw2=JOptionPane.showInputDialog(null, "Ingresa tu nueva contraseña: ", "Login", JOptionPane.QUESTION_MESSAGE);
            this.setPsw(psw2);
        }else{
            this.login();
            if(this.activo==true){
                String psw2=JOptionPane.showInputDialog(null, "Ingresa tu nueva contraseña: ", "Login", JOptionPane.QUESTION_MESSAGE);
                this.setPsw(psw2);
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

    public double getTelefono(){
        return telefono;
    }

    public void setTelefono(double telefono){
        this.telefono=telefono;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    /*public int getNumMov(){
        return numMov;
    }

    public void setNumMov(int numMov){
        this.numMov=numMov;
    }*/

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

    public String getNombre(){
    return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
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

    public void Transferencia(CuentaBancaria2 cuenta2){
        if(this.activo==true){
            System.out.println(this.saldo+"--------"+cuenta2.saldo);
            System.out.println("Ingresa el monto a transferir");
            double montoAtrans=entrada.nextDouble();
            mov++;
            System.out.println("Número de movimientos: "+mov);
            if(this.saldo>=montoAtrans){
                this.saldo=this.saldo-montoAtrans;
                System.out.println("Transferencia exitosa");
                System.out.println(this.saldo+"--------"+cuenta2.saldo);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            this.login();
            if(this.activo==true){
                System.out.println(this.saldo+"--------"+cuenta2.saldo);
            System.out.println("Ingresa el monto a transferir");
            double montoAtrans=entrada.nextDouble();
            if(this.saldo>=montoAtrans){
                this.saldo=this.saldo-montoAtrans;
                System.out.println("Transferencia exitosa");
                System.out.println(this.saldo+"--------"+cuenta2.saldo);
            }else{
                System.out.println("Saldo insuficiente");
            }
            }else{
                System.out.println("Ingresaste mal la contraseña");
            }
        }
    }
}
