package com.miempresa.gestion_empleados.repository; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miempresa.gestion_empleados.model.Employee;


@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
