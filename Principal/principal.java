//Escalona_Lopez_Maria_Fernanda Expediente: 315269
package Principal;
import javax.swing.JOptionPane;


public class principal {
    public static void main(String[]Args) throws InterruptedException{
        String obj=JOptionPane.showInputDialog("Elije el objeto a utilizar\n1.-Celular\n2.-Caminadora\n3.-Impresora\n4.-Taladro\n5.-Lavadora");
            switch(obj){
                case "1":
                celu celular=new celu();
                celular.Encender();
                celular.Funciones();
                celular.MandarMensajes();
                celular.HacerLlamadas();
                break;
    
                case "2":
                caminadora caminadora=new caminadora();
                caminadora.Encender();
                caminadora.Inclinación();
                caminadora.Velocidad();
                caminadora.Tiempo();
                caminadora.Apagar();
                break;
    
                case "3":
                impre impresora=new impre();
                impresora.Encender();
                impresora.SeleccionarArchivo();
                impresora.SeleccionarImpresora();
                impresora.NumCopias();
                impresora.Tinta();
                impresora.Orientación();
                impresora.Imprimiendo();
                impresora.Apagar();
                break;
    
                case "4":
                taladro taladro=new taladro();
                taladro.Encender();
                taladro.TamañoBroca();
                taladro.LuzLed();
                taladro.Velocidad();
                taladro.SentidoGiro();
                taladro.Funcionamiento();
                taladro.Apagar();
                break;
    
                case "5":
                lava lavadora=new lava();
                lavadora.Encender();
                lavadora.SeleccionarCarga();
                lavadora.Temp();
                lavadora.EnjuagueAdicional(); 
                lavadora.TipoRopa();
                lavadora.Velocidad();
                lavadora.Ciclo();
                lavadora.Apagar();
                break;
    
                default:
                JOptionPane.showMessageDialog(null, "No es una opción válida");
                break;
            
        }
        
    }
}
