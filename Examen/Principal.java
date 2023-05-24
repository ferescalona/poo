package Examen;

import Examen.Electrodomesticos.Lavadora;
import Examen.Electrodomesticos.Television;
import Lavadora.lava;

public class Principal {
    public static void main(String[]Args){
        /*Mouse mouse=new Mouse(12.0,5.0);
        mouse.setTipoDeConexion("Bluethoot");
        mouse.getTipoDeConexion();
        mouse.Mover();*/
        Television tele=new Television();
        Television tele2=new Television(10000,3);
        Television tele3=new Television(10000,3,2.0,3.0,"Negra","1800x600px");
        
        Lavadora lavadora=new Lavadora();
        Lavadora lava2=new Lavadora(50000,10);
        Lavadora lava3=new Lavadora(50000,10,10,3.0,3.0,"Gris");

        tele.Prender();
        tele.CambiarCanal();
        tele.Caracteristicas();
        tele.Precio();
        

        
        lavadora.Caracteristicas();
        lavadora.Precio();
        lavadora.Prender();
        lavadora.Lavar();        
        lavadora.Apagar();
    }
}
