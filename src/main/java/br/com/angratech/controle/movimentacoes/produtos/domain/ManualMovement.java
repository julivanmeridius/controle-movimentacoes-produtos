package br.com.angratech.controle.movimentacoes.produtos.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * Classe Entidade - tabela: movimento_manual
 * 
 * @author Julivan Silva
 */
@Data
@Entity
@Table(name = "movimento_manual")
public class ManualMovement implements Serializable {

	/** UID **/
	private static final long serialVersionUID = 1201712022668464993L;
	
	@EmbeddedId
	private ManualMovementPK id;
	
	@Column(name = "des_descricao", length = 50)
	private String description; 
	
	@Column(name = "dat_movimento")
	private Date movementDate;
	
	@Column(name = "cod_usuario")
	private String userCode;
	
	@Column(name = "val_valor")
	private double amount;
	
	@ManyToOne
	@JoinColumn(name = "code", referencedColumnName = "cod_produto")
	private Product product;
	
}
