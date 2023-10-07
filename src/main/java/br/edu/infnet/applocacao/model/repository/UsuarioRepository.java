package br.edu.infnet.applocacao.model.repository;

import br.edu.infnet.applocacao.model.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    public Usuario findByEmail(String email);
}
