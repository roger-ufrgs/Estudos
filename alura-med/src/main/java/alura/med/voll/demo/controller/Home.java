package alura.med.voll.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Home {


    @GetMapping
    public String home()
    {
        return "olá agora mudei";

    }
}
