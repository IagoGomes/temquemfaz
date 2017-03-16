package core;

/**
 * Esta classe organiza a interação entre cliente e anuncio, em que 
 *   o cliente faz perguntas ao anunciante sobre determinado serviço 
 *   prestado.
 * Assim, a classe armazena a pergunta, a resposta e informções sobre 
 *  o usuário que fez a pergunta e o anúncio em questão.
 */
public class Pergunta {

	private String pergunta;

	private String resposta;

	private Date dataPergunta;

	private Date dataResposta;

	private Usuario usuario;

	private Anuncio anuncio;

	/**
	 *  Este método deve armazenar a pergunta realizada pelo cliente. 
	 *   Automaticamente essa função deve chamar a função salvar.
         * @param pergunta
	 */ 
        public Pergunta(String pergunta) {

	}

	/**
	 *  Este método deve armazenar informações não salvas
	 */
	public void salvar() {

	}

	/**
	 *  Neste método o anunciante pode responder à perguntas 
         * @param resposta
         * @param resposta
	 */ 
	public void responder(String resposta) {

	}

}
