package dw.secauth.controller;

//import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import dw.secauth.repository.ArtigoRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
class ListarController {

    @Autowired
    ArtigoRepository rep;

    /*  Obs.: retirando os comentários do código, ao fazer o logout 
     *      você será redirecionado para a tela de login novamente.
     */
    @GetMapping("/artigos")
    public String showArtigosList(@RequestParam(required = false) String titulo, Model model)
    {

        if (titulo == null)
            model.addAttribute("artigos", rep.findAll());

            // TODO filtragem por título
        
        return "listar";
    }
}