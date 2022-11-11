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
@Table(name = "T_MNT_BAIRRO")
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_bairro")
    private Long codBairro;

    @Column(name = "nm_bairro")
    private String nomeBairro;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Cidade cidade;

    public Bairro() {
    }

    public Bairro(Long codBairro, String nomeBairro, Cidade cidade) {
        this.codBairro = codBairro;
        this.nomeBairro = nomeBairro;
        this.cidade = cidade;
    }

    public Long getCodBairro() {
        return codBairro;
    }

    public void setCodBairro(Long codBairro) {
        this.codBairro = codBairro;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Bairro [codBairro=" + codBairro + ", nomeBairro=" + nomeBairro + ", cidade=" + cidade + "]";
    }
}
