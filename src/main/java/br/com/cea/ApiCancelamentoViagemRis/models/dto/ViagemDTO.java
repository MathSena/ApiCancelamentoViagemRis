package br.com.cea.ApiCancelamentoViagemRis.models.dto;

import br.com.cea.ApiCancelamentoViagemRis.models.entity.Viagem;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
public class ViagemDTO {

    private Integer niDocFis;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataViagem;
    private Integer viagem;
    private Timestamp dataCarregamento;
    private Integer carregamento;

    private String danfe;

    private String emitente;

    private String destino;

    private String horaEmissao;

    private String dataEmissao;

    private Integer numeroNota;


    public ViagemDTO() {

    }

    public ViagemDTO(Viagem obj) {
        this.niDocFis = obj.getNiDocFis();
        this.dataViagem = obj.getDtVgm();
        this.viagem = obj.getNuVgm();
        this.dataCarregamento = obj.getTsDocFisVgm();
        this.carregamento = obj.getNuCgm();
        this.danfe = obj.getDanfe().getCdDanfe();
        this.numeroNota = obj.getDanfe().getNuNf();
        this.emitente = obj.getNota().getCdEmitDocFis();
        this.destino = obj.getNota().getCdDstDocFis();
        this.horaEmissao = obj.getNota().getHrEmissDocFis();
        this.dataEmissao = obj.getNota().getDtEmissDocFis();

    }



}
