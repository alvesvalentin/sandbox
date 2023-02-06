package fr.alvesvalentin.sandboxapijava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "utilisateur")
public class Utilisateur {
    @Id
    private Long id;

    private String nom;

    private String prenom;

    public Utilisateur(Long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Long getId() {
        return id;
    }

    public Utilisateur setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public Utilisateur setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getPrenom() {
        return prenom;
    }

    public Utilisateur setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }
}