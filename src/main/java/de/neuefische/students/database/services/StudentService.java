package de.neuefische.students.database.services;

import de.neuefische.students.database.model.Student;
import org.springframework.stereotype.Service;

import de.neuefische.students.database.repository.StudentRepository;

import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository){
        this.repository = repository;
    }

    public Iterable<Student> list(){
        return this.repository.findAll();
    }

	public Student addStudent(Student student) {
        this.repository.save(student);
		return student;
	}

	public Optional<Student> find(String id) {
		return this.repository.findById(id);
	}

}
