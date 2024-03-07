package observer3.estacao;

import java.util.ArrayList;
import java.util.List;

import observer3.sensores.SensorTemperatura;
import observer3.sensores.SensorUmidade;

public class EstacaoMeteorologica {
	
	private SensorTemperatura sensorTemp;
	private SensorUmidade sensorUmidade;


	public SensorTemperatura getSensorTemp() {
		return sensorTemp;
	}
	
	public void setSensorTemp(SensorTemperatura sensorTemp) {
		this.sensorTemp = sensorTemp;
	}
	
	public SensorUmidade getSensorUmidade() {
		return sensorUmidade;
	}
	
	public void setSensorUmidade(SensorUmidade sensorUmidade) {
		this.sensorUmidade = sensorUmidade;
	}

	public double getTemperatura() {
		return temp;
	}

	public double getUmidade() {
		return umid;
	}
	
	private double umid;
	private double temp;

	public void ligar() {
		Thread t = new Thread() {
			
			@Override
			public void run() {
				while (true) {
					temp = sensorTemp.getMedicao();
					umid = sensorUmidade.getMedicao();
					
					notificar(temp, umid);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
			
		};
		t.start();
	}
	//inicializando o observer
	private List<Observador> obs = new ArrayList<>();
	
	//criar metodo de anexar
	public void anexar (Observador obs){
        this.obs.add(obs);
    }

	public void notificar(double temp, double umid) {
		for (Observador observador : obs) {
			observador.atualizar(temp, umid);
			
		}
	}
	


}
