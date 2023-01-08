package br.com.cea.ApiCancelamentoViagemRis.repositories;

import br.com.cea.ApiCancelamentoViagemRis.models.entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Integer> {


}
