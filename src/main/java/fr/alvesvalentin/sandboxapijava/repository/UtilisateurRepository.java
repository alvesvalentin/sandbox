package fr.alvesvalentin.sandboxapijava.repository;

import fr.alvesvalentin.sandboxapijava.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {}