package com.ipiecoles.java.java230.repository;

import com.ipiecoles.java.java230.model.Employe;
import org.joda.time.LocalDate;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeRepository extends CrudRepository<Employe, Long> {
    //Recherche d'employés par matricule
    Employe findByMatricule(String matricule);

    //Recherche d'employés par nom et prénom
    List<Employe> findByNomAndPrenom(String nom, String prenom);

    //Recherche d'employés par nom sans prendre en compte la casse
    List<Employe> findByNomIgnoreCase(String nom);

    //Recherche d'employés embauchés avant une certaine date
    List<Employe> findByDateEmbaucheBefore(LocalDate dateEmbauche);

    //Recherche d'employés embauchés après une certaine date
    List<Employe> findByDateEmbaucheAfter(LocalDate dateEmbauche);

    //Recherche d'employés gagnant plus de X euros et ordonnés
        //selon leur salaire (ceux qui gagnent le plus d'abord)
    List<Employe> findBySalaireGreaterThanOrderBySalaireDesc(Double salaire);
}