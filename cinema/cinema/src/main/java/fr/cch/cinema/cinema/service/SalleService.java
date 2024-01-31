package fr.cch.cinema.cinema.service;

import fr.cch.cinema.cinema.entity.Salle;
import fr.cch.cinema.cinema.exception.NotFoundException;
import fr.cch.cinema.cinema.repository.SalleRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SalleService {

    private final SalleRepository salleRepository;

    public SalleService(SalleRepository salleRepository) {
        this.salleRepository = salleRepository;
    }

    public List<Salle> findAll() {
        return salleRepository.findAll();
    }

    public Salle findById(Long id) {
        return salleRepository.findById(id).orElseThrow(() -> new NotFoundException("Salle non trouvé !"));
    }

    public Salle create(Salle salle) {
        return salleRepository.save(salle);
    }

    public Salle update(Salle salle) {
        Long salleId = salle.getId();
        Salle salleToFind = findById(salleId);
        salleToFind.setNumero(salle.getNumero());
        salleToFind.setCapacite(salle.getCapacite());
        return salleRepository.save(salleToFind);
    }

    public Salle deleteById(Long id) {
        Salle salle = findById(id);
        salleRepository.deleteById(id);
        return salle;
    }

    public void deleteAll() { salleRepository.deleteAll(); }

}
