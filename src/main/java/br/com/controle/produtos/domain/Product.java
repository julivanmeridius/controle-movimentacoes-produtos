package br.com.controle.produtos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Classe Entidade para Produto
 * 
 * @author Julivan Silva
 */
@Data
@Entity
@Table(name = "produto")
public class Product implements Serializable {
	
	/** UID **/
	private static final long serialVersionUID = -258596035311179820L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_produto", length = 4)
	private String code;
	
	@Column(name = "des_produto", length = 30)
	private String description;
	
	@Column(name = "sta_status")
	private boolean status;
	
}
