package br.com.controle.produtos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.controle.produtos.domain.ProductCosif;
import br.com.controle.produtos.repository.ProductCosifRepository;
import io.swagger.annotations.ApiOperation;

/**
 * Resource para PRODUTO_COSIF operations
 * 
 * @author Julivan Silva
 */
@RestController
@RequestMapping("/productcosif")
public class ProductCosifResource {

	@Autowired
    private ProductCosifRepository repository;
	
	@ApiOperation(
			value = "${swagger.api.consulta.todos.cosif.value}",
			notes = "${swagger.api.consulta.todos.cosif.notes}",
			tags = { "Produto Cosif" })
    @GetMapping("/buscar")
    public ResponseEntity<List<ProductCosif>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }
}
