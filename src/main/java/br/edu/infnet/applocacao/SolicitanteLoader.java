package br.edu.infnet.applocacao;

import br.edu.infnet.applocacao.model.domain.Solicitante;
import br.edu.infnet.applocacao.model.domain.Usuario;
import br.edu.infnet.applocacao.model.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(2)
@Component
public class SolicitanteLoader implements ApplicationRunner {

    @Autowired
    private SolicitanteService solicitanteService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("arquivos/solicitante.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        while(linha != null) {
            campos = linha.split(";");

            Solicitante solicitante = new Solicitante(
                    campos[0],
                    campos[1],
                    campos[2]
            );
            solicitante.setUsuario(new Usuario(1));

            solicitanteService.incluir(solicitante);

            linha = leitura.readLine();
        }
        leitura.close();
    }
}
