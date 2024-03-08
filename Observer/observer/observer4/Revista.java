package observer4;

import java.util.ArrayList;
import java.util.List;

public class Revista {

    private String nome;

    List<Edicao> edicoes = new ArrayList<>();

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void lancarNovaEdicao(Edicao edicao){
        edicoes.add(edicao);
        for (Observador obs : observer) {
            obs.lancouEdicao(this, edicao);
        }
    }

    public Revista(String nome) {
        this.nome = nome;
        
    }

    List<Observador> observer = new ArrayList<>();

    public void anexar(Observador obs) {
    	this.observer.add(obs);
    }
    
    public void desanexar(Observador obs) {
    	this.observer.remove(obs);
    }

    
    
}
