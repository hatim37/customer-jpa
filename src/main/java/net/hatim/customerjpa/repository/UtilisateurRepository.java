package net.hatim.customerjpa.repository;

import net.hatim.customerjpa.entities.Utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}
