package br.com.cea.ApiCancelamentoViagemRis.controller;


import br.com.cea.ApiCancelamentoViagemRis.models.dto.NotaCancelamentoDTO;
import br.com.cea.ApiCancelamentoViagemRis.models.entity.Viagem;
import br.com.cea.ApiCancelamentoViagemRis.services.NotaCancelamentoService;
import br.com.cea.ApiCancelamentoViagemRis.services.ViagemService;
import br.com.cea.ApiCancelamentoViagemRis.services.impl.NotaCancelamentoServiceImpl;
import br.com.cea.ApiCancelamentoViagemRis.services.impl.ViagemServiceImpl;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/cancelar")
public class NotaCancelamentoController {

    @Autowired
    private NotaCancelamentoServiceImpl service;

    @Autowired
    private ViagemServiceImpl viagemService;

    @PostMapping("/{niDocFis}")
    @ApiOperation(value = "Envio de docFis para tópico no Kafka", notes = "NiDocFis precisa está atrelado em uma viagem")
    public ResponseEntity<List<NotaCancelamentoDTO>> sendCancelamentoDocFis(@PathVariable("niDocFis") Integer niDocFis) {
        List<Viagem> list = Collections.singletonList(viagemService.findById(niDocFis));
        List<NotaCancelamentoDTO> listDTO = list.stream().map(NotaCancelamentoDTO::new).collect(Collectors.toList());
        service.sendCancelamento(listDTO);
        System.out.println(listDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(listDTO);
    }



}
