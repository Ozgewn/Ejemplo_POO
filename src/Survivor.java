import java.util.*;

public class Survivor {
	
	//Atributos
	int vidas, estadoSalud;
	String objetoActual;
	
	private static Scanner teclado=new Scanner(System.in);
	
	public Survivor(String objetoActual) {
		
		vidas=3;
		estadoSalud=2; //0=tumbado, 1=herido, 2=saludable
		this.objetoActual=objetoActual;
		
	} //FIN METODO CONSTRUCTOR
	
	//METODOS
	
	public void mostrarVida() {
		System.out.println("Al jugador le quedan " +vidas+ " vidas(cuelgues)");
	} //FIN METODO mostrarVida()
	
	public void mostrarEstadoSalud() {
		if(estadoSalud==2) {
			System.out.println("El jugador está saludable");
		}else if(estadoSalud==1) {
			System.out.println("El jugador está herido");
		}else {
			System.out.println("El jugador está tumbado");
		} //FIN IF_ELSE
	} //FIN METODO mostrarEstadoSalud()
	
	public void establecerEstadoSalud(int estadoSalud) {
		if(estadoSalud<0 || estadoSalud>2) {
			System.out.println("Estado de salud introducido no válido, por favor vuelva a intentarlo");
			estadoSalud=teclado.nextInt();
			establecerEstadoSalud(estadoSalud);
		}else {
			this.estadoSalud=estadoSalud;
		} //FIN IF_ELSE
	} //FIN METODO establecerEstadoSalud
	
	public void establecerObjeto(String objetoActual) {
		if(objetoActual.equalsIgnoreCase("Caja de herramientas")) {
			this.objetoActual=objetoActual;
			System.out.println("Tu objeto actual es una caja de herramientas");
		}else if(objetoActual.equalsIgnoreCase("Botiquin") || objetoActual.equalsIgnoreCase("Botiquín")) {
			this.objetoActual=objetoActual;
			System.out.println("Tu objeto actual es un Botiquín");
		}
	}

} //FIN CLASE
