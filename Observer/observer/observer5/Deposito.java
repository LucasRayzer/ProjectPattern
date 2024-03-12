package observer5;

import java.util.ArrayList;
import java.util.List;

public class Deposito {
    private int qtdadeAtual;
    private int qtdadeCritica;
    private int qtdadeMax;

    public int getQtdadeAtual() {
        return qtdadeAtual;
    }
    public void setQtdadeAtual(int qtdadeAtual) {
        this.qtdadeAtual = qtdadeAtual;
    }
    public int getQtdadeCritica() {
        return qtdadeCritica;
    }
    public void setQtdadeCritica(int qtdadeCritica) {
        this.qtdadeCritica = qtdadeCritica;
    }
    public int getQtdadeMax() {
        return qtdadeMax;
    }
    public void setQtdadeMax(int qtdadeMax) {
        this.qtdadeMax = qtdadeMax;
    }
    public Deposito( int qtdadeCritica, int qtdadeMax) {
        this.qtdadeCritica = qtdadeCritica;
        this.qtdadeMax = qtdadeMax;
    }

    public void add (int qtdade) throws Exception{        
        if(qtdadeAtual + qtdade > qtdadeMax){
            qtdadeAtual= qtdadeMax;
            throw new Exception("Error: Tentativa de amrazenar mais que o permitido");
        }
        this.qtdadeAtual = qtdade;
    }
    
    public int retirar(int qtdade){
        int temp = qtdade;
        if(qtdade > qtdadeAtual){
            qtdadeAtual=0;
            return temp=qtdadeAtual;
        }
        qtdadeAtual= qtdadeAtual-qtdade;
        return temp;
    }

    List<Observer> observer5 = new ArrayList<>();

    public void anexar(Observer obs) {
    	this.observer5.add(obs);
    }
    
    public void desanexar(Observer obs) {
    	this.observer5.remove(obs);
    }
    public void notificar(int add, int retirar, int qtdadeAtual) {
		for (Observer observador : observer5) {
			observador.consAdd(add);
			observador.consRetirar(retirar);
            observador.qtdadeAtual(qtdadeAtual);
		}
	}

}
