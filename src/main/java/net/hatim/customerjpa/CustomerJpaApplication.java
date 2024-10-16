package net.hatim.customerjpa;

import net.hatim.customerjpa.entities.Utilisateur;
import net.hatim.customerjpa.repository.UtilisateurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerJpaApplication.class, args);
    }



@Bean
CommandLineRunner commandLineRunner(UtilisateurRepository utilisateurRepository){
    return args -> {
        List<Utilisateur> customerList = List.of(
                Utilisateur.builder()
                        .nom("Hassan")
                        .email("hassan@gmail.com")
                        .build(),
                Utilisateur.builder()
                        .nom("Hassan2")
                        .email("hassan2@gmail.com")
                        .build(),
                Utilisateur.builder()
                        .nom("Hassan3")
                        .email("hassan3@gmail.com")
                        .build(),
                Utilisateur.builder()
                        .nom("Hassan4")
                        .email("hassan4@gmail.com")
                        .build()
        );
        utilisateurRepository.saveAll(customerList);
    };
}
}
