package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Endereco {
	private String logradouro;
	private String bairro;
	private String localidade;
	private String complemento;
	private String uf;

}
