package br.com.fiap.globalSolutionPolaris.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_MNT_ENDERECO")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nr_cep")
    private Long numeroCep;

    @Column(name = "nm_rua")
    private String nomeRua;

    @Column(name = "nr_rua")
    private Integer numeroRua;

    @Column(name = "ds_complemento")
    private String descComplemento;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Bairro bairro;

    public Endereco () {}

    public Endereco(Long numeroCep, String nomeRua, Integer numeroRua, String descComplemento, Bairro bairro) {
        this.numeroCep = numeroCep;
        this.nomeRua = nomeRua;
        this.numeroRua = numeroRua;
        this.descComplemento = descComplemento;
        this.bairro = bairro;
    }

    public Long getNumeroCep() {
        return numeroCep;
    }

    public void setNumeroCep(Long numeroCep) {
        this.numeroCep = numeroCep;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public Integer getNumeroRua() {
        return numeroRua;
    }

    public void setNumeroRua(Integer numeroRua) {
        this.numeroRua = numeroRua;
    }

    public String getDescComplemento() {
        return descComplemento;
    }

    public void setDescComplemento(String descComplemento) {
        this.descComplemento = descComplemento;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco [numeroCep=" + numeroCep + ", nomeRua=" + nomeRua + ", numeroRua=" + numeroRua
                + ", descComplemento=" + descComplemento + ", bairro=" + bairro + "]";
    }

    
}
