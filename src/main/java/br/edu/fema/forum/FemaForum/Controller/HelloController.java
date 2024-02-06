package br.edu.fema.forum.FemaForum.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    public String hello()
    {
        return "<h1>Hello World Fema!</h1> <h3>Luis Felipe dos Santos</h3>";
    }
}
