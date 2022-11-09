package br.com.fiap.globalSolutionPolaris.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    @Column(name = "ds_email")
    private String email;

    @Column(name = "ds_senha")
    private String senha;

    @Column(name = "dt_nascimento")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dtNascimento;

    @Column(name = "nr_cpf")
    private Integer cpf;

    @Column(name = "nr_cpf_digito")
    private Integer cpfDigito;

    @Column(name = "nr_telefone")
    private Integer telefone;

    @Column(name = "nr_telefone_ddd")
    private Integer telefoneDDD;

    public Mulher() {
    }

    public Mulher(Long codMulher, String nomeMulher, String email, String senha, Date dtNascimento, Integer cpf,
            Integer cpfDigito, Integer telefone, Integer telefoneDDD) {
        this.codMulher = codMulher;
        this.nomeMulher = nomeMulher;
        this.email = email;
        this.senha = senha;
        this.dtNascimento = dtNascimento;
        this.cpf = cpf;
        this.cpfDigito = cpfDigito;
        this.telefone = telefone;
        this.telefoneDDD = telefoneDDD;
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

    @Override
    public String toString() {
        return "Mulher [codMulher=" + codMulher + ", nomeMulher=" + nomeMulher + ", email=" + email + ", senha=" + senha
                + ", dtNascimento=" + dtNascimento + ", cpf=" + cpf + ", cpfDigito=" + cpfDigito + ", telefone="
                + telefone + ", telefoneDDD=" + telefoneDDD + "]";
    }
}
