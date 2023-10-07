package br.edu.infnet.applocacao.model.repository;

import br.edu.infnet.applocacao.model.domain.Carro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarroRepository extends CrudRepository<Carro, Integer> {

    @Query("from Carro c where c.usuario.id = :userid")
    public List<Carro> obterLista(Integer userid);
}
