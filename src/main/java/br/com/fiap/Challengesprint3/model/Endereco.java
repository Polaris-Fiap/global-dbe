package br.com.fiap.Challengesprint3.model;

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
    @Column(name = "cod_endereco")
    private Long id;

    @Column(name = "nr_cep")
    private Long numeroCep;

    @Column(name = "nm_rua")
    private String nomeRua;

    @Column(name = "nr_rua")
    private Integer numeroRua;

    @Column(name = "ds_complemento")
    private String desComplemento;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Bairro bairro;

    public Endereco() {
    }

    public Endereco(Long id, Long numeroCep, String nomeRua, Integer numeroRua, String desComplemento, Bairro bairro) {
        this.id = id;
        this.numeroCep = numeroCep;
        this.nomeRua = nomeRua;
        this.numeroRua = numeroRua;
        this.desComplemento = desComplemento;
        this.bairro = bairro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDesComplemento() {
        return desComplemento;
    }

    public void setDesComplemento(String desComplemento) {
        this.desComplemento = desComplemento;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco [id=" + id + ", numeroCep=" + numeroCep + ", nomeRua=" + nomeRua + ", numeroRua=" + numeroRua
                + ", desComplemento=" + desComplemento + ", bairro=" + bairro + "]";
    }
}
