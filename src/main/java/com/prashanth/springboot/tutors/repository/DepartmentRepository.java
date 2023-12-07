package com.prashanth.springboot.tutors.repository;

import com.prashanth.springboot.tutors.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>
{
    public Department findByDepartmentNameIgnoreCase(String departmentName);

}
