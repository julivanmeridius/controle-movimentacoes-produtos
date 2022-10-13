package br.com.angratech.controle.movimentacoes.produtos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.angratech.controle.movimentacoes.produtos.domain.ManualMovement;
import br.com.angratech.controle.movimentacoes.produtos.domain.ManualMovementPK;

/**
 * Repository Tabela - movimento_manual
 * 
 * @author Julivan Silva
 */
public interface ManualMovementRepository extends JpaRepository<ManualMovement, ManualMovementPK> {

	@Query("from ManualMovement mme where mme.id.year = :year and mme.id.month = :month")	
	List<ManualMovement> findByYearAndMonth(@Param("year") int year, @Param("month") int month);

	@Query("select max(mme.id.release)+1 from ManualMovement mme where mme.id.year = :year and mme.id.month = :month")	
	Optional<Long> findNextRelease(@Param("year") int year, @Param("month") int month);
}
