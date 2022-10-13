package br.com.angratech.controle.movimentacoes.produtos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.angratech.controle.movimentacoes.produtos.domain.ProductCosif;
import br.com.angratech.controle.movimentacoes.produtos.repository.ProductCosifRepository;

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

    @GetMapping
    public ResponseEntity<List<ProductCosif>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }
}
