package Controller;

import Domain.Timer;
import Repository.TimerRepository;
import Service.TimerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TimerController {

    private TimerService timerService;
    private TimerRepository timerRepository;

    @GetMapping("/")
    ResponseEntity<List<Timer>> findAll() {
        return new ResponseEntity<>(timerService.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    ResponseEntity<Timer> findById(@PathVariable String id) {
        Optional<Timer> consegna = timerService.findById(id);
        return new ResponseEntity<Timer>((Timer) timerService.findById(id).get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createClient(@RequestBody Timer timer) throws URISyntaxException {
        Timer savedTimer = timerRepository.save(timer);
        return ResponseEntity.created(new URI("/timer/" + savedTimer.getId())).body(savedTimer);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateTimer(@PathVariable Long id, @RequestBody Timer timer) {
        Timer currentTimer = timerService.findById(String.valueOf(id)).orElseThrow(RuntimeException::new);
        currentTimer.setDataInizio(timer.getDataInizio());
        currentTimer.setDataFine(timer.getDataFine());
        currentTimer = timerRepository.save(timer);

        return ResponseEntity.ok(currentTimer);
    }

}
