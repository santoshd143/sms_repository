package tyro.application.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tyro.application.sms.entity.Student;

public interface StudentRepository  extends JpaRepository<Student,Long>{

}
