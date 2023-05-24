package yop.GetSet;

public class Principal {
    public static void main(String[] Args){
        Clase1 objeto=new Clase1();

        objeto.setEdad(18);
        System.out.println("La edad es: "+objeto.getEdad());
    
        objeto.setNombre("Fer");
        System.out.println("Nombre:"+objeto.getNombre());
    }
    

}
