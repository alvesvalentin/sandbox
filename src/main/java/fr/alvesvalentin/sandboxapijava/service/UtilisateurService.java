package fr.alvesvalentin.sandboxapijava.service;

import fr.alvesvalentin.sandboxapijava.model.Utilisateur;
import fr.alvesvalentin.sandboxapijava.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {
    @Autowired
    UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> findAll() {
        return utilisateurRepository.findAll();
    }
}