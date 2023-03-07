package fr.wildcodeschool.students.repositories;

import java.util.List;

import fr.wildcodeschool.students.models.Student;

public interface StudentRepository {

    public List<Student> findAll();

}
