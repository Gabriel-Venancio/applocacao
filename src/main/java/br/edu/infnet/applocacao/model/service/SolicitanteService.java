package br.edu.infnet.applocacao.model.service;

import br.edu.infnet.applocacao.model.domain.Solicitante;
import br.edu.infnet.applocacao.model.domain.Usuario;
import br.edu.infnet.applocacao.model.repository.SolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SolicitanteService {

    @Autowired
    private SolicitanteRepository solicitanteRepository;

    public Collection<Solicitante> obterLista(){
        return (Collection<Solicitante>) solicitanteRepository.findAll();
    }

    public Collection<Solicitante> obterLista(Usuario usuario){
        return (Collection<Solicitante>) solicitanteRepository.obterLista(usuario.getId());
    }

    public void incluir(Solicitante solicitante) {
        solicitanteRepository.save(solicitante);
    }

    public void excluir(Integer id) {
        solicitanteRepository.deleteById(id);
    }
}
