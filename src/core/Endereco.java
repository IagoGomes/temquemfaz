package core;

/**
 *
 * Esta classe é responsável pelos atributos relacionados ao endereço
 * do usuário cadastrado no site, tais como pais, rua, número, cidade, 
 * bairro, cep e estado.
  */
public class Endereco {

	private String rua;

	private String cidade;

	private String bairro;

	private int cep;

	private String estado;

	private String complemento;

	private String pais;

	private int num;

	private Usuario usuario;

	/**
	 *  Método em que o construtor de endereço recebe todos os parâmetros menos o complemento.
	 */ 
	public Endereco() {

	}

}
