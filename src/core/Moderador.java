package core;

import java.util.Collection;

/**
 *
 * Esta classe reúne as funções do moderador do sistema.
 * Cabe ao moderador reber uma lista de denúncias  (de usuário ou anúncios) e 
 * fazer a respectiva análise. Caso o objeto denunciado esteja indo contra
 * as políticas da plataforma, o moderador pode removê-lo.
 * 
 */
public class Moderador extends Usuario {

	private Collection<Denuncia> denuncia;

	
	/**
	 * Metodo responsável pela análise da denúncia 
	 * @param denuncia : Denuncia
	 */
	public void moderarDenuncia(Denuncia denuncia) {

	}

	/**
	 * Método responsável pela remoção de um anúncio
	 * que foi denunciado
  	 * @param anuncio : Anuncio
	 */
	public void excluirAnuncio(Anuncio anuncio) {

	}

	/**
	 *  Método responsável pela remoção de um usuário
	 * que foi denunciado
   	 * @param usuario : Usuario
	 */
	public void excluirUsuario(Usuario usuario) {

	}

}
