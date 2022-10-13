package br.com.angratech.controle.movimentacoes.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.angratech.controle.movimentacoes.produtos.domain.Product;

/**
 * Repository Tabela - Produto
 * 
 * @author Julivan Silva
 */
public interface ProductRepository extends JpaRepository<Product, String> {
		
}
