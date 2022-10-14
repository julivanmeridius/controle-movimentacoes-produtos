package br.com.controle.produtos.service;

import java.util.List;

import br.com.controle.produtos.domain.ManualMovement;
import br.com.controle.produtos.dto.MovementDto;

public interface ManualMovementService {

	/**
	 * <p>
	 * Listar os Movimentos Manuais existentes.
	 *
	 * @return
	 */
	List<MovementDto> getAllManualMovements();	

	/**
	 * <p>
	 * Pesquisa de Movimentos por Ano e Mes.
	 *
	 * @return
	 */
	List<MovementDto> findByYearAndMonth(int year, int month);
	
	/**
	 * <p>
	 * Gravacao de um Movimento Manual
	 *
	 * @return
	 */
	ManualMovement saveManualMovement(MovementDto dto);
}
