package Mostrar;
import ClientesDAO.ClientesDAO;

public class MostrarClientes {

	public static void main(String[] args) {
		System.out.println("Aqui constam os clientes cadastrados em banco atualmente: \n");
		ClientesDAO.mostrarClientes();
		System.out.println("\n");
		
	}

}
