package ua.yarynych.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.yarynych.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
