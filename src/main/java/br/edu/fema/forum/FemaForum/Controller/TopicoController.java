package br.edu.fema.forum.FemaForum.Controller;

import br.edu.fema.forum.FemaForum.Model.Curso;
import br.edu.fema.forum.FemaForum.Model.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicoController {
    @RequestMapping("/topicos")
    @ResponseBody
    public List<Topico> lista()
    {
        Topico topico = new Topico(
                "Dúvida Spring Boot 3",
                "Não sei como colocar o servidor no ar, preciso de ajuda!!",
                new Curso("Spring", "Programação")
        );

        return Arrays.asList(topico, topico, topico);
    }
}
