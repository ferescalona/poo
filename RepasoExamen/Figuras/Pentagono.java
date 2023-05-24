package RepasoExamen.Figuras;
import javax.swing.JOptionPane;

public class Pentagono extends Figura2d{
    boolean status,equilatero;
    int numLados=5;
    double b,p;
    public void pe(){
        while(this.status==false){
            String opc=JOptionPane.showInputDialog("1. Pentágono equilatero\n2. No equilatero");
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
            p=perimetro;
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
            perimetro=l+l2+l3+l4+l5;
            p=perimetro;
        }
    }

    public void CalcularArea(){
        if(equilatero==true){
            double e = Math.toRadians(36);
            double apo=b/(2*Math.tan(e));
            area=(p*apo)/2;
        }
    }

    public void MostrarInformacion(){
        JOptionPane.showMessageDialog(null, "El perímetro es: "+perimetro);
        JOptionPane.showMessageDialog(null, "El área es: "+area);
    }
}
