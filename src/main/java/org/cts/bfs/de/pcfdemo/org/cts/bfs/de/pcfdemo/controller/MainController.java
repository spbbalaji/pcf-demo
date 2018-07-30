package org.cts.bfs.de.pcfdemo.org.cts.bfs.de.pcfdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String goHome(){
        return "home";
    }
}
