package br.edu.infnet.applocacao.model.repository;

import br.edu.infnet.applocacao.model.domain.Caminhao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaminhaoRepository extends CrudRepository<Caminhao, Integer> {

    @Query("from Caminhao c where c.usuario.id = :userid")
    public List<Caminhao> obterLista(Integer userid);
}
