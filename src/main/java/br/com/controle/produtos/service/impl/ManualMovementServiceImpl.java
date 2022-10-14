package br.com.controle.produtos.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.controle.produtos.domain.ManualMovement;
import br.com.controle.produtos.domain.Product;
import br.com.controle.produtos.dto.MovementDto;
import br.com.controle.produtos.mapper.ManualMovementMapper;
import br.com.controle.produtos.repository.ManualMovementRepository;
import br.com.controle.produtos.repository.ProductRepository;
import br.com.controle.produtos.service.ManualMovementService;

/**
 * Service Layer.
 * 
 * @author Julivan Silva 
 */
@Service
@Transactional
public class ManualMovementServiceImpl implements ManualMovementService {

	private static final String DEFAULT_USER = "TESTE";

	Logger logger = LoggerFactory.getLogger(ManualMovementServiceImpl.class);
	
	@Autowired
	private ManualMovementRepository repository; 
		
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ManualMovementMapper mapper;
		
	@Override
	public List<MovementDto> getAllManualMovements() {
		logger.info("Executando Metodo: getAllManualMovements() - Service");
		return this.getMovementDtos(repository.findAll());
	}

	@Override
	public List<MovementDto> findByYearAndMonth(int year, int month) {
		logger.info("Executando Metodo: findByYearAndMonth() - Parametros: YEAR {} MONTH {}", year, month);
        return this.getMovementDtos(repository.findByYearAndMonth(year, month));
	}

	@Override
	public ManualMovement saveManualMovement(MovementDto dto) {
		logger.info("Executando Metodo: saveManualMovement() - Parametro: {}", dto);
		
		Optional<Long> optionalRelease = repository.findNextRelease(dto.getYear(), dto.getMonth());
        ManualMovement entity = mapper.convert(dto);
        entity.getId().setRelease( optionalRelease.isPresent() ? optionalRelease.get():1L );
        entity.setMovementDate(new Date());
        entity.setUserCode(DEFAULT_USER);
        
        return repository.save(entity);
	}
	
	private List<MovementDto> getMovementDtos(List<ManualMovement> movements) {
		logger.info("Executando Metodo: getMovementDtos() - Service");
		
		List<MovementDto> returnList = new ArrayList<>();
        movements.stream().forEach(entity -> {
            Product product = productRepository.getReferenceById(entity.getId().getProductCode());
            MovementDto dto = mapper.gerarMovimentoDto(entity, product);
            returnList.add(dto);
        });
        return returnList;
    }
}
