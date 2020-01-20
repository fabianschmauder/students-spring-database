package de.neuefische.students.database.controller;

import de.neuefische.students.database.model.Student;
import de.neuefische.students.database.services.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("student")
public class StudentsController {

    private final StudentService service;

    public StudentsController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public Iterable<Student> list(){
        return service.list();
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Student> getStudentWithId(@PathVariable String id){
        Optional<Student> result = service.find(id);
        if(result.isPresent()){
            return ResponseEntity.ok(result.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }

}
