package hr.kruno.magazin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hr.kruno.magazin.model.entity.Student;

// good practice that @repositories and @Services are interfaces. TODO - explain why ?
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
