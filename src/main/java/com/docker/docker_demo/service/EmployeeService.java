package com.docker.docker_demo.service;

import com.docker.docker_demo.entities.Employee;
import com.docker.docker_demo.repository.EmployeeRepo;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeService {
  private final EmployeeRepo employeeRepo;

  public List<Employee> getAllEmployees(){
    return employeeRepo.findAll();
  }

  public Employee getEmployeeById(Integer id){
    Optional<Employee> optionalEmployee = employeeRepo.findById(id);
    if(optionalEmployee.isPresent()){
      return optionalEmployee.get();
    }
    log.info("Employee with id: {} doesn't exist", id);
    return null;
  }

  public Employee saveEmployee (Employee employee){
    employee.setCreatedAt(LocalDateTime.now());
    employee.setUpdatedAt(LocalDateTime.now());
    Employee savedEmployee = employeeRepo.save(employee);

    log.info("Employee with id: {} saved successfully", employee.getId());
    return savedEmployee;
  }

  public Employee updateEmployee (Employee employee) {
    Optional<Employee> existingEmployee = employeeRepo.findById(employee.getId());
    employee.setCreatedAt(existingEmployee.get().getCreatedAt());
    employee.setUpdatedAt(LocalDateTime.now());

    Employee updatedEmployee = employeeRepo.save(employee);

    log.info("Employee with id: {} updated successfully", employee.getId());
    return updatedEmployee;
  }

  public void deleteEmployeeById (Integer id) {
    employeeRepo.deleteById(id);
  }

}
