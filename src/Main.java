
public class Main {

	public static void main(String[] args) {
		
		Survivor survi=new Survivor("Botiquín");
		survi.mostrarEstadoSalud();
		survi.mostrarVida();
		survi.establecerEstadoSalud(7);
		survi.establecerEstadoSalud(1);
		survi.establecerObjeto("Caja de herramientas");
		survi.mostrarEstadoSalud();
		survi.establecerObjeto("asdasd");

	} //FIN MAIN

} //FIN CLASE
