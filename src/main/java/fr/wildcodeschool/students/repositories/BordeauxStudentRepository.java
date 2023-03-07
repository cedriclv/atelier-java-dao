package fr.wildcodeschool.students.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.wildcodeschool.students.models.Student;

@Repository
public class BordeauxStudentRepository implements StudentRepository {

    public List<Student> findAll() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Bernard"));
        students.add(new Student("Hoagie"));
        students.add(new Student("Laverne"));
        return students;
    }
}