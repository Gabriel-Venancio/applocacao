package br.edu.infnet.applocacao.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tmoto")
public class Moto extends Veiculo{

    private boolean partidaEletrica;
    private int cilindrada;
    private String tipoFreio;

    public Moto() {

    }

    public Moto(Integer id) {
        super(id);
    }

    public Moto(String nome, float valor, int codigo, boolean partidaEletrica, int cilindrada, String tipoFreio) {
        super(nome, valor, codigo);
        this.partidaEletrica = partidaEletrica;
        this.cilindrada = cilindrada;
        this.tipoFreio = tipoFreio;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "partidaEletrica=" + partidaEletrica +
                ", cilindrada=" + cilindrada +
                ", tipoFreio='" + tipoFreio + '\'' +
                '}';
    }
}
