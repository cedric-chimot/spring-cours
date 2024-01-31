package fr.cch.cinema.cinema.service;

import fr.cch.cinema.cinema.entity.Realisateur;
import fr.cch.cinema.cinema.exception.NotFoundException;
import fr.cch.cinema.cinema.repository.RealisateurRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class RealisateurService {

    private final RealisateurRepository realisateurRepository;

    public RealisateurService(RealisateurRepository realisateurRepository) {
        this.realisateurRepository = realisateurRepository;
    }

    public List<Realisateur> findAll() {
        return realisateurRepository.findAll();
    }

    public Realisateur findById(Long id) {
        return realisateurRepository.findById(id).orElseThrow(() -> new NotFoundException("Realisateur non trouvé !"));
    }

    public Realisateur create(Realisateur realisateur) {
        return realisateurRepository.save(realisateur);
    }

    public Realisateur update(Realisateur realisateur) {
        Long realisateurId = realisateur.getId();
        Realisateur realisateurToFind = findById(realisateurId);
        realisateurToFind.setNom(realisateur.getNom());
        realisateurToFind.setPrenom(realisateur.getPrenom());
        return realisateurRepository.save(realisateurToFind);
    }

    public Realisateur deleteById(Long id) {
        Realisateur realisateur = findById(id);
        realisateurRepository.deleteById(id);
        return realisateur;
    }

    public void deleteAll() { realisateurRepository.deleteAll(); }

}
