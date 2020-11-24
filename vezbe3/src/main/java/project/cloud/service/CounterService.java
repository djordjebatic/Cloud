package project.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.cloud.model.Counter;
import project.cloud.repository.TestRepository;

@Service
public class CounterService {

    @Autowired
    TestRepository testRepository;

    public Counter incrementCounter() {
        Counter counter = testRepository.findById(new Long(0)).orElse(null);


        counter.setNumber(counter.getNumber() + 1);

        return testRepository.save(counter);
    }
}
