package br.edu.infnet.applocacao.controller;

import br.edu.infnet.applocacao.model.domain.Moto;
import br.edu.infnet.applocacao.model.domain.Usuario;
import br.edu.infnet.applocacao.model.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class MotoController {

    @Autowired
    private MotoService motoService;

    @GetMapping(value = "/moto/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listaMoto", motoService.obterLista(usuario));

        return "moto/lista";
    }

    @GetMapping(value = "/moto/cadastro")
    public String telaCadastro() {
        return "moto/cadastro";
    }

    @PostMapping(value = "/moto/incluir")
    public String incluir(Moto moto, @SessionAttribute("user") Usuario usuario) {
        moto.setUsuario(usuario);

        motoService.incluir(moto);

        return "redirect:/moto/lista";
    }

    @GetMapping(value = "/moto/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        motoService.excluir(id);

        return "redirect:/moto/lista";
    }
}
