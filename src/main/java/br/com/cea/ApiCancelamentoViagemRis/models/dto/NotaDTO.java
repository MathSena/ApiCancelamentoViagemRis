package br.com.cea.ApiCancelamentoViagemRis.models.dto;

import br.com.cea.ApiCancelamentoViagemRis.models.entity.Danfe;
import lombok.Data;

@Data
public class NotaDTO {

    private Integer niDocFis;

    private String emitente;

    private String destinatario;

    private String dataEmissao;

    private String horaEmissao;

    private Danfe nota;

    private Danfe danfe;


    public NotaDTO() {

    }

    public NotaDTO(NotaDTO obj) {
        this.niDocFis = obj.getNiDocFis();
        this.emitente = obj.getEmitente();
        this.destinatario = obj.getDestinatario();
        this.dataEmissao = obj.getDataEmissao();
        this.horaEmissao = obj.getHoraEmissao();
        this.nota = obj.getNota();
        this.danfe = obj.getDanfe();


    }


}

