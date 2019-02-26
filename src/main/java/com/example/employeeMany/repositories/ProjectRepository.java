package com.example.employeeMany.repositories;

import com.example.employeeMany.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository <Project, Long> {
}
