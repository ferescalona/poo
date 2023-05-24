package Repaso;

public class Principal {
    public static void main(String[]Args){
        cuchara stainless=new cuchara("Madera",10.5,3,"cafe");
        stainless.setColor("dorado");
        stainless.setMaterial("oro");
        System.out.println(stainless.getCapacidadV());
        System.out.println(stainless.color);
        System.out.println(stainless.material);
        System.out.println(stainless.getTamaño());
    }
}
