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
@Table(name = "T_MNT_LOCAL_ESCOLHIDO")
public class LocalEscolhido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_local")
    private Long codLocal;

    @Column(name = "ds_incidente")
    private String incidente;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Endereco endereco;

    public LocalEscolhido() {}
    
    public LocalEscolhido(Long codLocal, String incidente, Endereco endereco) {
        this.codLocal = codLocal;
        this.incidente = incidente;
        this.endereco = endereco;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "LocalEscolhido [codLocal=" + codLocal + ", incidente=" + incidente + ", endereco=" + endereco + "]";
    }

}
