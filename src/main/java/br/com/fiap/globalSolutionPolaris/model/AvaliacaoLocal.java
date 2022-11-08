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
@Table(name = "T_MNT_AVALIACAO_LOCAL")
public class AvaliacaoLocal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vl_avaliacao_perigo")
    private Integer avaliacaoPerigo;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Mulher mulher;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private LocalEscolhido local;

    public AvaliacaoLocal() {}

    public AvaliacaoLocal(Long id, Integer avaliacaoPerigo, Mulher mulher, LocalEscolhido local) {
        this.id = id;
        this.avaliacaoPerigo = avaliacaoPerigo;
        this.mulher = mulher;
        this.local = local;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAvaliacaoPerigo() {
        return avaliacaoPerigo;
    }

    public void setAvaliacaoPerigo(Integer avaliacaoPerigo) {
        this.avaliacaoPerigo = avaliacaoPerigo;
    }

    public Mulher getMulher() {
        return mulher;
    }

    public void setMulher(Mulher mulher) {
        this.mulher = mulher;
    }

    public LocalEscolhido getLocal() {
        return local;
    }

    public void setLocal(LocalEscolhido local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "AvaliacaoLocal [id=" + id + ", avaliacaoPerigo=" + avaliacaoPerigo + ", mulher=" + mulher + ", local="
                + local + "]";
    }    

}
