package br.com.cea.ApiCancelamentoViagemRis.models.dto;

import br.com.cea.ApiCancelamentoViagemRis.models.entity.Danfe;
import lombok.Data;

import java.util.Date;

@Data
public class DanfeDTO {

    private Integer niDocFis;

    private Integer nota;

    private String serie;

    private String danfe;

    private String emitente;

    private String destino;

    private String horaEmissao;

    private String dataEmissao;

    private Integer viagem;

    private Date dataViagem;

    private Integer carregamento;

    public DanfeDTO() {
    }

    public DanfeDTO(Danfe obj) {
        this.niDocFis = obj.getNiDocFis();
        this.nota = obj.getNuNf();
        this.serie = obj.getNuSreNf();
        this.danfe = obj.getCdDanfe();
        this.emitente = obj.getNota().getCdEmitDocFis();
        this.destino = obj.getNota().getCdDstDocFis();
        this.horaEmissao = obj.getNota().getHrEmissDocFis();
        this.dataEmissao = obj.getNota().getDtEmissDocFis();
        this.dataViagem = obj.getViagem().getDtVgm();
        this.carregamento = obj.getViagem().getNuCgm();
        this.viagem = obj.getViagem().getNuVgm();
    }


}
