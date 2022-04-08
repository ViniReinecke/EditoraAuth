package dw.secauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dw.secauth.model.Artigo;
import dw.secauth.repository.ArtigoRepository;

@Controller
class CriarController {

    @Autowired
    ArtigoRepository rep;

    /**
     * Formulário para criar artigo
     * 
     * @param artigo
     * @return
     */
    @GetMapping("/artigos/criar")
    public String createArtigo(Artigo artigo) {
        return "criar";
    }

     /*
    * POST /artigos : criar artigo
    */
    @PostMapping("/artigos")
    public String saveArtigo(@Validated Artigo ar, BindingResult result)
    {
        if (result.hasErrors()) {
            return "criar";
        }   
        rep.save(new Artigo(ar.getTitulo(), ar.getResumo(), ar.isPublicado()));

        return "redirect:/artigos";
    }
}
