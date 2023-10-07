package br.edu.infnet.applocacao.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tcaminhao")
public class Caminhao extends Veiculo {

    private int capacidadeCarga;
    private boolean temCarreta;
    private String tipoCaminhao;

    public Caminhao() {

    }

    public Caminhao(Integer id) {
        super(id);
    }

    public Caminhao(String nome, float valor, int codigo, int capacidadeCarga, boolean temCarreta, String tipoCaminhao) {
        super(nome, valor, codigo);
        this.capacidadeCarga = capacidadeCarga;
        this.temCarreta = temCarreta;
        this.tipoCaminhao = tipoCaminhao;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public boolean isTemCarreta() {
        return temCarreta;
    }

    public void setTemCarreta(boolean temCarreta) {
        this.temCarreta = temCarreta;
    }

    public String getTipoCaminhao() {
        return tipoCaminhao;
    }

    public void setTipoCaminhao(String tipoCaminhao) {
        this.tipoCaminhao = tipoCaminhao;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "capacidadeCarga=" + capacidadeCarga +
                ", temCarreta=" + temCarreta +
                ", tipoCaminhao='" + tipoCaminhao + '\'' +
                '}';
    }
}
