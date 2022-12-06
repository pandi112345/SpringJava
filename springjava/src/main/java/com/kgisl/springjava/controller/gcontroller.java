package com.kgisl.springjava.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

@Controller

public class gcontroller {
    {
        System.out.println("gcontroller");
    }
    @RequestMapping("/gcon")
    public String showview(Model model){
        ArrayList<String> name = new ArrayList<String>();
        name.add("Manickaraj");
        name.add("Justin");
        name.add("Gowtham");
        name.add("Senthil");
        name.add("Paranesh");
        
        String g = new Gson().toJson(name);
    
        model.addAttribute("result", g);
        return "result";
    }

}
