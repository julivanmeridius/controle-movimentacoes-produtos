package br.com.controle.produtos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.controle.produtos.dto.MovementDto;
import br.com.controle.produtos.service.ManualMovementService;
import io.swagger.annotations.ApiOperation;

/**
 * Resource para MOVIMENTO_MANUAL operations
 * 
 * @author Julivan Silva
 */
@RestController
@RequestMapping("/movements")
public class ManualMovementResource {

	@Autowired
	private ManualMovementService service;
	
	@ApiOperation(
			value = "${swagger.api.criar.movimento.value}",
			notes = "${swagger.api.criar.movimento.notes}",
			tags = { "Movimento" })
	@PostMapping("/criar")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void save(@RequestBody MovementDto dto) {
		service.saveManualMovement(dto);
	}
	
	@ApiOperation(
			value = "${swagger.api.consulta.todos.movimentos.value}",
			notes = "${swagger.api.consulta.todos.movimentos.notes}",
			tags = { "Movimento" })
	@GetMapping("/buscar")
	public ResponseEntity<List<MovementDto>> findAll() {
		return ResponseEntity.ok(service.getAllManualMovements());
	}

	@ApiOperation(
			value = "${swagger.api.consulta.movimentos.periodo.value}",
			notes = "${swagger.api.consulta.movimentos.periodo.notes}",
			tags = { "Movimento" })
	@GetMapping("/buscar/{year}/{month}")
	public ResponseEntity<List<MovementDto>> findAll(@PathVariable int year, @PathVariable int month) {
		List<MovementDto> movements = service.findByYearAndMonth(year, month);
		return movements.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(movements);
	}
}
