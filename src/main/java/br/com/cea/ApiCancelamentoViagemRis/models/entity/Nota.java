package br.com.cea.ApiCancelamentoViagemRis.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data
@ToString
@NoArgsConstructor
@Table(name = "LG300T")
@Entity(name = "LG300T")
public class Nota {

    @Id
    @Column(name = "NI_DOC_FIS")
    private Integer niDocFis;

    @Column(name = "CD_EMIT_DOC_FIS", length = 4)
    private String cdEmitDocFis;

    @Column(name = "CD_DST_DOC_FIS")
    private String cdDstDocFis;

    @Column(name = "DT_EMISS_DOC_FIS")
    private String dtEmissDocFis;

    @Column(name = "HR_EMISS_DOC_FIS")
    private String hrEmissDocFis;

    @Column(name = "DT_REC_DEST")
    private String dtRecDest;

    @Column(name = "ST_DOC_FIS_ENT")
    private String stDocFisEnt;

    @Column(name = "ST_DOC_FIS_EXTE")
    private String stDocFisExte;

    @Column(name = "DS_OBS_DOC_FIS")
    private String dsObsDocFis;

    @Column(name = "TP_DOC_FIS")
    private String tpDocFis;

    @Column(name = "NI_TRF_AMST")
    private Integer niTrfAmst;

    @Column(name = "DT_ATD_REC")
    private String dtAtdRec;

    @Column(name = "NU_ATD_REC")
    private Integer nuAtdRec;

    @Column(name = "CD_FL")
    private String cdFl;

    @Column(name = "ST_MAT_IPRDV")
    private String stMatIprdv;

    @Column(name = "CD_PAIS_ORI")
    private String cdPaisOri;

    @Column(name = "CD_PAIS_DEST")
    private String cdPaisDest;

    @Column(name = "HR_ATD_REC")
    private String hrAtdRec;

    @Column(name = "CD_FTR_CRC_MON")
    private String cdFtrCrcMon;

    @Column(name = "NI_SOL")
    private String niSol;

    @Column(name = "CD_TIP_EMISS")
    private String cdTipEmiss;

    @Column(name = "ST_OCO_REC_LOJ")
    private String stOcoRecLoj;

    @Column(name = "ST_LIBR_LIV_FIS")
    private String stLibrLivFis;

    @Column(name = "CD_PAIS")
    private String cdPais;

    @Column(name = "NU_SEQ_DOC_FIS")
    private String nuSeqDocFis;

    @Column(name = "TS_CANC_DOC_FIS")
    private String tsCancDocFis;

    @Column(name = "CD_USR_CANC_DOC")
    private String cdUsrCancDoc;

    @Column(name = "NI_DOC_FIS_ENV")
    private Integer niDocFisEnv;

    @Column(name = "CD_FL_ARM_DEST")
    private String cdFlArmDest;

    @Column(name = "IN_BX_ETQ_OPD_LGS")
    private String inBxEtqOpdLgs;

    @Column(name = "IN_EXG_DAD")
    private String inExgDad;

    @Column(name = "HR_REC_DTN")
    private String hrRecDtn;

    @Column(name = "DT_CTR_MOV")
    private String dtCtrMov;

    @Column(name = "NU_FMA_REC")
    private String nuFmaRec;

    @Column(name = "CD_USR_DTN")
    private String cdUsrDtn;

    @Column(name = "IN_SNT")
    private String inSnt;

    @Column(name = "IN_ENV_SAP")
    private String inEnvSap;

    @Column(name = "NI_OND_DIS")
    private String niOndDis;

    @Column(name = "TS_VNC_OND")
    private String tsVncOnd;

    @Column(name = "NU_RCB_DOA")
    private String nuRcbDoa;

    @Column(name = "DT_RCB_DOA")
    private String dtRcbDoa;

    @Column(name = "CD_OPR_FIS")
    private String cdOprFis;

    @Column(name = "QT_M3_DOC_FIS")
    private Double qtM3DocFis;

    @OneToOne
    @JoinColumn(name = "NI_DOC_FIS", referencedColumnName = "niDocFis")
    @JsonIgnore
    private Danfe danfe;

    @OneToOne
    @JoinColumn(name = "NI_DOC_FIS", referencedColumnName = "niDocFis")
    @JsonIgnore
    private Viagem viagem;

    public Nota(String cdEmitDocFis, String dtEmissDocFis ){
        this.cdEmitDocFis = cdEmitDocFis;
        this.dtEmissDocFis = dtEmissDocFis;
    }
}
