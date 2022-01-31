package com.example.auteurservice.web;

import com.example.auteurservice.entity.Auteur;
import com.example.auteurservice.repository.AuteurRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuteurResrController {

    private AuteurRepository auteurRepository;

    public AuteurResrController(AuteurRepository auteurRepository) {
        this.auteurRepository = auteurRepository;
    }
    //afficher liste d'auteurs
    @GetMapping(path="/auteurs")
    public List<Auteur> listAuteur(){
        return auteurRepository.findAll();
    }
    //afficher auteur id
    @GetMapping(path = "/auteur/{id}")
    public Auteur getAuteur(@PathVariable(name ="id") Long id){
       return auteurRepository.findById(id).get();
    }
   //ajouter un auteur
    @PostMapping(path = "/auteur")
    public Auteur save(@RequestBody Auteur auteur){
        return auteurRepository.save(auteur);
    };
   //supprimer auteur
    @DeleteMapping("/auteur/{id}")
   public Void delete(@PathVariable Long id){
        auteurRepository.deleteById(id);
        return null;
    }



}
