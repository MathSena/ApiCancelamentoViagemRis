package br.com.cea.ApiCancelamentoViagemRis.services;

import br.com.cea.ApiCancelamentoViagemRis.models.entity.Viagem;


import java.util.List;



public interface ViagemService{

    public Viagem findById(Integer niDocFis);

    public List<Viagem> findAllByNuVgmAndNuCgm(Integer nuVgm, Integer nuCgm);


}
