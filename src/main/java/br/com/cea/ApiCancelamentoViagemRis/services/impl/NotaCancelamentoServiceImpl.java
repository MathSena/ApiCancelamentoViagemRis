package br.com.cea.ApiCancelamentoViagemRis.services.impl;

import br.com.cea.ApiCancelamentoViagemRis.models.dto.NotaCancelamentoDTO;
import br.com.cea.ApiCancelamentoViagemRis.models.entity.Viagem;
import br.com.cea.ApiCancelamentoViagemRis.repositories.ViagemRepository;
import br.com.cea.ApiCancelamentoViagemRis.services.NotaCancelamentoService;
import br.com.cea.ApiCancelamentoViagemRis.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Log4j2
@Service
public class NotaCancelamentoServiceImpl  implements NotaCancelamentoService {

    @Autowired
    private KafkaTemplate<Object, List<NotaCancelamentoDTO>> kafkaTemplate;
    @Autowired
    private ViagemRepository repository;


    @SneakyThrows
    @Override
    public void sendCancelamento(List<NotaCancelamentoDTO> listDTO) {

        log.info("Cancelando notas ::: ", listDTO);

        log.info("Recebendo registro");
        kafkaTemplate.send("notas-canceladas", listDTO);

    }

    @Override
    public Viagem findById(Integer niDocFis) {
        Optional<Viagem> obj = repository.findById(niDocFis);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Documento não encontrado " + niDocFis));
    }


}
