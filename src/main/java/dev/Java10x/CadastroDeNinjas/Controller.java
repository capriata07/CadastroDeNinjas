package dev.Java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/home")
    public String boasVindas(){
        return "Seja Bem vindo  a nossa primeira Rota da Aplicação!!";
    }

}
