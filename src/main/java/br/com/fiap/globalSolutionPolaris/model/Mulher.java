package br.com.fiap.globalSolutionPolaris.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "T_MNT_MULHER")
public class Mulher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codMulher;
    
    @Column(name = "nm_mulher")
    private String nomeMulher;

    private String email; // herdar de usuario
    private String senha; // herdar de usuario

    @Column(name = "dt_nascimento")
	@JsonFormat(pattern="dd/MM/yyyy")
    private Date dtNascimento;
    
    //atributo para imagem

    @Column(name = "nr_cpf")
    private Integer cpf;

    @Column(name = "nr_cpf_digito")
    private Integer cpfDigito;

    @Column(name = "nr_telefone")
    private Integer telefone;

    @Column(name = "nr_telefone_ddd")
    private Integer telefoneDDD;

    @Column(name = "ds_estado_civil")
    private String estadoCivil;

    @Column(name = "ds_profissao")
    private String profissao;

    @Column(name = "nr_rg")
    private Integer rg;

    @Column(name = "ds_rg_digito")
    private Integer rgDigito;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Endereco endereco;

    public Mulher () {}

    public Mulher(Long codMulher, String nomeMulher, String email, String senha, Date dtNascimento, Integer cpf,
            Integer cpfDigito, Integer telefone, Integer telefoneDDD, String estadoCivil, String profissao, Integer rg,
            Integer rgDigito, Endereco endereco) {
        this.codMulher = codMulher;
        this.nomeMulher = nomeMulher;
        this.email = email;
        this.senha = senha;
        this.dtNascimento = dtNascimento;
        this.cpf = cpf;
        this.cpfDigito = cpfDigito;
        this.telefone = telefone;
        this.telefoneDDD = telefoneDDD;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        this.rg = rg;
        this.rgDigito = rgDigito;
        this.endereco = endereco;
    }

    public Long getCodMulher() {
        return codMulher;
    }

    public void setCodMulher(Long codMulher) {
        this.codMulher = codMulher;
    }

    public String getNomeMulher() {
        return nomeMulher;
    }

    public void setNomeMulher(String nomeMulher) {
        this.nomeMulher = nomeMulher;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getCpfDigito() {
        return cpfDigito;
    }

    public void setCpfDigito(Integer cpfDigito) {
        this.cpfDigito = cpfDigito;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Integer getTelefoneDDD() {
        return telefoneDDD;
    }

    public void setTelefoneDDD(Integer telefoneDDD) {
        this.telefoneDDD = telefoneDDD;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public Integer getRgDigito() {
        return rgDigito;
    }

    public void setRgDigito(Integer rgDigito) {
        this.rgDigito = rgDigito;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Mulher [codMulher=" + codMulher + ", nomeMulher=" + nomeMulher + ", email=" + email + ", senha=" + senha
                + ", dtNascimento=" + dtNascimento + ", cpf=" + cpf + ", cpfDigito=" + cpfDigito + ", telefone="
                + telefone + ", telefoneDDD=" + telefoneDDD + ", estadoCivil=" + estadoCivil + ", profissao="
                + profissao + ", rg=" + rg + ", rgDigito=" + rgDigito + ", endereco=" + endereco + "]";
    }
}
