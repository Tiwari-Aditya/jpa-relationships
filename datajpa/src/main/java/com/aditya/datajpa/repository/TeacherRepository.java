package com.aditya.datajpa.repository;

import com.aditya.datajpa.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
