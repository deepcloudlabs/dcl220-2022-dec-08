package com.example.hr.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.hr.document.EmployeeDocument;
import com.example.hr.entity.EmployeeEntity;

public interface EmployeeDocumentRepository extends MongoRepository<EmployeeDocument, String>{
	List<EmployeeEntity> findAllByBirthYearBetween(int fromYear,int toYear);
	@Query("{dogum_yili: {$gte: ?, $lte: ?}}")
	List<EmployeeEntity> getir(int fromYear,int toYear);
}
