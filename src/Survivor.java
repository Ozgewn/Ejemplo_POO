import java.util.*;

public class Survivor {
	
	//Atributos
	int vidas, estadoSalud;
	String objetoActual;
	boolean infectado;
	
	private static Scanner teclado=new Scanner(System.in);
	
	public Survivor(String objetoActual) {
		
		vidas=3;
		estadoSalud=2; //0=tumbado, 1=herido, 2=saludable
		this.objetoActual=objetoActual;
		infectado=false;
		
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
		
		switch(objetoActual) {
		case "Caja de herramientas","caja de herramientas":
			this.objetoActual=objetoActual;
			System.out.println("Tu objeto actual es una caja de herramientas");
			break;
		case "Botiquin","Botiquín","botiquin","botiquín":
			this.objetoActual=objetoActual;
			System.out.println("Tu objeto actual es un botiquín");
			break;
		case "Llave","llave":
			this.objetoActual=objetoActual;
			System.out.println("Tu objeto actual es una llave");
			break;
		case "Linterna","linterna":
			this.objetoActual=objetoActual;
			System.out.println("Tu objeto actual es una linterna");
			break;
		default:
			System.out.println("El objeto introducido no es válido, por favor intentelo de nuevo");
			objetoActual=teclado.next();
			establecerObjeto(objetoActual);
			break;
		} //FIN SWITCH
		
		/*if(objetoActual.equalsIgnoreCase("Caja de herramientas")) {
			this.objetoActual=objetoActual;
			System.out.println("Tu objeto actual es una caja de herramientas");
		}else if(objetoActual.equalsIgnoreCase("Botiquin") || objetoActual.equalsIgnoreCase("Botiquín")) {
			this.objetoActual=objetoActual;
			System.out.println("Tu objeto actual es un Botiquín");
		}else if(objetoActual.equalsIgnoreCase("Llave")) {
			this.objetoActual=objetoActual;
			System.out.println("Tu objeto actual es una llave");
		}else if(objetoActual.equalsIgnoreCase("Linterna")) {
			this.objetoActual=objetoActual;
			System.out.println("Tu objeto actual es una linterna");
		} */
	} //FIN METODO establecerObjeto()
	
	public void esInfectado() {
		if(infectado) {
			System.out.println("El jugador está infectado");
		}else {
			System.out.println("El jugador no está infectado");
		} //FIN IF_ELSE
	} //FIN esInfectado()
	
	public void curarse() {
		if(estadoSalud<2 && estadoSalud>=0) {
			estadoSalud++;
		}else {
			System.out.println("No necesitas curarte, estás herido");
		} //FIN IF_ELSE
	} //FIN METODO curarse()

} //FIN CLASE
