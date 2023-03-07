package fr.wildcodeschool.students.controllers;

import fr.wildcodeschool.students.models.Student;
import fr.wildcodeschool.students.repositories.BordeauxStudentRepository;
import fr.wildcodeschool.students.repositories.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {

    // @Qualifier("BordeauxStudentRepository")
    // private BordeauxStudentRepository bordeauxStudentRepository = new
    // BordeauxStudentRepository();
    @Autowired
    @Qualifier("toulouseStudentRepository")
    private StudentRepository studentRepository;

    @ResponseBody
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}