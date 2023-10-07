package br.edu.infnet.applocacao.controller;

import br.edu.infnet.applocacao.model.domain.Locacao;
import br.edu.infnet.applocacao.model.domain.Usuario;
import br.edu.infnet.applocacao.model.service.LocacaoService;
import br.edu.infnet.applocacao.model.service.SolicitanteService;
import br.edu.infnet.applocacao.model.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class LocacaoController {

    @Autowired
    private LocacaoService locacaoService;
    @Autowired
    private SolicitanteService solicitanteService;
    @Autowired
    private VeiculoService veiculoService;

    @GetMapping(value = "/locacao")
    public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("solicitantes", solicitanteService.obterLista(usuario));

        model.addAttribute("veiculo", veiculoService.obterLista(usuario));

        return "locacao/cadastro";
    }

    @GetMapping(value = "/locacao/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listagem", locacaoService.obterLista(usuario));

        return "locacao/lista";
    }

    @PostMapping(value = "/locacao/incluir")
    public String incluir(Locacao locacao, @SessionAttribute("user") Usuario usuario) {

        locacao.setUsuario(usuario);

        locacaoService.incluir(locacao);

        return "redirect:/locacao/lista";
    }

    @GetMapping(value = "/locacao/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        locacaoService.excluir(id);

        return "redirect:/locacao/lista";
    }
}
