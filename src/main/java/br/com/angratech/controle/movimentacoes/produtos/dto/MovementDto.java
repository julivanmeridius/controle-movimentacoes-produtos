package br.com.angratech.controle.movimentacoes.produtos.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * DTO 
 * @author Julivan Silva 
 */
@Data
public class MovementDto implements Serializable {

	/** UID **/
	private static final long serialVersionUID = 7817381985793870222L;

	private int month;
    private int year;
    private long release;
    private double amount;
    private Date movementDate;
    private String productCode;
    private String cosifCode;
    private String description;    
    private String userCode;    
    private String productDescription;
}
