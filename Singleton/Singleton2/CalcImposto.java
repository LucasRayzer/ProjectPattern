package singleton2;

public class CalcImposto {
	private CalcImposto() {
	}

	private static CalcImposto instancia;
	
	public static CalcImposto getInstancia() {
		if (instancia == null)
			instancia = new CalcImposto();
		
		return instancia;
	}

	private float aliquota;
	
	public float getAliquota() {
		return aliquota;
	}
	
	public void setAliquota(float aliquota) {
		this.aliquota = aliquota;
	}
	
	public float calcImposto(float valor) {
		return valor * aliquota / 100;
	}
	
}
