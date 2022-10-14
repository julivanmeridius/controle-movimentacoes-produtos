package br.com.controle.produtos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

/**
 * Classe Entidade PK - tabela: produto_cosif
 * 
 * @author Julivan Silva
 */
@Data
@Embeddable
public class ProductCosifPK implements Serializable {

	/** UID **/	
	private static final long serialVersionUID = 3992353195426161121L;
	
	@Column(name = "cod_produto", length = 4)
	private String productCode; 
	
	@Column(name = "cod_cosif", length = 11)
	private String cosifCode;
	
}
