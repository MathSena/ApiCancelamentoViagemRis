package br.com.cea.ApiCancelamentoViagemRis.services;

import br.com.cea.ApiCancelamentoViagemRis.models.dto.NotaCancelamentoDTO;
import br.com.cea.ApiCancelamentoViagemRis.models.entity.Viagem;

import java.util.List;

public interface NotaCancelamentoService {

    void sendCancelamento(List<NotaCancelamentoDTO> listDTO);


    Viagem findById(Integer niDocFis);


}
