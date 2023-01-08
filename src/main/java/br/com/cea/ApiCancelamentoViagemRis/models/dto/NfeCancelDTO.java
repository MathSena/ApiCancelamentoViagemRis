package br.com.cea.ApiCancelamentoViagemRis.models.dto;


import br.com.cea.ApiCancelamentoViagemRis.models.entity.Danfe;
import br.com.cea.ApiCancelamentoViagemRis.models.entity.Nota;
import lombok.Data;



@Data
public class NfeCancelDTO {


    private String emitenteNota;

    private String dataEmissaoNota;

    private String codLocalizadorDanfe;


    public NfeCancelDTO(Nota nf, Danfe danfe){
        this.emitenteNota = nf.getCdEmitDocFis().trim();
        this.dataEmissaoNota = nf.getDtEmissDocFis();
        this.codLocalizadorDanfe = danfe.getCdDanfe();
    }

    public NfeCancelDTO() {

    }
}
