package br.com.controle.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.controle.produtos.domain.Product;

/**
 * Repository Tabela - Produto
 * 
 * @author Julivan Silva
 */
public interface ProductRepository extends JpaRepository<Product, String> {

}
