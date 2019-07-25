package ammar.springfreamwork.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/","index","index.html"})
    public  String listOwners()
    {
        return "Owner/index";
    }
}
