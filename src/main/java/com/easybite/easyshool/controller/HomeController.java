package com.easybite.easyshool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @RequestMapping({"/home", " ", "/", "lukasz" })
    public String displayHomePage() {
        return "home.html";
    }
}
