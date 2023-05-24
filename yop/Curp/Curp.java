package yop.Curp;
import java.util.Scanner;
public class Curp {
    //String texto="JIMENA";
    private String texto;
    String primerApellido="ESCALONA";
    String segundoApellido="LOPEZ";
    char[] vocales={'a','e','i','o','u'};
    int[] año={2,0,0,4};
    int[] mes={1,1};
    int[] dia={2,4};
    char genero='M';
    String QT="QT",PL="PL";
    Scanner entrada = new Scanner(System.in); // Creamos un objeto Scanner para leer las entradas del usuario

    
    
    public Curp(){

    }

    public String getNombre() {
        return texto;
    }
    
    // Setter para el atributo nombre
    public void setNombre(String texto) {
        this.texto = texto;
    }

    public void PrimerLetraPrimerApellido(){
        char primerLetra=primerApellido.charAt(0);
        //System.out.println("La primer letra del primer apellido: "+primerLetra);
        System.out.print(primerLetra);

    }

    public void PrimerVocalPrimerApellido(){
        for(int i=0;i<primerApellido.length();i++){
            char c=primerApellido.charAt(i);
            if(c==primerApellido.charAt(0)){
                c=primerApellido.charAt(1);
                if(Character.toLowerCase(c)==vocales[i]){
                    //System.out.println("La primer vocal es: "+c);
                    System.out.print(c);
                    return;
                }
            }else{
                for(int j=0;j<vocales.length;j++){
                    if(Character.toLowerCase(c)==vocales[j]){
                        //System.out.println("La primer vocal es: "+c);
                        System.out.print(c);
                        return;
                    }
                }
            }
            
        }
        System.out.println("No se encontraron vocales");
    }

    public void PrimerLetraSegundoApellido(){
        char primerLetra=segundoApellido.charAt(0);
        //System.out.println("La primer letra del segundo apellido: "+primerLetra);
        System.out.print(primerLetra);
    }
    
    public void PrimerLetraPrimerNombre(){
        char primerLetra=texto.charAt(0);
        //System.out.println("La primer letra del nombre: "+primerLetra);
        System.out.print(primerLetra);
    }

    public void FechaNacimiento(){
        int primernumero=año[2];
        int segundonumero=año[3];
        int tercero=mes[0];
        int cuarto=mes[1];
        int quinto=dia[0];
        int sexto=dia[1];
        String n1 = Integer.toString(primernumero);
        String n2 = Integer.toString(segundonumero);
        String n3 = Integer.toString(tercero);
        String n4 = Integer.toString(cuarto);
        String n5 = Integer.toString(quinto);
        String n6 = Integer.toString(sexto);
        //System.out.println("Fecha de nacimiento: "+primernumero+segundonumero+tercero+cuarto+quinto+sexto);
        System.out.print(n1+n2+n3+n4+n5+n6);

    }

    public void GeneroYEntidad(){
        //System.out.println("Genero: "+genero);
        //System.out.println("Entidad: "+QT);
        System.out.print(genero);
        System.out.print(QT);
    }

    public void SegundaConsonantePrimerApellidp(){
        char primerLetra=primerApellido.charAt(1);
        if(primerLetra=='A'){
        primerLetra=primerApellido.charAt(2);
        }else if(primerLetra=='E'){
        primerLetra=primerApellido.charAt(2);
        }else if(primerLetra=='I'){
        primerLetra=primerApellido.charAt(2);
        }else if(primerLetra=='O'){
        primerLetra=primerApellido.charAt(2);
        }else if(primerLetra=='U'){
        primerLetra=primerApellido.charAt(2);
        }else{
        primerLetra=primerApellido.charAt(1);
        }
        //System.out.println("La sig consonante del primer apellido: "+primerLetra);
        System.out.print(primerLetra);    
    }

    public void SegundaConsonanteSegundoApellido(){
        char primerLetra=segundoApellido.charAt(1);
        if(primerLetra=='A'){
        primerLetra=segundoApellido.charAt(2);
        }else if(primerLetra=='E'){
        primerLetra=segundoApellido.charAt(2);
        }else if(primerLetra=='I'){
        primerLetra=segundoApellido.charAt(2);
        }else if(primerLetra=='O'){
        primerLetra=segundoApellido.charAt(2);
        }else if(primerLetra=='U'){
        primerLetra=segundoApellido.charAt(2);
        }else{
        primerLetra=segundoApellido.charAt(1);
        }
        //System.out.println("La sig consonante del segundo apellido: "+primerLetra);
        System.out.print(primerLetra);        
    }

    public void SegundaConsonantePrimerNombre(){
        char primerLetra=texto.charAt(1);
        if(primerLetra=='A'){
        primerLetra=texto.charAt(2);
        }else if(primerLetra=='E'){
        primerLetra=texto.charAt(2);
        }else if(primerLetra=='I'){
        primerLetra=texto.charAt(2);
        }else if(primerLetra=='O'){
        primerLetra=texto.charAt(2);
        }else if(primerLetra=='U'){
        primerLetra=texto.charAt(2);
        }else{
        primerLetra=texto.charAt(1);
        }
        //System.out.println("La sig consonante del primer nombre: "+primerLetra);    
        System.out.print(primerLetra);    
    }
    

    public void PrimerVocal(){
        for(int i=0;i<texto.length();i++){
            char c=texto.charAt(i);
            for(int j=0;j<vocales.length;j++){
                if(Character.toLowerCase(c)==vocales[j]){
                    System.out.println("La primer vocal es: "+c);
                    return;
                }
            }
        }
        System.out.println("No se encontraron vocales");
    }
}
