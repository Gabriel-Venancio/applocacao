package br.edu.infnet.applocacao.model.service;

import br.edu.infnet.applocacao.model.domain.Moto;
import br.edu.infnet.applocacao.model.domain.Usuario;
import br.edu.infnet.applocacao.model.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MotoService {

    @Autowired
    private MotoRepository motoRepository;

    public Collection<Moto> obterLista() {
        return (Collection<Moto>) motoRepository.findAll();
    }

    public Collection<Moto> obterLista(Usuario usuario) {
        return (Collection<Moto>) motoRepository.obterLista(usuario.getId());
    }

    public void incluir(Moto moto) {
        motoRepository.save(moto);
    }

    public void excluir(Integer id) {
        motoRepository.deleteById(id);
    }
}
