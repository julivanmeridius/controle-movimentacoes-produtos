package br.com.angratech.controle.movimentacoes.produtos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.angratech.controle.movimentacoes.produtos.domain.Product;
import br.com.angratech.controle.movimentacoes.produtos.repository.ProductRepository;

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

    @GetMapping
    public ResponseEntity<List<Product>> findAllProducts() {
        return ResponseEntity.ok(repository.findAll());
    }
}
