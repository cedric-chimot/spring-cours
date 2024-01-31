package fr.cch.cinema.cinema.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.cch.cinema.cinema.dto.ActeurCompletDTO;
import fr.cch.cinema.cinema.dto.ActeurReduitDTO;
import fr.cch.cinema.cinema.entity.Acteur;
import fr.cch.cinema.cinema.exception.NotFoundException;
import fr.cch.cinema.cinema.repository.ActeurRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ActeurService {

    private final ActeurRepository acteurRepository;

    private final ObjectMapper objectMapper;

    public ActeurService(ActeurRepository acteurRepository, ObjectMapper objectMapper) {
        this.acteurRepository = acteurRepository;
        this.objectMapper = objectMapper;
    }

    public List<ActeurReduitDTO> findAll() {
        List<Acteur> acteurs = acteurRepository.findAll();
        return acteurs.stream()
                .map(acteur -> objectMapper.convertValue(acteur, ActeurReduitDTO.class))
                .toList();
    }

    public ActeurCompletDTO findById(Long id) {
        Acteur acteur = acteurRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Acteur non trouvé !"));
        return objectMapper.convertValue(acteur, ActeurCompletDTO.class);
    }

    public ActeurCompletDTO create(Acteur acteur) {
        Acteur acteurToSave = acteurRepository.save(acteur);
        return objectMapper.convertValue(acteurToSave, ActeurCompletDTO.class);
    }

    public ActeurCompletDTO update(Acteur acteur) {
        Acteur acteurToSave = acteurRepository.save(acteur);
        return objectMapper.convertValue(acteurToSave, ActeurCompletDTO.class);
    }

    public ActeurCompletDTO deleteById(Long id) {
        ActeurCompletDTO acteur = findById(id);
        acteurRepository.deleteById(id);
        return acteur;
    }

    public void deleteAll() { acteurRepository.deleteAll(); }

}
