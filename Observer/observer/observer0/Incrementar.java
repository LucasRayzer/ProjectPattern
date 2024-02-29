package observer0;

import java.util.ArrayList;
import java.util.List;

public class Incrementar {


	//singleton
	// incializando observador
	private Incrementar() {
		this.obss = new ArrayList<>();

	}

	private static Incrementar instancia;
	
	public static Incrementar getInstancia() {
		if (instancia == null)
			instancia = new Incrementar();
		
		return instancia;
	}

	//observer

	private List<Observer> obss;

	// criar um método para anexar observadores
    public void anexar (Observer obs){
        this.obss.add(obs);
    }

	public void notificar (){
        for (Observer observer : obss) {
			observer.mudouConta(conta);
		}
    }
	//metodos de negócio

	private int conta;
	
	public int getConta() {
		return conta;
	}

	public void inc() {
		conta++;
		notificar();
	}

}
