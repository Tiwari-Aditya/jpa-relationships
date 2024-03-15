package com.aditya.datajpa.repository;

import com.aditya.datajpa.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
