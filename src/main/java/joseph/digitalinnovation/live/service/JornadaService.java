package joseph.digitalinnovation.live.service;

import joseph.digitalinnovation.live.model.JornadaTrabalho;
import joseph.digitalinnovation.live.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }
}
