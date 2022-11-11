package br.com.fiap.Challengesprint3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_MNT_ESTADO")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_estado")
    private Long codEstado;

    @Column(name = "nm_estado")
    private String nomeEstado;

    @Column(name = "ds_sigla")
    private String siglaEstado;

    public Estado() {
    }

    public Estado(Long codEstado, String nomeEstado, String siglaEstado) {
        this.codEstado = codEstado;
        this.nomeEstado = nomeEstado;
        this.siglaEstado = siglaEstado;
    }

    public Long getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(Long codEstado) {
        this.codEstado = codEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    @Override
    public String toString() {
        return "Estado [codEstado=" + codEstado + ", nomeEstado=" + nomeEstado + ", siglaEstado=" + siglaEstado + "]";
    }
}
