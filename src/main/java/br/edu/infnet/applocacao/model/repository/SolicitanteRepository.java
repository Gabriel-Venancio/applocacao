package br.edu.infnet.applocacao.model.repository;

import br.edu.infnet.applocacao.model.domain.Solicitante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SolicitanteRepository extends CrudRepository<Solicitante, Integer> {

    @Query("from Solicitante s where s.usuario.id = :userid")
    public List<Solicitante> obterLista(Integer userid);
}
