package br.com.fiap.globalSolutionPolaris.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.globalSolutionPolaris.model.LocalEscolhido;
import br.com.fiap.globalSolutionPolaris.service.LocalEscolhidoService;

@Controller
@RequestMapping("/mulher")
public class MntWebController {
    
    @Autowired
    LocalEscolhidoService service;

    @GetMapping
    public ModelAndView index() {
        return new ModelAndView("mnt/index")
                    .addObject("mulher", service.findAll());
    }

    @GetMapping("new")
    public String cadastro(LocalEscolhido local) {
        return "mnt/cadastro";
    }
}
