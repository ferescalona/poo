package Licuadora;

public class principal {
    public static void main(String[]Args){
        licuadora oster=new licuadora(500,"Oster","negra",6,0);
        oster.Encender();
        oster.isEmpty();
        oster.Lllenar();
        oster.Girar();
        //oster.setVelAcual(5);
        //System.out.println("La velocidad actual es: "+oster.getVelAcual());
        oster.cambiarVel();
        oster.Apagar();
    }
}
/*vaciar

isEmpty( )

Llenar( )

Girar( )

cambiarVel( )*/