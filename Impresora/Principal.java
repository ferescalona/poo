//Escalona_Lopez_Maria_Fernanda Expediente: 315269
package Impresora;

public class Principal {
    public static void main(String[] Args){
        impre impresora=new impre();

        impresora.Encender();
        impresora.SeleccionarArchivo();
        impresora.SeleccionarImpresora();
        impresora.NumCopias();
        impresora.Tinta();
        impresora.Orientación();
        impresora.Imprimiendo();
        impresora.Apagar();
    }
    
}
