package br.com.cea.ApiCancelamentoViagemRis.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@NoArgsConstructor
@Table(name = "LG301T")
@Entity(name = "LG301T")
public class Danfe {

    @Id
    @Column(name = "NI_DOC_FIS")
    private Integer niDocFis;

    @Column(name = "NU_NF")
    private Integer nuNf;

    @Column(name = "NU_SRE_NF")
    private String nuSreNf;

    @Column(name = "DS_NTZ_OPR_NF")
    private String dsNtzOprNf;

    @Column(name = "CD_FIS_OPR_NF")
    private String cdFisOprNf;

    @Column(name = "VL_CLC_ICMS_NF")
    private Double vlClcIcmsNf;

    @Column(name = "VL_ICMS_NF")
    private Double vlIcmsNf;

    @Column(name = "VL_CLC_ICMS_SBT")
    private Double vlClcIcmsSbt;

    @Column(name = "VL_ICMS_SBT_NF")
    private Double vlIcmsSbtNf;

    @Column(name = "VL_TOT_PRD_NF")
    private Double vlTotPrdNf;

    @Column(name = "VL_FRT_NF")
    private Double vlFrtNf;

    @Column(name = "VL_SEGR_NF")
    private Double vlSegrNf;

    @Column(name = "VL_DSP_ACE_NF")
    private Double vlDspAceNf;

    @Column(name = "VL_TOT_IPI_NF")
    private Double vlTotIpiNf;

    @Column(name = "VL_TOT_NF")
    private Double vlTotNf;

    @Column(name = "VL_AMT_FIN_NF")
    private Double vlAmtFinNf;

    @Column(name = "VL_ECG_NF")
    private Double vlEcgNf;

    @Column(name = "IN_EXG_DAD")
    private String inExgDad;

    @Column(name = "VL_CLC_IPI_NF")
    private Double vlClcIpiNf;

    @Column(name = "VL_PIS_NF")
    private Double vlPisNf;

    @Column(name = "VL_COFINS_NF")
    private Double vlCofinsNf;

    @Column(name = "QT_VOL")
    private Integer qtVol;

    @Column(name = "CD_DANFE")
    private String cdDanfe;

    @Column(name = "CD_MTV_AUSNC_DANFE")
    private String cdMtvAusncDanfe;

    @Column(name = "VL_CLC_FCP_NF")
    private Double vlClcFcpNf;

    @Column(name = "VL_FCP_NF")
    private Double vlFcpNf;

    @OneToOne(mappedBy = "danfe")
    @JsonIgnore
    private Nota nota;

    @OneToOne
    @JoinColumn(name = "NI_DOC_FIS", referencedColumnName = "niDocFis")
    @JsonIgnore
    private Viagem viagem;

    public Danfe(String cdDanfe){
        this.cdDanfe = cdDanfe;

    }

}
