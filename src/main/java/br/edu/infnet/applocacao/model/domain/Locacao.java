package br.edu.infnet.applocacao.model.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tlocacao")
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private LocalDateTime data;
    private boolean web;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idSolicitante")
    private Solicitante solicitante;
    @ManyToMany(cascade = CascadeType.DETACH)
    private List<Veiculo> veiculos;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Locacao() {
        descricao = "Locação inicial";
        data = LocalDateTime.now();
        web = true;
    }

    public Locacao(Solicitante solicitante) {
        this();
        this.solicitante = solicitante;
    }

    public Locacao(String descricao, Solicitante solicitante, List<Veiculo> veiculos) {
        this();
        this.descricao = descricao;
        this.solicitante = solicitante;
        this.veiculos = veiculos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "descricao='" + descricao + '\'' +
                ", data=" + data +
                ", web=" + web +
                ", solicitante=" + solicitante +
                ", veiculos=" + veiculos.size() +
                '}';
    }
}
