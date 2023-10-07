package br.edu.infnet.applocacao;

import br.edu.infnet.applocacao.model.domain.Caminhao;
import br.edu.infnet.applocacao.model.domain.Carro;
import br.edu.infnet.applocacao.model.domain.Moto;
import br.edu.infnet.applocacao.model.domain.Usuario;
import br.edu.infnet.applocacao.model.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(3)
@Component
public class VeiculoLoader implements ApplicationRunner {

    @Autowired
    private VeiculoService veiculoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("arquivos/veiculo.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        while(linha != null) {
            campos = linha.split(";");

            if (campos.length >= 8) {

                switch (campos[7]) {
                    case "C":
                        Caminhao caminhao = new Caminhao(
                                campos[0],
                                Float.valueOf(campos[1]),
                                Integer.valueOf(campos[2]),
                                Integer.valueOf(campos[3]),
                                Boolean.valueOf(campos[4]),
                                campos[5]
                        );

                        caminhao.setUsuario(new Usuario(Integer.valueOf(campos[6])));
                        veiculoService.incluir(caminhao);
                        break;

                    case "CA":
                        Carro carro = new Carro(
                                campos[0],
                                Float.valueOf(campos[1]),
                                Integer.valueOf(campos[2]),
                                Integer.valueOf(campos[3]),
                                Boolean.valueOf(campos[4]),
                                campos[5]
                        );

                        carro.setUsuario(new Usuario(Integer.valueOf(campos[6])));

                        veiculoService.incluir(carro);
                        break;

                    case "M":
                        Moto moto = new Moto(
                                campos[0],
                                Float.valueOf(campos[1]),
                                Integer.valueOf(campos[2]),
                                Boolean.valueOf(campos[3]),
                                Integer.valueOf(campos[4]),
                                campos[5]
                        );

                        moto.setUsuario(new Usuario(Integer.valueOf(campos[6])));

                        veiculoService.incluir(moto);
                        break;

                    default:
                        break;
                }
            } else {
                System.err.println("Linha não possui campos suficientes: " + linha);
            }
          linha = leitura.readLine();
        }

        leitura.close();
    }
}
