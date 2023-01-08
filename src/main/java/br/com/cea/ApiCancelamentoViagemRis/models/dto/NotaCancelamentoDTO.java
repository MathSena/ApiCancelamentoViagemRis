package br.com.cea.ApiCancelamentoViagemRis.models.dto;

import br.com.cea.ApiCancelamentoViagemRis.models.entity.Viagem;
import lombok.Data;
import org.jetbrains.annotations.NotNull;


@Data
public class NotaCancelamentoDTO {

    private String origin;
    NfeCancelDTO body = new NfeCancelDTO();

    public NotaCancelamentoDTO(@NotNull Viagem obj) {
        this.origin = "ris";
        this.body = new NfeCancelDTO(obj.getNota(), obj.getDanfe());

    }



}
