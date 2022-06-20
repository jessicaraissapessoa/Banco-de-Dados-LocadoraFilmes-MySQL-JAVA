package Deletando;

import java.util.Scanner;
import ClientesDAO.ClientesDAO;

public class DeletandoClientes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ClientesDAO.mostrarClientes();
		
		System.out.println("Selecione o ID do cliente que você deseja DELETAR do banco de dados (Por números): ");
		int idDel = sc.nextInt();
		
		ClientesDAO.deletarClientes(idDel);
		
		System.out.println("Cliente apagado com sucesso!\n");
	}

}
