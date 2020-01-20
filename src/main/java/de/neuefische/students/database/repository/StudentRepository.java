package de.neuefische.students.database.repository;


import de.neuefische.students.database.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepository extends PagingAndSortingRepository<Student, String> {
}
