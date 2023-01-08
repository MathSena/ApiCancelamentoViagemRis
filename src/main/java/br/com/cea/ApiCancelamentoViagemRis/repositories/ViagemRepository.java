package br.com.cea.ApiCancelamentoViagemRis.repositories;


import br.com.cea.ApiCancelamentoViagemRis.models.entity.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Integer> {


}


