package net.hatim.customerjpa.web;

import lombok.AllArgsConstructor;

import net.hatim.customerjpa.entities.Utilisateur;
import net.hatim.customerjpa.repository.UtilisateurRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@AllArgsConstructor
@RestController
public class UtilisateurController {

private UtilisateurRepository utilisateurRepository;

    @GetMapping(path = "/customers")
    public List<Utilisateur> customerList(){
        return utilisateurRepository.findAll();
    }

}
