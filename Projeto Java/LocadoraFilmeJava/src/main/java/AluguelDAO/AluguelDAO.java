package AluguelDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import Conexao.Conexao;
import Modelos.Aluguel;

public class AluguelDAO {
	
	// Conexão
	static Conexao cl = new Conexao();
	static Connection conexao = Conexao.conectaDB();
	
	public static void main(String[] args) {
		mostrarAluguel();
	}

	public static void cadastrarAluguel(Aluguel aluguel) {

		String sql = "INSERT INTO aluguel (idcliente, idfilme) VALUES (?, ?)";
		Connection con = null;
		PreparedStatement ps = null;

		try {

			con = Conexao.conectaDB();

			ps = conexao.prepareStatement(sql);

			ps.setInt(1, aluguel.getIdCl());
			ps.setInt(2, aluguel.getIdFilm());

			ps.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void mostrarAluguel() {

		ResultSet aluguel1;
		try {
			aluguel1 = conexao.createStatement().executeQuery("SELECT * FROM aluguel");
			while (aluguel1.next()) {
				System.out.println(aluguel1.getInt("idaluguel") + " - " + "ID cliente: " + aluguel1.getInt("idcliente") + ", ID Filme: " + aluguel1.getInt("idfilme") + ", Data: " 
				+ aluguel1.getDate("dataaluguel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void editarAluguel(Aluguel aluguel) {
		
		String sql = "UPDATE aluguel SET idcliente = ?, idfilme = ? WHERE idaluguel = ?";
		
		Connection con = null;
		
		PreparedStatement ps = null;
		
		try {
			con = Conexao.conectaDB();
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, aluguel.getIdCl());
			ps.setInt(2, aluguel.getIdFilm());
			
			ps.setInt(3, aluguel.getIdaluguel());
			
			ps.execute();
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void apagarAluguel(int idAluguel) {
		
		String sql = "DELETE FROM aluguel WHERE idaluguel = ?";
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			con = Conexao.conectaDB();
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, idAluguel);
			
			ps.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
