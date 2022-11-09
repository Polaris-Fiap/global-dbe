package br.com.fiap.globalSolutionPolaris.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "T_MNT_LOCAL_ESCOLHIDO")
public class LocalEscolhido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_local")
    private Long codLocal;

    @Column(name = "ds_incidente")
    private String incidente;

    @Column(name = "dt_ocorrencia")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dtOcorrencia;

    @Column(name = "vl_avaliacao_perigo")
    private Integer avaliacaoPerigo;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Endereco endereco;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Mulher mulher;

    public LocalEscolhido() {
    }

    public LocalEscolhido(Long codLocal) {
        this.codLocal = codLocal;
    }

    public LocalEscolhido(Long codLocal, String incidente, Date dtOcorrencia, Integer avaliacaoPerigo,
            Endereco endereco) {
        this.codLocal = codLocal;
        this.incidente = incidente;
        this.dtOcorrencia = dtOcorrencia;
        this.avaliacaoPerigo = avaliacaoPerigo;
        this.endereco = endereco;
    }

    public LocalEscolhido(Long codLocal, String incidente, Date dtOcorrencia, Integer avaliacaoPerigo,
            Endereco endereco, Mulher mulher) {
        this.codLocal = codLocal;
        this.incidente = incidente;
        this.dtOcorrencia = dtOcorrencia;
        this.avaliacaoPerigo = avaliacaoPerigo;
        this.endereco = endereco;
        this.mulher = mulher;
    }

    public Long getCodLocal() {
        return codLocal;
    }

    public void setCodLocal(Long codLocal) {
        this.codLocal = codLocal;
    }

    public String getIncidente() {
        return incidente;
    }

    public void setIncidente(String incidente) {
        this.incidente = incidente;
    }

    public Date getDtOcorrencia() {
        return dtOcorrencia;
    }

    public void setDtOcorrencia(Date dtOcorrencia) {
        this.dtOcorrencia = dtOcorrencia;
    }

    public Integer getAvaliacaoPerigo() {
        return avaliacaoPerigo;
    }

    public void setAvaliacaoPerigo(Integer avaliacaoPerigo) {
        this.avaliacaoPerigo = avaliacaoPerigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Mulher getMulher() {
        return mulher;
    }

    public void setMulher(Mulher mulher) {
        this.mulher = mulher;
    }
    
    @Override
    public String toString() {
        return "LocalEscolhido [codLocal=" + codLocal + ", incidente=" + incidente + ", dtOcorrencia=" + dtOcorrencia
                + ", avaliacaoPerigo=" + avaliacaoPerigo + ", endereco=" + endereco + "]";
    }

}
