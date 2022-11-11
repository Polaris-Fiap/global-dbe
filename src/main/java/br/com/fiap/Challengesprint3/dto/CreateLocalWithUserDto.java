package br.com.fiap.Challengesprint3.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.fiap.Challengesprint3.model.Endereco;

public class CreateLocalWithUserDto {

    // entidade mulher
    private Long codMulher;

    // local
    private String incidente;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dtOcorrencia;

    private Integer avaliacaoPerigo;

    private Endereco endereco;

    public CreateLocalWithUserDto() {

    }

    public CreateLocalWithUserDto(Long codMulher, String incidente, Date dtOcorrencia, Integer avaliacaoPerigo,
            Endereco endereco) {
        this.codMulher = codMulher;
        this.incidente = incidente;
        this.dtOcorrencia = dtOcorrencia;
        this.avaliacaoPerigo = avaliacaoPerigo;
        this.endereco = endereco;
    }

    public Long getCodMulher() {
        return codMulher;
    }

    public void setCodMulher(Long codMulher) {
        this.codMulher = codMulher;
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

}
