package core;

import java.util.Collection;

/**
 *Classe que representa o usuário 
 */
public class Usuario {

	private String nome;

	private String nickname;

	private Date dataNascimento;

	private String senha;

	private char sexo;

	private Date dataCadastro;

	private String telefone;

	private String email;

	private Login login;

	private Collection<Anuncio> anuncio;

	private Collection<Pergunta> pergunta;

	private Collection<Denuncia> denuncia;

	private Collection<Contrato> contrato;

	private Collection<Endereco> endereco;

	private Anunciante anunciante;

	private Collection<Cartao> cartao;


	/**
	 * Método que adiciona o endereço do usuário
	 * @param endereco : Endereco
	 */
	public void adicionarEndereco(Endereco endereco) {

	}

	/**
	 *  Método que carrega do banco de dados todos os contratos do usuário.
	 */ 
	public void carregarContratos() {

	}

	/**
	 *  Método que notifica o usuário sobre um novo contrato
	 * @param contrato: Contrato
	 */ 
  	public void notificarUsuario(Contrato contrato) {

	}

}
