package br.edu.infnet.applocacao.model.service;

import br.edu.infnet.applocacao.model.domain.Locacao;
import br.edu.infnet.applocacao.model.domain.Usuario;
import br.edu.infnet.applocacao.model.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class LocacaoService {

    @Autowired
    private LocacaoRepository locacaoRepository;

    public Collection<Locacao> obterLista() {
        return (Collection<Locacao>) locacaoRepository.findAll();
    }

    public Collection<Locacao> obterLista(Usuario usuario) {

        List<Locacao> lista = locacaoRepository.obterLista(usuario.getId());

        if(lista.isEmpty()) {
            return Collections.emptyList();
        }

        return lista;
    }

    public void incluir(Locacao locacao) {
        locacaoRepository.save(locacao);
    }

    public void excluir(Integer id) {
        locacaoRepository.deleteById(id);
    }
}