package br.com.angratech.controle.movimentacoes.produtos.resource;

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

import br.com.angratech.controle.movimentacoes.produtos.dto.MovementDto;
import br.com.angratech.controle.movimentacoes.produtos.service.ManualMovementService;

/**
 * Resource para Movements operations
 * 
 * @author Julivan Silva
 */
@RestController
@RequestMapping("/movements")
public class ManualMovementResource {

	@Autowired
	private ManualMovementService service;

	@PostMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void save(@RequestBody MovementDto dto) {
		service.saveManualMovement(dto);
	}

	@GetMapping
	public ResponseEntity<List<MovementDto>> findAll() {
		return ResponseEntity.ok(service.getAllManualMovements());
	}

	@GetMapping("/{year}/{month}")
	public ResponseEntity<List<MovementDto>> findAll(@PathVariable int year, @PathVariable int month) {
		List<MovementDto> movements = service.findByYearAndMonth(year, month);
		return movements.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(movements);
	}
}
