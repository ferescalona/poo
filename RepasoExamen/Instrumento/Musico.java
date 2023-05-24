package RepasoExamen.Instrumento;
import javax.swing.JOptionPane;

public class Musico {
    String nombre;
    int edad, aniosExperiencia;
    double eficaciaAlTocar;
    boolean status,tocarInstrumento;

    public Musico(){
    //public Musico(String nombre,int edad, int aniosExperiencia,double eficaciaAlTocar){
    }

    public void DatosMusico(){
        String nombre=JOptionPane.showInputDialog("Nombre: ");
        String e=JOptionPane.showInputDialog("Edad: ");
        int edad=Integer.parseInt(e);
        String anios=JOptionPane.showInputDialog("Años de experiencia: ");
        int aniosExperiencia=Integer.parseInt(anios);
        String eficacia=JOptionPane.showInputDialog("Eficacia al tocar (del 1 al 10): ");
        int eficaciaAlTocar=Integer.parseInt(eficacia);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Años de experiencia: "+aniosExperiencia);
        System.out.println("Eficacia: "+eficaciaAlTocar);
        }

        public void TocarInstrumento(InstrumentoDeViento instrumento){
            instrumento.Tocar();
            tocarInstrumento=true;
            instrumento.ocupado=true;

        }

        public void AfinarInstrumento(InstrumentoDeViento instrumento)throws InterruptedException{
            instrumento.Afinar();
        }

        public void DejarInstrumento(InstrumentoDeViento instrumennto){
            tocarInstrumento=false;
            instrumennto.ocupado=false;
            System.out.println("Instrumento desocupado");

        }
    }
