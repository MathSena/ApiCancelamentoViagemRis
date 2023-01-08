package br.com.cea.ApiCancelamentoViagemRis.services.impl;

import br.com.cea.ApiCancelamentoViagemRis.models.entity.Viagem;
import br.com.cea.ApiCancelamentoViagemRis.repositories.ViagemRepository;
import br.com.cea.ApiCancelamentoViagemRis.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@RequiredArgsConstructor
@Log4j2
@Service
public class ViagemServiceImpl {
    @Autowired
    private ViagemRepository repository;

    public Viagem findById(Integer niDocFis){
        Optional<Viagem> obj = repository.findById(niDocFis);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Documento não encontrado " + niDocFis));

    }

}
