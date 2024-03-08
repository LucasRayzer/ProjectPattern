package observer3.dispositivos;

import observer3.estacao.Observador;

public class DispositivoConsole implements Observador {

    @Override
    public void atualizar(double temp, double umid) {
        System.out.println("temp"+ temp +" /n"+ "umid"+ umid);
    }

    
}
