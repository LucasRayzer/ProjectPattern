package observer4;

public class Artigo {

    private String titulo;

    public Artigo(String titulo) {
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    @Override
    public String toString() {
        
        return titulo;
    }
}
