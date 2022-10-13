package br.com.angratech.controle.movimentacoes.produtos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

/**
 * Classe Entidade PK - tabela: produto_cosif
 * 
 * @author Julivan Silva
 */
@Data
@Entity
@Table(name = "produto_cosif")
public class ProductCosif implements Serializable {

	/** UID **/
	private static final long serialVersionUID = -8945058802043148675L;

	@EmbeddedId
	private ProductCosifPK id;
		
	@Column(name = "cod_classificacao", length = 6)
	private String classification; 
	
	@Column(name = "sta_status")
	private boolean status;	
}
