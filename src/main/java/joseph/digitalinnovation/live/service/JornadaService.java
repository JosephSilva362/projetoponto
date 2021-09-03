package joseph.digitalinnovation.live.service;

import joseph.digitalinnovation.live.model.JornadaTrabalho;
import joseph.digitalinnovation.live.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idJornada){
        return jornadaRepository.findById(idJornada);
    }

    public void deleteJornada(Long idJornada){
        jornadaRepository.deleteById(idJornada);
    }
}
