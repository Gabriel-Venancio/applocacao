package br.edu.infnet.applocacao.model.service;

import br.edu.infnet.applocacao.model.domain.Usuario;
import br.edu.infnet.applocacao.model.domain.Veiculo;
import br.edu.infnet.applocacao.model.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Collection<Veiculo> obterLista(){
        return (Collection<Veiculo>) veiculoRepository.findAll();
    }

    public Collection<Veiculo> obterLista(Usuario usuario){
        return (Collection<Veiculo>) veiculoRepository.obterLista(usuario.getId());
    }

    public void incluir(Veiculo veiculo) {
        veiculoRepository.save(veiculo);
    }

    public void excluir(Integer id) {
        veiculoRepository.deleteById(id);
    }
}
