package br.edu.infnet.applocacao.controller;

import br.edu.infnet.applocacao.model.domain.Carro;
import br.edu.infnet.applocacao.model.domain.Usuario;
import br.edu.infnet.applocacao.model.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping(value = "/carro/lista")
    public String telaLista(Model model, @SessionAttribute("user")Usuario usuario) {
        model.addAttribute("listaCarro", carroService.obterLista(usuario));

        return "carro/lista";
    }

    @GetMapping(value = "/carro/cadastro")
    public String telaCadastro() {
        return "carro/cadastro";
    }

    @PostMapping(value = "/carro/incluir")
    public String incluir(Carro carro, @SessionAttribute("user") Usuario usuario) {
        carro.setUsuario(usuario);
        carroService.incluir(carro);

        return "redirect:/carro/lista";
    }

    @GetMapping(value = "/carro/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        carroService.excluir(id);

        return "redirect:/carro/lista";
    }
}
