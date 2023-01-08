package br.com.cea.ApiCancelamentoViagemRis.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@Table(name = "LG327T")
@Entity(name = "LG327T")
public class Viagem {

    @Id
    @Column(name = "NI_DOC_FIS")
    private Integer niDocFis;

    @Column(name = "DT_VGM")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dtVgm;

    @Column(name = "NU_VGM")
    private Integer nuVgm;

    @Column(name = "TS_DOC_FIS_VGM")
    private Timestamp tsDocFisVgm;

    @Column(name = "NU_CGM")
    private Integer nuCgm;

    @Column(name = "IN_TRF_DOC_FIS_VGM")
    private String inTrfDocFisVgm;

    @Column(name = "IN_EXG_DAD")
    private String inExgDad;

    @Column(name = "IN_SNT")
    private String inSnt;

    @Column(name = "IN_ORI_DSC")
    private String inOriDsc;

    @OneToOne(mappedBy = "viagem")
    @JsonIgnore
    private Danfe danfe;

    @OneToOne(mappedBy = "viagem")
    @JsonIgnore
    private Nota nota;




}