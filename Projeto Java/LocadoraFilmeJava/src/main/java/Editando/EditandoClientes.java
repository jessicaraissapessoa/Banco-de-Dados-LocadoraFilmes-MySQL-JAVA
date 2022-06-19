package Editando;

import java.util.Scanner;
import ClientesDAO.ClientesDAO;
import Modelos.Clientes;

public class EditandoClientes {
	
	public static void main(String[] args) {
		
		ClientesDAO.mostrarClientes();
		
		Scanner sc = new Scanner(System.in);
		
		Clientes c1 = new Clientes();
		
		System.out.println("\nInforme o ID do cliente que você deseja editar o registro: ");
		int id = sc.nextInt();
		c1.setIdcliente(id);

			System.out.println("Informe o novo nome do cliente: ");
			sc.nextLine();
			String novonome = sc.nextLine();
			c1.setnomeCliente(novonome);

			System.out.println("Informe o novo Logradouro: ");
			String novolog = sc.nextLine();
			c1.setLogradouro(novolog);

			System.out.println("Informe o novo numero do logradouro: ");
			String novonumlog = sc.nextLine();
			c1.setNumLogradouro(novonumlog);

			System.out.println("Informe o bairro atual do cliente: ");
			String novobairro = sc.nextLine();
			c1.setBairro(novobairro);

			System.out.println("Informe a cidade atual do cliente: ");
			String novacid = sc.nextLine();
			c1.setCidade(novacid);

			System.out.println("Agora informe o estado atual do cliente: ");
			String novoest = sc.nextLine();
			c1.setEstado(novoest);

			ClientesDAO.editarClientes(c1);
			
			System.out.println("Cliente " + novonome + " editado com sucesso!\n");


	}
}

