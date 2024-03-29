package observer3.dispositivos;

import javax.swing.JFrame;
import javax.swing.JLabel;

import observer3.estacao.Observador;

public class DispositivoWindow extends JFrame implements Observador{

	private static final long serialVersionUID = 1L;

	private JLabel jlTemp;
	private JLabel jlUmidade;

	public DispositivoWindow() {
		
		
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jlTemp = new JLabel("Temp:");
		getContentPane().add(jlTemp, "North");
		
		jlUmidade = new JLabel("Umidade:");
		getContentPane().add(jlUmidade, "South");
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}


	@Override
	public void atualizar(double temp, double umid) {
		jlTemp.setText("Temperatura"+temp);
		jlUmidade.setText("Umidade"+umid);
	}

	

	

}
