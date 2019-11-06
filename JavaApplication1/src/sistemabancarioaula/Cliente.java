package sistemabancarioaula;

/**
 * Classe {@link Cliente} que representa um cliente real do banco.
 * @author Gustavo Farias
 */
public class Cliente {

	 int id;
	
	 String nome;
	
	 int idade;
	
	 String email;
	
	 boolean ativo;
	
	 int idContaCorrente;

	public Cliente(int id, String nome, int idade, String email, int idContaCorrente, boolean ativo) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.idContaCorrente = idContaCorrente;
		this.ativo = ativo;
	}

	/**
	 * M�todo que retorna o ID do cliente. 
	 * @return ID do cliente
	 */
	public int getId() {
		return id;
	}

	/**
	 * Método que atualiza o ID do cliente. 
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Método que retorna o nome do cliente. 
	 * @return nome do cliente
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * M�todo que atualiza o nome do cliente. 
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * M�todo que retorna a idade do cliente. 
	 * @return idade do cliente
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * M�todo que atualiza a idade do cliente. 
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/**
	 * M�todo que retorna o email do cliente. 
	 * @return email do cliente
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * M�todo que atualiza o email do cliente. 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * M�todo que retorna o status (Ativo ou Inativo) do cliente. 
	 * @return status do cliente
	 */
	public boolean isAtivo() {
		return ativo;
	}

	/**
	 * M�todo que atualiza o status do cliente. 
	 */
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	/**
	 * Método que retorna o ID da conta corrente associada ao cliente. 
	 * @return ID da conta corrente associada ao cliente
	 */
	public int getIdContaCorrente() {
		return this.idContaCorrente;
	}

	/**
	 * Método que atualiza o ID da conta corrente associada ao cliente. 
	 */
	public void setIdContaCorrente(int idContaCorrente) {
		this.idContaCorrente = idContaCorrente;
	}
	
	/**
	 * Método que retorna a representa��o textual de um cliente. 
	 * @return representa��o textual de um cliente
	 */
	@Override
	public String toString() {
		
		String str ="=========================" 
					+"Id: " + this.id + "\n"
					+ "Nome: " + this.nome + "\n"
					+ "Email: " + this.email + "\n"
					+ "Idade: " + this.idade + "\n"
					+ "Status: " + (ativo?"Ativo":"Inativo") + "\n"
					+ "=========================";
		return str;
	}
	
}
