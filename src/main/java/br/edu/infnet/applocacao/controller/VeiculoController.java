package br.edu.infnet.applocacao.controller;

import br.edu.infnet.applocacao.model.domain.Usuario;
import br.edu.infnet.applocacao.model.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping(value = "/veiculo/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listaProduto", veiculoService.obterLista(usuario));

        return "veiculo/lista";
    }

    @GetMapping(value = "/veiculo/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        veiculoService.excluir(id);

        return "redirect:/veiculo/lista";
    }
}
