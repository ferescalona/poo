package RepasoExamen.Figuras;

public abstract class Figura2d {
    int numLados;
    double area,perimetro;

    public Figura2d(){

    }
    public abstract void CalcularArea();
    public abstract void CalcularPerimetro();
    public abstract void MostrarInformacion();

}
