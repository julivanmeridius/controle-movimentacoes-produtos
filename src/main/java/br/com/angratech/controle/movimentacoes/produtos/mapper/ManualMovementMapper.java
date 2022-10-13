package br.com.angratech.controle.movimentacoes.produtos.mapper;

import org.springframework.stereotype.Component;

import br.com.angratech.controle.movimentacoes.produtos.domain.ManualMovement;
import br.com.angratech.controle.movimentacoes.produtos.domain.ManualMovementPK;
import br.com.angratech.controle.movimentacoes.produtos.domain.Product;
import br.com.angratech.controle.movimentacoes.produtos.dto.MovementDto;

/**
 * Classe Mapper para conversoes de objetos entre as camadas.
 * 
 * @author Julivan Silva
 */
@Component
public class ManualMovementMapper {

	public MovementDto gerarMovimentoDto(ManualMovement movement, Product product) {

		MovementDto dto = new MovementDto();

		dto.setYear(movement.getId().getYear());
		dto.setMonth(movement.getId().getMonth());
		dto.setRelease(movement.getId().getRelease());
		dto.setProductCode(movement.getId().getProductCode());
		dto.setCosifCode(movement.getId().getCosifCode());

		dto.setDescription(movement.getDescription());
		dto.setMovementDate(movement.getMovementDate());
		dto.setUserCode(movement.getUserCode());
		dto.setAmount(movement.getAmount());
		if (product != null) {
			dto.setProductDescription(product.getDescription());
		}

		return dto;
	}

	public ManualMovement convert(MovementDto dto) {

		ManualMovementPK id = new ManualMovementPK();
		id.setYear(dto.getYear());
		id.setMonth(dto.getMonth());
		id.setRelease(dto.getRelease());
		id.setProductCode(dto.getProductCode());
		id.setCosifCode(dto.getCosifCode());

		ManualMovement entity = new ManualMovement();
		entity.setId(id);
		entity.setDescription(dto.getDescription());
		entity.setMovementDate(dto.getMovementDate());
		entity.setUserCode(dto.getUserCode());
		entity.setAmount(dto.getAmount());

		return entity;
	}
}
