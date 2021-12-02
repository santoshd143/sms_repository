package tyro.application.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import tyro.application.sms.entity.Student;
import tyro.application.sms.repository.StudentRepository;
import tyro.application.sms.service.StudentService;

@Service
public class Studentserviceimpl implements StudentService{

	private StudentRepository studentRepository;
	
	public Studentserviceimpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}
	

}
