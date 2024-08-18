package com.docker.docker_demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class Employee {

  @Id
  private Integer id;
  private String name;
  private Integer age;
  private String designation;
  private String phoneNumber;
  private LocalDate dateOfBirth;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

}
