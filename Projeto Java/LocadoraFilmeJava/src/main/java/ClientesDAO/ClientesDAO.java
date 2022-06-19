package ClientesDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexao.Conexao;
import Modelos.Clientes;

public class ClientesDAO {
	
	public static void main(String[] args) {
		mostrarClientes();
	}
	
	// Conexão
	static Conexao cl = new Conexao();
	static Connection conexao = Conexao.conectaDB();
	
	
	// Métodos para modificar no banco 
	//     V      V       V         V
	
	public static void criarCliente(Clientes cliente) {
		String sql = "INSERT INTO cliente (nomecliente, logradouro, numlogradouro, bairro, cidade, estado) VALUES (?, ?, ?, ?, ?, ?)";
		Connection conexao = null;
		PreparedStatement ps = null;
		
		try {
			// Criando conexão com o banco de dados.
			conexao = Conexao.conectaDB();
			
			ps = conexao.prepareStatement(sql);
			
			// Adicionando valores para query
			ps.setString(1, cliente.getNomeCliente());
			ps.setString(2, cliente.Logradouro);
			ps.setString(3, cliente.NumLogradouro);
			ps.setString(4, cliente.Bairro);
			ps.setString(5, cliente.Cidade);
			ps.setString(6, cliente.Estado);
			
			// Executando
			ps.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void mostrarClientes() {
		ResultSet cliente1;
		try {
			cliente1 = conexao.createStatement().executeQuery("SELECT * FROM cliente");
			while (cliente1.next()) {
				System.out.println(cliente1.getInt("idcliente") + " " + cliente1.getString("nomecliente"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void editarClientes(Clientes cliente) {
		
		String sql = "UPDATE cliente SET nomecliente = ?, logradouro = ?, numlogradouro = ?, bairro = ?, cidade = ?, estado = ? WHERE idcliente = ?";
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			// Criando conexão com o banco
			con = Conexao.conectaDB();
			
			// Criando a classe pra executar a linha do mySQL
			ps = con.prepareStatement(sql);
			
			//Adicionando valores pra editar no banco
			ps.setString(1, cliente.getNomeCliente());
			ps.setString(2, cliente.getLogradouro());
			ps.setString(3, cliente.getNumLogradouro());
			ps.setString(4, cliente.getBairro());
			ps.setString(5, cliente.getCidade());
			ps.setString(6, cliente.getEstado());
			
			// Qual é o ID do cliente que será editado
			ps.setInt(7, cliente.getIdcliente());
			
			ps.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public static void deletarClientes(int idCliente) {
		
		String sql = "DELETE FROM cliente WHERE idcliente = ?";	
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = Conexao.conectaDB();
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, idCliente);
			
			ps.execute();
			}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
}


