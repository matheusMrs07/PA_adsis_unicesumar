package com.adsis.exemploSpring.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adsis.exemploSpring.models.Ninja;
import com.adsis.exemploSpring.services.NinjaService;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    NinjaService ninjaService;

    @GetMapping
    public List<Ninja> listar() {
        return ninjaService.listar();
    }

    @PostMapping
    public Ninja criarNinja(@RequestBody Ninja ninja) {
        return ninjaService.salvar(ninja);
    }

}
