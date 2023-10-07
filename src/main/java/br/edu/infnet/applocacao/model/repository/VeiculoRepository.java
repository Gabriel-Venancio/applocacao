package br.edu.infnet.applocacao.model.repository;

import br.edu.infnet.applocacao.model.domain.Veiculo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VeiculoRepository extends CrudRepository<Veiculo, Integer> {

    @Query("from Veiculo v where v.usuario.id = :userid")
    public List<Veiculo> obterLista(Integer userid);
}
