package Examen.Electrodomesticos;
import javax.swing.JOptionPane;

public class Lavadora extends Electrodomesticos{
    int cargaKg;
    boolean prendida,status2;
    //por defecto
    public Lavadora(){

    }
    //recibe precio y peso
    public Lavadora(double precio,double peso){
        System.out.println("2° Constructor");
        System.out.println("El precio es: $"+(this.precio=precio));
        System.out.println("El peso es: "+(this.peso=peso));
    }

    //recibe todos los atributos
    public Lavadora(double precio,double peso,int carga,double altura,double longitud,String color){
        System.out.println("3° Constructor");
        System.out.println("El precio es: $"+(this.precio=precio));
        System.out.println("El peso es: "+(this.peso=peso));
        System.out.println("La altura es: "+(this.altura=altura));
        System.out.println("La longitud es: "+(this.longitud=longitud));
        System.out.println("El color es: "+(this.color=color));
        //System.out.println("La carga es: "+(this.cargaKg=cargaKg));
    }

    public void Prender(){
        if(this.prendida==false){
            this.prendida=true;
            JOptionPane.showMessageDialog(null, "Lavadora encendida");
        }else{
            this.prendida=false;
            System.out.println("Lavadora apagada");
        }
    }

    public void Lavar(){
        while(this.status2==false){
            String opc=JOptionPane.showInputDialog("Ingresa la cantidad de prendas en Kg");
                try{
                    int cargaKg = Integer.parseInt(opc);
                    System.out.println(cargaKg);
                    if(cargaKg<=0){
                        JOptionPane.showMessageDialog(null, "No es valido, ingresa al menos 1 prenda para saber la carga");
                        this.status2=false;
                    }else if(cargaKg<=5){
                        JOptionPane.showMessageDialog(null, "Carga chica");
                        this.status2=true;
                    }else if((cargaKg<=10)&&(cargaKg>=6)){
                        JOptionPane.showMessageDialog(null, "Carga media");
                        this.status2=true;
                    }else if((cargaKg<=20)&&(cargaKg>=11)){
                        JOptionPane.showMessageDialog(null, "Carga grande");
                        this.status2=true;
                    }else if(cargaKg>20){
                        JOptionPane.showMessageDialog(null, "La cantidad de prendas sobrepasa el límite, ingresa una menor cantidad a 30 prendas");
                        this.status2=false;
                    }  
                    }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
        }
    }

    public void Apagar(){
        if(this.prendida==true){
            JOptionPane.showMessageDialog(null, "Lavadora apagada");
            this.prendida=false;
        }
    }
}
