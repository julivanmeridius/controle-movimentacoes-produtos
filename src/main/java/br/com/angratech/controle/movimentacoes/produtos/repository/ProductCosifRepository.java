package br.com.angratech.controle.movimentacoes.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.angratech.controle.movimentacoes.produtos.domain.ProductCosif;
import br.com.angratech.controle.movimentacoes.produtos.domain.ProductCosifPK;

/**
 * Repository Tabela - produto_cosif
 * 
 * @author Julivan Silva
 */
public interface ProductCosifRepository extends JpaRepository<ProductCosif, ProductCosifPK> {

}
