package ammar.springfreamwork.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping({"","/","index","index.html"})
    public  String Index()
    {
        return "index";
    }
}
