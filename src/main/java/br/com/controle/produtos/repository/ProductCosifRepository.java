package br.com.controle.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.controle.produtos.domain.ProductCosif;
import br.com.controle.produtos.domain.ProductCosifPK;

/**
 * Repository Tabela - produto_cosif
 * 
 * @author Julivan Silva
 */
public interface ProductCosifRepository extends JpaRepository<ProductCosif, ProductCosifPK> {

}
