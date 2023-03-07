package fr.wildcodeschool.students.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.wildcodeschool.students.models.Student;

@Repository
public class ToulouseStudentRepository implements StudentRepository {

    public List<Student> findAll() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Toto"));
        students.add(new Student("Titi"));
        students.add(new Student("Tata"));
        return students;
    }

}
