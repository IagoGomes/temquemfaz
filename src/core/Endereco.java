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
	 * @param rua String
	 * @param cidade String
	 * @param bairro String
	 * @param cep int
	 * @param estado String
	 * @param pais String
	 * @param num int
	 */ 
	public Endereco(String rua, String cidade, String bairro, int cep, String estado, String pais, int num) {

	}
        
	/**
	* Método que modifica o complemento de um endereço
	*@param complemento String
	*/
	public void modificarComplemento(String complemento){
		
	}
	
	/**
	*Método que defini um usuário para o endereço em questão
	*@param usuario Usuario
	*/
	public void definirUsuario(Usuario usuario){
	}
}
