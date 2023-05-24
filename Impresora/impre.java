//Escalona_Lopez_Maria_Fernanda Expediente: 315269
package Impresora;
import javax.swing.JOptionPane;


public class impre {
    double impresora;
    boolean status,status2;

//constructor vacío
public impre(){

}
//constructor
    public impre(double impresora){
        this.impresora=impresora;
    }

    public void Encender(){
        if(this.status==false){
            this.status=true;
            JOptionPane.showMessageDialog(null, "Impresora encendida");
        }
    }

    public void SeleccionarArchivo(){
        JOptionPane.showInputDialog(null,"Selecciona el archivo a imprimir","ARCHIVO", JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Seleccione","Doc1", "Doc2", "Doc3","Doc4" },"Seleccione");
    }

    public void SeleccionarImpresora(){
        JOptionPane.showInputDialog(null,"Selecciona la impresora","IMPRESORA", JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Seleccione","Impresora1", "Impresora2", "Impresora3" },"Seleccione");
    }

    public void NumCopias(){
        while(this.status2==false){
            String opc=JOptionPane.showInputDialog("Ingresa el número de copias");
            try{
                int number = Integer.parseInt(opc);
                System.out.println(number);
                if(number<=0){
                    JOptionPane.showMessageDialog(null, "No es valido, el número mínimo de copias es 1");
                    this.status2=false;
                }else if((number>=1)&&(number<=500)){
                    //JOptionPane.showMessageDialog(null, "");
                    this.status2=true;
                }else if(number>500){
                    JOptionPane.showMessageDialog(null, "La cantidad de copias sobrepasa el límite, ingresa una menor cantidad a 500 copias");
                    this.status2=true;
                    this.status2=false;
                }
                }
            catch (NumberFormatException ex){
                ex.printStackTrace();
            }
        }
    }

    public void Tinta(){
        JOptionPane.showInputDialog(null,"Selecciona la opción que deseas","TINTA", JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Seleccione","A color", "B&W"},"Seleccione");
    }

    public void Orientación(){
        JOptionPane.showInputDialog(null,"Selecciona la orientación","ORIENTACIÓN", JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Seleccione","Vertical", "Horizontal"},"Seleccione");
    }

    public void Imprimiendo(){
        JOptionPane.showMessageDialog(null, "Imprimiendo...");
        JOptionPane.showMessageDialog(null, "Impresión finalizada");
    }

    public void Apagar(){
        if(this.status==true){
            this.status=false;
            JOptionPane.showMessageDialog(null, "Impresora apagada");
        }
    }
}
