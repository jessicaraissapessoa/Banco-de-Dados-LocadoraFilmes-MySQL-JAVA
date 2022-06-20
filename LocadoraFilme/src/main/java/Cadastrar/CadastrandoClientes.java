package Cadastrar;

import java.util.Scanner;

import ClientesDAO.ClientesDAO;
import Modelos.Clientes;

public class CadastrandoClientes {

	public static void main(String[] args) {
		
		// CADASTRAR CLIENTES
		Scanner sc = new Scanner(System.in);
		
		Clientes cliente = new Clientes();
		
		System.out.println("Insira o nome do cliente: ");
		String nome = sc.nextLine();
		cliente.setnomeCliente(nome);
		
		System.out.println("Insira o Logradouro do cliente: ");
		String logradouro = sc.nextLine();
		cliente.setLogradouro(logradouro);
		
		System.out.println("Insira o numero do logradouro: ");
		String NumLogradouro = sc.nextLine();
		cliente.setNumLogradouro(NumLogradouro);
		
		System.out.println("Insira o bairro onde o cliente reside: ");
		String bairro = sc.nextLine();
		cliente.setBairro(bairro);
		
		System.out.println("Insira a cidade onde o cliente reside: ");
		String cidade = sc.nextLine();
		cliente.setCidade(cidade);
		
		System.out.println("Insira o estado onde o cliente reside: ");
		String estado = sc.nextLine();
		cliente.setEstado(estado);
		
		ClientesDAO.criarCliente(cliente);
		
		System.out.println("Cliente " + nome + " Cadastrado com sucesso!\n");

	}

}
