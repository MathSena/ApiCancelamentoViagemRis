package br.com.cea.ApiCancelamentoViagemRis.repositories;


import br.com.cea.ApiCancelamentoViagemRis.models.entity.Danfe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanfeRepository extends JpaRepository<Danfe, Integer> {


}

