package com.raul.block7crudvalidation.repository;

import com.raul.block7crudvalidation.clases.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfesorRepository extends JpaRepository<Profesor,Integer> {
    List<Profesor> findAll();

}
