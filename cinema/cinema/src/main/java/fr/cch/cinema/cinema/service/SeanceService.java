package fr.cch.cinema.cinema.service;

import fr.cch.cinema.cinema.entity.Seance;
import fr.cch.cinema.cinema.exception.NotFoundException;
import fr.cch.cinema.cinema.repository.SeanceRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SeanceService {

    private final SeanceRepository seanceRepository;

    public SeanceService(SeanceRepository seanceRepository) {
        this.seanceRepository = seanceRepository;
    }

    public List<Seance> findAll() {
        return seanceRepository.findAll();
    }

    public Seance findById(Long id) {
        return seanceRepository.findById(id).orElseThrow(() -> new NotFoundException("Seance non trouvé !"));
    }

    public Seance create(Seance seance) {
        return seanceRepository.save(seance);
    }

    public Seance update(Seance seance) {
        Long seanceId = seance.getId();
        Seance seanceToFind = findById(seanceId);
        seanceToFind.setDateSeance(seance.getDateSeance());
        seanceToFind.setFilm(seance.getFilm());
        seanceToFind.setSalle(seance.getSalle());
        return seanceRepository.save(seanceToFind);
    }

    public Seance deleteById(Long id) {
        Seance seance = findById(id);
        seanceRepository.deleteById(id);
        return seance;
    }

    public void deleteAll() { seanceRepository.deleteAll(); }

}
