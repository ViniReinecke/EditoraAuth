package dw.secauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import dw.secauth.model.Artigo;
import dw.secauth.repository.ArtigoRepository;

@Controller
class EditarController {

    @Autowired
    ArtigoRepository rep;

    @GetMapping("artigos/{id}/editar")
    public String editarArtigo(@PathVariable("id") long id, Model model) {
        Artigo artigo = rep.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Artigo inválido."));

        model.addAttribute("artigo", artigo);
        return "editar";
    }

     /*
    * POST /artigos/:id : atualizar artigo dado um id
    */
    @PostMapping("/artigos/{id}")
    public String updateArtigo(@PathVariable("id") long id, @Validated Artigo a, BindingResult result, Model model)
    {
        if (result.hasErrors()) {
            return "editar";
        }
        
        Artigo artigo = rep.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Artigo invalido."));

        artigo.setTitulo(a.getTitulo());
        artigo.setPublicado(a.isPublicado());
        artigo.setResumo(a.getResumo());
        rep.save(artigo);
        return "redirect:/artigos";

    }
    
}