package com.rest.api;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


@RestController
public class AnimalesController {
    @GetMapping("/animales")
    List<Animales> allAnimals(){
        List<Animales> anim = new ArrayList<Animales>();
        anim.add(new Animales("rufus", "perro",12,32,"amarillo"));
        anim.add(new Animales("misifus", "gato",3,10,"negro"));
        anim.add(new Animales("anibal", "leon",4,50,"amarillo con negro"));
        anim.add(new Animales("Lucas", "pato",1,6,"blanco"));
        return anim;
    }

    @GetMapping("/animales/{nombre}")
    Animales oneAnimal(@PathVariable("nombre") String nombre) {
        List<Animales> anim = new ArrayList<Animales>();
        anim.add(new Animales("rufus", "perro",12,32,"amarillo"));
        anim.add(new Animales("misifus", "gato",3,10,"negro"));
        anim.add(new Animales("anibal", "leon",4,50,"amarillo con negro"));
        anim.add(new Animales("Lucas", "pato",1,6,"blanco"));
        System.out.println((Animales) anim.stream().filter(item -> nombre.equals(item.getNombre())).collect(Collectors.toList()));
        return (Animales) anim.stream().filter(item -> nombre.equals(item.getNombre())).collect(Collectors.toList());
    }
}
