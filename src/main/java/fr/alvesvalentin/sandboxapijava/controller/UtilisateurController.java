package fr.alvesvalentin.sandboxapijava.controller;

import fr.alvesvalentin.sandboxapijava.model.Utilisateur;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {

    @GetMapping(value = "/utilisateurs", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Utilisateur> coucou() {
        return ResponseEntity.ok(new Utilisateur(1L, "Truite", "Gustave"));
    }
}