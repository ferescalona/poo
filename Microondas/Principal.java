package Microondas;

public class Principal {
    public static void main(String[] args) throws
InterruptedException{
    //crear microondas
    //micro objeto1 = new micro();
    micro objeto2 = new micro("DJ700","Negro","Medium",100,0,3600,1300,false);
    objeto2.Apagar();
    objeto2.Prender();
    objeto2.Calentar(0);
    objeto2.InsertarTiempo();
}
}
