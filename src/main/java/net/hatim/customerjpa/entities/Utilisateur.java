package net.hatim.customerjpa.entities;

import jakarta.persistence.*;
import lombok.*;


import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "utilisateur")
public class Utilisateur  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "utilisateur_id")
    private int id;
    private String nom;
    private String email;

}
