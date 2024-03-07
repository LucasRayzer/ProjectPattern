package observer4;

import java.util.ArrayList;
import java.util.List;

public class Edicao {

    private int numero;

    private List<Artigo> artigos = new ArrayList<>();

    public Edicao(int numero) {
        this.numero = numero;
      
    }

    public void adicionarArtigo(Artigo artigo) {
        artigos.add(artigo);
    }

    public void setNumero(int numero){
        this.numero=numero;
    }
    public int getNumero() {
        return numero;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }
}
