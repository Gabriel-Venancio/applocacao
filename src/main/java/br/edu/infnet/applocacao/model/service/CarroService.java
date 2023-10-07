package br.edu.infnet.applocacao.model.service;

import br.edu.infnet.applocacao.model.domain.Carro;
import br.edu.infnet.applocacao.model.domain.Usuario;
import br.edu.infnet.applocacao.model.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public Collection<Carro> obterLista() {
        return (Collection<Carro>) carroRepository.findAll();
    }

    public Collection<Carro> obterLista(Usuario usuario) {
        return (Collection<Carro>) carroRepository.obterLista(usuario.getId());
    }

    public void incluir(Carro bebida) {
        carroRepository.save(bebida);
    }

    public void excluir(Integer id) {
        carroRepository.deleteById(id);
    }
}
