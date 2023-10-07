package br.edu.infnet.applocacao.model.repository;

import br.edu.infnet.applocacao.model.domain.Moto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MotoRepository extends CrudRepository<Moto, Integer> {

    @Query("from Moto m where m.usuario.id = :userid")
    public List<Moto> obterLista(Integer userid);
}
