package com.example.hr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.hr.entity.EmployeeEntity;

public interface EmployeeEntityRepository extends JpaRepository<EmployeeEntity, String>{
	List<EmployeeEntity> findAllByBirthYearBetween(int fromYear,int toYear);
	@Query(value = "select emp from Employee emp where emp.birthYear between :fromYear and :toYear")
	List<EmployeeEntity> getir(int fromYear,int toYear);
}
