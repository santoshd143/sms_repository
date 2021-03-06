package tyro.application.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tyro.application.sms.entity.Student;
import tyro.application.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentMangementSystemApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentMangementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1=new Student("santosh","kumar","satishkumar@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2=new Student("pavan","kumar","pavankumar@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3=new
		 * Student("manikanta","gandham","manikantagandham@gmail.com");
		 * studentRepository.save(student3);
		 */
		
		
	}
	
}
