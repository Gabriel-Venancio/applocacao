package br.edu.infnet.applocacao.model.repository;

import br.edu.infnet.applocacao.model.domain.Locacao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocacaoRepository extends CrudRepository<Locacao, Integer> {

    @Query("from Locacao l where l.usuario.id = :userid")
    public List<Locacao> obterLista(Integer userid);
}
