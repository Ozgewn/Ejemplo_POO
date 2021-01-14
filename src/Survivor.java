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
	
public Survivor() {
		
		vidas=3;
		estadoSalud=2; //0=tumbado, 1=herido, 2=saludable
		objetoActual="Linterna";
		infectado=false;
		
	} //FIN METODO CONSTRUCTOR
	
	//METODOS
	
	public int getVida() {
		return vidas;
	} //FIN METODO mostrarVida()
	
	public String getEstadoSalud() {
		if(estadoSalud==2) {
			return "El jugador está saludable";
		}else if(estadoSalud==1) {
			return "El jugador está herido";
		}else {
			return "El jugador está tumbado";
		} //FIN IF_ELSE
	} //FIN METODO mostrarEstadoSalud()
	
	public void setEstadoSalud(int estadoSalud) {
		if(estadoSalud<0 || estadoSalud>2) {
			System.out.println("Estado de salud introducido no válido, por favor vuelva a intentarlo");
			estadoSalud=teclado.nextInt();
			setEstadoSalud(estadoSalud);
		}else {
			this.estadoSalud=estadoSalud;
		} //FIN IF_ELSE
	} //FIN METODO establecerEstadoSalud
	
	public void setObjeto(String objetoActual) {
		
		switch(objetoActual) {
		case "Caja de herramientas","caja de herramientas":
			this.objetoActual=objetoActual;
			break;
		case "Botiquin","Botiquín","botiquin","botiquín":
			this.objetoActual=objetoActual;
			break;
		case "Llave","llave":
			this.objetoActual=objetoActual;
			break;
		case "Linterna","linterna":
			this.objetoActual=objetoActual;
			break;
		default:
			this.objetoActual="Nada";
			break;
		} //FIN SWITCH
		
	} //FIN METODO establecerObjeto()
	
	public String getObjeto() {
		
		if(!objetoActual.equalsIgnoreCase("Nada")) {
			return objetoActual;
		}else {
			return "No tienes ningún objeto";
		} //FIN IF_ELSE
		
	}//FIN METODO getObjeto()
	
	public String isInfectado(boolean infectado) {
		if(infectado) {
			return "El jugador está infectado";
		}else {
			return "El jugador no está infectado";
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
