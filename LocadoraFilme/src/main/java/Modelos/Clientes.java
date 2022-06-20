package Modelos;


public class Clientes {
	
	public int idcliente;
	public String NomeCliente;
	public String Logradouro;
	public String NumLogradouro;
	public String Bairro;
	public String Cidade;
	public String Estado;

	// Getters e Setters dos atributos do codigo
	public int getIdcliente() {
		return idcliente;
	}
	
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNomeCliente() {
		return NomeCliente;
	}

	public void setnomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}

	public String getLogradouro() {
		return Logradouro;
	}

	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}

	public String getNumLogradouro() {
		return NumLogradouro;
	}

	public void setNumLogradouro(String numLogradouro) {
		NumLogradouro = numLogradouro;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
}




