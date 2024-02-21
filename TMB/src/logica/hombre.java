package logica;




public class hombre extends persona{
	
	
	
	
	public hombre(double alturaCm, double peso, int edad) {
		super( alturaCm, peso, edad);
	}

	@Override
	public double calcularTMB() {
		// TODO Auto-generated method stub
		
		return 88.362 + (13.397 * this.peso) + (4.799 * this.alturaCm) - (5.677 * this.edad);
	}
	
	

}
