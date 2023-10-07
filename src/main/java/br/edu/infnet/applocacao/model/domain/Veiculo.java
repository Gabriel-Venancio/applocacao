package br.edu.infnet.applocacao.model.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tveiculo")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private float valor;
    private int codigo;
    @ManyToMany(mappedBy = "veiculos")
    private List<Locacao> locacoes;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Veiculo() {

    }

    public Veiculo(Integer id) {
        this.id = id;
    }

    public Veiculo(String nome, float valor, int codigo) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", codigo=" + codigo +
                '}';
    }
}
