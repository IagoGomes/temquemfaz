package core;

import java.util.Date;

/**
 * Classe que armazena todas as informações pertinentes ao pagamento de um contrato
 *   realizado pelos clientes.
 */
public class Pagamento {
        /**
         * Enumerador que define os tipos de pagamento possíveis
         */ 
	public enum Tipo {
            /**
             * Tipo de pagamento realizado diretamente entre o cliente e o prestador de serviço
             */
             DINHEIRO, 
             /**
             * pagamento realizado pela plataforma, via débito online
             */
             CARTAO_DEBITO,
             /**
             * pagamento realizado pela plataforma, via cartão de crédito
             */
             CARTAO_CREDITO};

	private Date dataConfirmacao;

	private float valor;

	private Tipo modoDePagamento;

	private Contrato contrato;

	private Cartao cartao;

	private Boleto boleto;

  /**
   * Método que verifica se o pagamento já foi confirmado de acordo com a data de confirmação.
   * @return boolean
   */
  public boolean confirmado() {
		return false;
	}

}
