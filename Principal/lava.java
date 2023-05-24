//Escalona_Lopez_Maria_Fernanda Expediente: 315269
package Principal;
import javax.swing.JOptionPane;

public class lava {
    double lavadora;
    boolean status,status2;

    //constructor vacío
    public lava(){

    }
    //constructor
    public lava(double lavadora){
        this.lavadora=lavadora;
    }

    public void Encender(){
        if(this.status==false){
            this.status=true;
            JOptionPane.showMessageDialog(null, "Lavadora encendida");
        }
    }

    public void SeleccionarCarga(){
        while(this.status2==false){
        String opc=JOptionPane.showInputDialog("Ingresa el número de prendas");
            try{
                int number = Integer.parseInt(opc);
                System.out.println(number);
                if(number<=0){
                    JOptionPane.showMessageDialog(null, "No es valido, ingresa al menos 1 prenda para saber la carga");
                    this.status2=false;
                }else if(number<=10){
                    JOptionPane.showMessageDialog(null, "Carga chica");
                    this.status2=true;
                }else if((number<=20)&&(number>=11)){
                    JOptionPane.showMessageDialog(null, "Carga media");
                    this.status2=true;
                }else if((number<=30)&&(number>=21)){
                    JOptionPane.showMessageDialog(null, "Carga grande");
                    this.status2=true;
                }else if(number>30){
                    JOptionPane.showMessageDialog(null, "La cantidad de prendas sobrepasa el límite, ingresa una menor cantidad a 30 prendas");
                    this.status2=false;
                }  
                }
            catch (NumberFormatException ex){
                ex.printStackTrace();
            }
        }
    }

public void Temp(){
    JOptionPane.showInputDialog(null,"Seleccione la temperatura","TEMPERATURA", JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Seleccione","Frío", "Tibio", "Caliente" },"Seleccione");
}

public void EnjuagueAdicional(){
    int resp=JOptionPane.showConfirmDialog(null,"¿Enjuague adicional?");
    if (JOptionPane.OK_OPTION == resp){
    System.out.println("SI");
    }else{
    System.out.println("NO");
    }
}

public void TipoRopa(){
    JOptionPane.showInputDialog(null,"Seleccione el tipo de ropa","ROPA", JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Seleccione","Normal", "Casual", "Delicado" },"Seleccione");
}

public void Velocidad(){
    JOptionPane.showInputDialog(null,"Seleccione la velocidad del ciclo","VELOCIDAD", JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Seleccione","Normal", "Rápido", "Intenso" },"Seleccione");
}

public void Ciclo(){
    JOptionPane.showMessageDialog(null, "Iniciando ciclo");
    JOptionPane.showMessageDialog(null, "Enjuagando");
    JOptionPane.showMessageDialog(null, "Exprimiendo");
    JOptionPane.showMessageDialog(null, "Fin del ciclo");
}

    public void Apagar(){
        if(this.status==true){
            this.status=false;
            JOptionPane.showMessageDialog(null, "Lavadora apagada");
        }
    }
}
