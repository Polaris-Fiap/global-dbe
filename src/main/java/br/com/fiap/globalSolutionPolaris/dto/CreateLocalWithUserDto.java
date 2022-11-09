package br.com.fiap.globalSolutionPolaris.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.fiap.globalSolutionPolaris.model.Endereco;

public class CreateLocalWithUserDto {

    // entidade mulher
    private Long codMulher;

    // local
    private String incidente;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dtOcorrencia;

    private Integer avaliacaoPerigo;

    // // endereco
    // private Long numeroCep;

    // private String nomeRua;

    // private Integer numeroRua;

    // private String desComplemento;

    // // bairro
    // private String nomeBairro;

    // // cidade
    // private String nomeCidade;

    // private String siglaCidade;

    // // estado
    // private String nomeEstado;

    // private String siglaEstado;

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

    // public CreateLocalWithUserDto(LocalEscolhido local) {
    // this.codMulher = local.getMulher().getCodMulher();
    // this.incidente = local.getIncidente();
    // this.dtOcorrencia = local.getDtOcorrencia();
    // this.avaliacaoPerigo = local.getAvaliacaoPerigo();
    // this.numeroCep = local.getEndereco().getNumeroCep();
    // this.nomeRua = local.getEndereco().getNomeRua();
    // this.numeroRua = local.getEndereco().getNumeroRua();
    // this.desComplemento = local.getEndereco().getDesComplemento();
    // this.nomeBairro = local.getEndereco().getBairro().getNomeBairro();
    // this.nomeCidade =
    // local.getEndereco().getBairro().getCidade().getNomeCidade();
    // this.siglaCidade =
    // local.getEndereco().getBairro().getCidade().getSiglaCidade();
    // this.nomeEstado =
    // local.getEndereco().getBairro().getCidade().getEstado().getNomeEstado();
    // this.siglaEstado =
    // local.getEndereco().getBairro().getCidade().getEstado().getSiglaEstado();
    // }

}
