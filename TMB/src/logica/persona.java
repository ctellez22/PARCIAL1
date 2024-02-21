package logica;

public abstract class persona {



	protected double peso;
	protected int edad;
	protected double alturaCm;

	
	
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public double getAlturaCm() {
		return alturaCm;
	}

	public void setAlturaCm(double alturaCm) {
		this.alturaCm = alturaCm;
	}
	
	
	public double getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad =  edad;
	}
	

	public persona(double alturaCm, double peso, int edad) {
		this.peso = peso;
		this.alturaCm = alturaCm;
		this.edad= edad;
	}
	
	public abstract double calcularTMB();
	
}
