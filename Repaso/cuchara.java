package Repaso;

public class cuchara {
    private double tamaño=0.0, capacidadV=0.0;
    String material="", color="";
    public cuchara(){ //genera un objeto vacío

    }

    public cuchara(String material){
        this.material=material;
    }

    public cuchara(String material,double tamaño,double capacidadV, String color){
        this.material=material;
        this.tamaño=tamaño;
        this.capacidadV=capacidadV;
        this.color=color;


    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getCapacidadV() {
        return capacidadV;
    }

    public void setCapacidadV(double capacidadV) {
        this.capacidadV = capacidadV;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //métodos de funcionamiento
    

}
