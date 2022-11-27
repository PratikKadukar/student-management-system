package com.github.pk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.pk.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
