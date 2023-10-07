package br.edu.infnet.applocacao.model.service;

import br.edu.infnet.applocacao.clients.IUsuarioClient;
import br.edu.infnet.applocacao.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioClient usuarioClient;

    public Collection<Usuario> obterLista(){
        return usuarioClient.obterLista();
    }

    public void incluir(Usuario usuario) {
        usuarioClient.incluir(usuario);
    }

    public void excluir(Integer id) {
        usuarioClient.excluir(id);
    }

    public Usuario validar(String email, String senha) {
        return usuarioClient.validar(email, senha);
    }
}
