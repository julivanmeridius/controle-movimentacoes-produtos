package br.com.angratech.controle.movimentacoes.produtos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

/**
 * Classe Entidade PK - tabela: movimento_manual
 * 
 * @author Julivan Silva
 */
@Data
@Embeddable
public class ManualMovementPK implements Serializable {

	/** UID **/
	private static final long serialVersionUID = 5199995399103532634L;

	@Column(name = "dat_mes")
	private int month;
	
	@Column(name = "dat_ano")
	private int year;
	
	@Column(name = "num_lancamento")
	private long release; 
	
	@Column(name = "cod_produto", length = 4)
	private String productCode; 
	
	@Column(name = "cod_cosif", length = 11)
	private String cosifCode; 
		
}
