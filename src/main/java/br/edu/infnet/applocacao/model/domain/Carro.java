package br.edu.infnet.applocacao.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tcarro")
public class Carro extends Veiculo{

    private int numeroPortas;
    private boolean arCondicionado;
    private String tipoCombustivel;

    public Carro() {

    }

    public Carro(Integer id) {
        super(id);
    }

    public Carro(String nome, float valor, int codigo, int numeroPortas, boolean arCondicionado, String tipoCombustivel) {
        super(nome, valor, codigo);
        this.numeroPortas = numeroPortas;
        this.arCondicionado = arCondicionado;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroPortas=" + numeroPortas +
                ", arCondicionado=" + arCondicionado +
                ", tipoCombustivel='" + tipoCombustivel + '\'' +
                '}';
    }
}
