package presentacion;
import logica.persona;
import logica.mujer;
import logica.hombre;

public class presentacion {
	
	public static void main(String[] args) {
		persona p;
		
		p= new hombre(180,75,18);
		System.out.println("TMB hombre: "+p.calcularTMB());
		
		p= new mujer(160,60,17);
		System.out.println("TMB mujer: "+ p.calcularTMB());
		
	}

}

