package actions.repository;

import actions.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudnetRepository extends JpaRepository<Student, Long> {
}
