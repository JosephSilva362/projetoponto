package joseph.digitalinnovation.live.controller;

import joseph.digitalinnovation.live.model.JornadaTrabalho;
import joseph.digitalinnovation.live.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaLIst(){
        return jornadaService.findAll();
    }

    @GetMapping("/idJornada")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception{
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Jornada nao encontrada!")));
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaService.deleteJornada(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();

    }
}
