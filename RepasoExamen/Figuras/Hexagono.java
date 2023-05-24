package RepasoExamen.Figuras;
import javax.swing.JOptionPane;
import java.lang.Math;


public class Hexagono extends Figura2d{
    int numLados=6;
    double b,p,la;
    boolean equilatero,status;

    public void hex(){
        while(this.status==false){
            String opc=JOptionPane.showInputDialog("1. Hexágono equilatero\n2. No equilatero");
            int number = Integer.parseInt(opc);
            System.out.println(number);
            if(number==1){
                this.equilatero=true;
                break;
            }else if(number==2){
                this.equilatero=false;
                break;
            }else{
                JOptionPane.showMessageDialog(null, "No es una opción válida");
                this.status=false;
            }
        }
    }

    public void CalcularPerimetro(){
        if(equilatero==true){
            String a=JOptionPane.showInputDialog("Ingresa la medida de 1 lado");
            double la = Integer.parseInt(a); 
            perimetro=la*numLados;
            b=la;
            }else{
            String lado=JOptionPane.showInputDialog("Ingresa la medida del 1° lado");
            double l = Integer.parseInt(lado);            
            String lado2=JOptionPane.showInputDialog("Ingresa la medida del 2° lado");
            double l2 = Integer.parseInt(lado2);
            String lado3=JOptionPane.showInputDialog("Ingresa la medida del 3° lado");
            double l3 = Integer.parseInt(lado3);
            String lado4=JOptionPane.showInputDialog("Ingresa la medida del 4° lado");
            double l4 = Integer.parseInt(lado4);
            String lado5=JOptionPane.showInputDialog("Ingresa la medida del 5° lado");
            double l5 = Integer.parseInt(lado5);
            String lado6=JOptionPane.showInputDialog("Ingresa la medida del 6° lado");
            double l6 = Integer.parseInt(lado6);
            perimetro=l+l2+l3+l4+l5+l6;
            p=perimetro;
        }
    }
    

    public void CalcularArea(){
        if(equilatero==true){
            double raiz=Math.sqrt(3);
            area=(raiz/4)*(b*b)*6;
        }
    }

    public void MostrarInformacion(){
        JOptionPane.showMessageDialog(null, "El perímetro es: "+perimetro);
        JOptionPane.showMessageDialog(null, "El área es: "+area);
    }
}
