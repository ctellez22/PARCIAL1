package logica;


public class mujer extends persona{
	
	
	
	
	public mujer(double alturaCm, double peso, int edad) {
		super( alturaCm, peso, edad);
	}

	
	
	
	@Override
	public double calcularTMB() {
		
		return 447.593 + (9.247 * this.peso) + (3.098 * this.alturaCm) - (4.33 * this.edad);
	}
}
	




