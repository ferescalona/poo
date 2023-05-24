package Examen;

public class Mouse {
    int dpi;
    double anchura,altura;
    boolean ruedas;
    String tipoDeLector,tipoDeConexion;

    public Mouse(double anchura,double altura){
        this.tipoDeConexion=tipoDeConexion;
        this.tipoDeLector=tipoDeLector;
    }

    public void Mover(){
        System.out.println("Derecha");
        System.out.println("Izquierda");
        System.out.println("Arriba");
        System.out.println("Abajo");
    }

    public double getAnchura() {
        return anchura;
    }
    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public boolean isRuedas() {
        return ruedas;
    }
    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }
    public String getTipoDeLector() {
        return tipoDeLector;
    }
    public void setTipoDeLector(String tipoDeLector) {
        this.tipoDeLector = tipoDeLector;
    }
    public String getTipoDeConexion() {
        return tipoDeConexion;
    }
    public void setTipoDeConexion(String tipoDeConexion) {
        this.tipoDeConexion = tipoDeConexion;
    }
    
}
