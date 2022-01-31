package com.example.auteurservice;

import com.example.auteurservice.entity.Auteur;
import com.example.auteurservice.repository.AuteurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AuteurServiceApplication  {

    public static void main(String[] args) {

        SpringApplication.run(AuteurServiceApplication.class, args);
    }


    @Bean
   CommandLineRunner start(AuteurRepository auteurRepository){
        return args -> {
           auteurRepository.save(new Auteur(null,"sara"));
           auteurRepository.save(new Auteur(null,"ilyane"));
           auteurRepository.save(new Auteur(null,"jeff"));


            auteurRepository.findAll().forEach(At->{
                System.out.println(At.getPseudo());
            });
        };
    }
}
