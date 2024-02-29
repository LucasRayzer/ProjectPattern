package ObserverX;

import java.util.ArrayList;
import java.util.List;

public class Observada {
    
    //2.Criar uma lista de observer
    private List<Observer> obss;
    
    //3. inicializar a lista 
    public Observada(){
        this.obss = new ArrayList<Observer>();
    }
    
    //4. criar um método para anexar observadores
    public void anexar (Observer obs){
        this.obss.add(obs);
    }

    private int a ;

    public void setA (int a){
        this.a = a;
        //5. Sempre que muda o estado devo notificar observadores
        notificar(); 
    }

    //6. implementar a notificação
    public void notificar (){
       for (Observer observer : obss) {
           observer.mudouA(a);
       } 
    }
}
