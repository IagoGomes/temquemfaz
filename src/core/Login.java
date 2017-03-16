package core;

/**
 * Classe que valida um login de usuário no sistema.
 * Assim, implementa todos os protocolos de segurança adotados na plataforma 
 *   para validação de usuários
 */
public class Login {

	private String nickname;

	private String senha;

	private Usuario usuario;

	/**
	 *  Método que valida o acesso de um usuário
         * @param nickname : String
         * @param senha : String
         * @return boolean
	 */
	public boolean validar(String nickname, String senha) {
		return false;
	}

}
