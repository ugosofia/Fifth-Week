package Service;

import Domain.Timer;

import java.util.List;
import java.util.Optional;

public interface TimerService {

    public List<Timer> findAll();

    public Optional<Timer> findById(String id);
}
