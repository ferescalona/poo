package RepasoExamen;
import javax.swing.JOptionPane;
import RepasoExamen.Figuras.Cuadrado;
import RepasoExamen.Figuras.Hexagono;
import RepasoExamen.Figuras.Pentagono;
import RepasoExamen.Figuras.Triangulo;
import RepasoExamen.Instrumento.InstrumentoDeViento;
import RepasoExamen.Instrumento.Musico;
import RepasoExamen.Series.Series;

public class Principal {
    public static void main(String[]Args) throws InterruptedException{
        String opcion=JOptionPane.showInputDialog("1. Figuras 2D\n2. Instrumento y Músico\n3. Ciudadano\n4. Series");
        int numero = Integer.parseInt(opcion);
        switch(numero){
            case 1:
            String opc=JOptionPane.showInputDialog("1. Triangulo\n2. Cuadrado\n3. Hexagono\n4. Pentágono");
            int number = Integer.parseInt(opc);
                switch(number){
                case 1:
                Triangulo t1=new Triangulo();
                t1.Tri();
                t1.CalcularPerimetro();
                t1.CalcularArea();
                t1.MostrarInformacion();
                break;
                
                case 2:
                Cuadrado c1=new Cuadrado();
                c1.CalcularPerimetro();
                c1.CalcularArea();
                c1.MostrarInformacion();
                break;

                case 3:
                Hexagono h1=new Hexagono();
                h1.hex();
                h1.CalcularPerimetro();
                h1.CalcularArea();
                h1.MostrarInformacion();
                break;

                case 4:
                Pentagono p1=new Pentagono();
                p1.pe();
                p1.CalcularPerimetro();
                p1.CalcularArea();
                p1.MostrarInformacion();
                break;

                default:
                JOptionPane.showMessageDialog(null, "No es una opción válida");
                break;
                }
            break;

            case 2:
            InstrumentoDeViento guitarra=new InstrumentoDeViento(1.5,0.4,6);
            Musico musico=new Musico();
            musico.DatosMusico();
            musico.AfinarInstrumento(guitarra);
            musico.TocarInstrumento(guitarra);
            musico.DejarInstrumento(guitarra);

            case 3:
            break;

            case 4:
            Series serie=new Series();
            
            break;
            }
    }
}
