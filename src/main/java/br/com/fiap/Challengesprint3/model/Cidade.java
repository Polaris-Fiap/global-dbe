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
@Table(name = "T_MNT_CIDADE")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_cidade")
    private Long codCidade;

    @Column(name = "nm_cidade")
    private String nomeCidade;

    @Column(name = "ds_sigla")
    private String siglaCidade;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Estado estado;

    public Cidade() {
    }

    public Cidade(Long codCidade, String nomeCidade, String siglaCidade, Estado estado) {
        this.codCidade = codCidade;
        this.nomeCidade = nomeCidade;
        this.siglaCidade = siglaCidade;
        this.estado = estado;
    }

    public Long getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(Long codCidade) {
        this.codCidade = codCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getSiglaCidade() {
        return siglaCidade;
    }

    public void setSiglaCidade(String siglaCidade) {
        this.siglaCidade = siglaCidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade [codCidade=" + codCidade + ", nomeCidade=" + nomeCidade + ", siglaCidade=" + siglaCidade
                + ", estado=" + estado + "]";
    }
}
