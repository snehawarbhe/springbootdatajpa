package com.csi.repository;

import com.csi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Custom Methods

    List<Employee> findByEmpName(String empName);

    Employee findByEmpEmailIdAndEmpPassword(String empEmailId, String empPassword);


}
