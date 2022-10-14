package br.com.controle.produtos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.controle.produtos.domain.Product;
import br.com.controle.produtos.repository.ProductRepository;
import io.swagger.annotations.ApiOperation;

/**
 * Resource para PRODUTO operations
 * 
 * @author Julivan Silva
 */
@RestController
@RequestMapping("/products")
public class ProductResource {
	
	@Autowired
    private ProductRepository repository;

	@ApiOperation(
			value = "${swagger.api.consulta.todos.produtos.value}",
			notes = "${swagger.api.consulta.todos.produtos.notes}",
			tags = { "Produto" })
    @GetMapping("/buscar")
    public ResponseEntity<List<Product>> findAllProducts() {
        return ResponseEntity.ok(repository.findAll());
    }	
}
