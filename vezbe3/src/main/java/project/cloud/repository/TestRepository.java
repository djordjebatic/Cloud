package project.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.cloud.model.Counter;

public interface TestRepository extends JpaRepository<Counter, Long> {
}
