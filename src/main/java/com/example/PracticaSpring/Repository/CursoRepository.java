package com.example.PracticaSpring.Repository;

import com.example.PracticaSpring.Model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Estudiante,Long> {

}
