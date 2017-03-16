package core;

/**
 * Classe que armazena todas as informações pertinentes ao pagamento de um contrato
 *   realizado pelos clientes.
 */
public class Pagamento {

	public enum Tipo {DINHEIRO, CARTAO_DEBITO, CARTAO_CREDITO};

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
