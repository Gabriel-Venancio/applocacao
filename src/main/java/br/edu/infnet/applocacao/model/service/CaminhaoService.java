package br.edu.infnet.applocacao.model.service;

import br.edu.infnet.applocacao.model.domain.Caminhao;
import br.edu.infnet.applocacao.model.domain.Usuario;
import br.edu.infnet.applocacao.model.repository.CaminhaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CaminhaoService {

    @Autowired
    private CaminhaoRepository caminhaoRepository;

    public Collection<Caminhao> obterLista() {
        return (Collection<Caminhao>) caminhaoRepository.findAll();
    }

    public Collection<Caminhao> obterLista(Usuario usuario) {
        return  (Collection<Caminhao>) caminhaoRepository.obterLista(usuario.getId());
    }

    public void incluir(Caminhao caminhao) {
        caminhaoRepository.save(caminhao);
    }

    public void excluir(Integer id) {
        caminhaoRepository.deleteById(id);
    }
}
