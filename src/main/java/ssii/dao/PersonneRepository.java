package ssii.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ssii.entity.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {
    List<Personne> findByNom(String nom);
    List<Personne> findByPrenom(String prenom);
}