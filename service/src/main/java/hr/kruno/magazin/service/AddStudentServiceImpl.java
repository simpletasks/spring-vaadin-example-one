package hr.kruno.magazin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.kruno.magazin.model.entity.Student;
import hr.kruno.magazin.repository.StudentRepository;

@Service
public class AddStudentServiceImpl implements AddStudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	// I would like to save different object every time I call this method. This is way arg name is 'studentDAO'
	public void saveStudent(Student studentDAO) {

		Student newStudent = new Student();
		newStudent.setFirstName(studentDAO.getFirstName());
		newStudent.setLastName(studentDAO.getLastName());
		newStudent.setAge(studentDAO.getAge());
		newStudent.setGender(studentDAO.getGender());
		
		studentRepository.save(newStudent);
	}

}
