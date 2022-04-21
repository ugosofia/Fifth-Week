package Service;

import Domain.Timer;
import Repository.TimerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimerServiceImpl implements TimerService {

    @Autowired
    TimerRepository userRepository;

    @Override
    public List<Timer> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<Timer> findById(String id) {
        return userRepository.findById(id);
    }
}
