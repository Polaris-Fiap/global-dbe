package br.com.fiap.GlobalSolutionPolaris.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.fiap.GlobalSolutionPolaris.model.Mulher;
import br.com.fiap.GlobalSolutionPolaris.service.MulherService;

@Controller
public class MulherWebController {

    @Autowired
    private MulherService service;

    public MulherWebController(MulherService service) {
        super();
        this.service = service;
    }

    @GetMapping("/mulheres")
    public String listaMulheres(Model model) {
        model.addAttribute("mulheres", service.listAll());
        return "mulheres";
    }

    @GetMapping("/mulheres/new")
    public String criarMulher(Model model) {
        Mulher mulher = new Mulher();
        model.addAttribute("mulher", mulher);
        return "cadastro";
    }

    @PostMapping("/mulheres")
    public String salvarMulher(@ModelAttribute("mulher") Mulher mulher) {
        service.save(mulher);
        return "redirect:/mulheres";
    }

    @GetMapping("/mulheres/edit/{id}")
    public String editarMulher(@PathVariable Long id, Model model) {
        model.addAttribute("mulher", service.getById(id).get());
        return "editar";
    }

    @PostMapping("/mulheres/{id}")
    public String atualizarMulher(@PathVariable Long id, @ModelAttribute("mulher") Mulher mulher, Model model) {
        Optional<Mulher> existeMulher = service.getById(id);
        existeMulher.get().setCodMulher(id);
        existeMulher.get().setNomeMulher(mulher.getNomeMulher());
        existeMulher.get().setEmail(mulher.getEmail());
        existeMulher.get().setCpf(mulher.getCpf());
        existeMulher.get().setCpfDigito(mulher.getCpfDigito());
        existeMulher.get().setTelefone(mulher.getTelefone());
        existeMulher.get().setTelefoneDDD(mulher.getTelefoneDDD());
        service.save(existeMulher.get());
        return "redirect:/mulheres";
    }

    @GetMapping("/mulheres/{id}")
    public String removerMulher(@PathVariable Long id) {
        service.remove(id);
        return "redirect:/mulheres";
    }
}