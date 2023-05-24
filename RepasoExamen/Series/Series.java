package RepasoExamen.Series;

public class Series {
    String titulo,genero,creador;
    int numTemporadas=3;
    boolean entregado=false;

    public Series(){

    }

    public Series(String titulo,String creador){
        this.titulo=titulo;
        this.creador=creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    
}
