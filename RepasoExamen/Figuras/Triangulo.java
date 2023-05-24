package RepasoExamen.Figuras;
import javax.swing.JOptionPane;
import java.lang.Math;

public class Triangulo extends Figura2d {
    int numLados=3;
    boolean equilatero,status;
    double b,l,p,a,c,d;
    public Triangulo(){

    }

    public void Tri(){
        while(this.status==false){
            String opc=JOptionPane.showInputDialog("1. Triangulo equilatero\n2. No equilatero");
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
            String lado=JOptionPane.showInputDialog("Ingresa la medida del 1 lado");
            double l = Integer.parseInt(lado); 
            perimetro=l*numLados;
            b=l;
        }else{
            String lado=JOptionPane.showInputDialog("Ingresa la medida del 1° lado");
            double l = Integer.parseInt(lado);            
            String lado2=JOptionPane.showInputDialog("Ingresa la medida del 2° lado");
            double l2 = Integer.parseInt(lado2);
            String lado3=JOptionPane.showInputDialog("Ingresa la medida del 3° lado");
            double l3 = Integer.parseInt(lado3);
            perimetro=l+l2+l3;
            p=perimetro;
            a=l;
            c=l2;
            d=l3;
        }
    }

    public void CalcularArea(){
        if(equilatero==true){
            double raiz=Math.sqrt(3);
            area=(raiz/4)*(b*b);
        }else{
            double s=p/2;
            area=Math.sqrt(s*(s-a)*(s-c)*(s-d));
        }
    }

    public void MostrarInformacion(){
        JOptionPane.showMessageDialog(null, "El área es: "+area);
        JOptionPane.showMessageDialog(null, "El perímetro es: "+perimetro);
    }
}
