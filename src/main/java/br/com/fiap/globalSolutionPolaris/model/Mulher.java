package br.com.fiap.globalSolutionPolaris.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "T_MNT_MULHER")
public class Mulher implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codMulher;

    @Column(name = "nm_mulher")
    private String nomeMulher;

    @Column(unique = true, name = "ds_email")
    private String email;

    @Column(name = "ds_senha")
    private String senha;

    @Column(name = "dt_nascimento")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dtNascimento;

    @Column(unique = true, name = "nr_cpf")
    private Integer cpf;

    @Column(name = "nr_cpf_digito")
    private Integer cpfDigito;

    @Column(name = "nr_telefone")
    private Integer telefone;

    @Column(name = "nr_telefone_ddd")
    private Integer telefoneDDD;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<Role> roles = new ArrayList<>();

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
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles;
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    // Métodos para setar atributos no commandLine c/valid
    public Mulher nome(String nome) {
        Assert.notNull(nome, "Nome nao pode estar vazia");
        this.nomeMulher = nome;
        return this;
    }

    public Mulher email(String email) {
        Assert.notNull(email, "Email nao pode estar vazia");
        this.email = email;
        return this;
    }

    public Mulher senha(String senha) {
        Assert.notNull(senha, "Senha nao pode estar vazia");
        this.senha = senha;
        return this;
    }

    public Mulher dtNascimento(String dtNascimento) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse(dtNascimento);
        Assert.notNull(dtNascimento, "Data de nascimento nao pode estar vazia");
        this.dtNascimento = data;
        return this;
    }

    public Mulher cpf(Integer cpf) {
        Assert.notNull(cpf, "Cpf nao pode estar vazia");
        this.cpf = cpf;
        return this;
    }

    public Mulher cpfDigito(Integer cpfDigito) {
        Assert.notNull(cpfDigito, "Digito do cpf nao pode estar vazia");
        this.cpfDigito = cpfDigito;
        return this;
    }

    public Mulher telefone(Integer telefone) {
        Assert.notNull(telefone, "Campo do telefone nao pode estar vazio");
        this.telefone = telefone;
        return this;
    }

    public Mulher telefoneDDD(Integer telefoneDDD) {
        Assert.notNull(telefoneDDD, "DDD nao pode estar vazio");
        this.telefoneDDD = telefoneDDD;
        return this;
    }

    public Mulher role(Role role) {
        Assert.notNull(role, "Campo role nao pode estar vazio");
        this.roles.add(role);
        return this;
    }

    @Override
    public String toString() {
        return "Mulher [codMulher=" + codMulher + ", nomeMulher=" + nomeMulher + ", email=" + email + ", senha=" + senha
                + ", dtNascimento=" + dtNascimento + ", cpf=" + cpf + ", cpfDigito=" + cpfDigito + ", telefone="
                + telefone + ", telefoneDDD=" + telefoneDDD + "]";
    }
}
