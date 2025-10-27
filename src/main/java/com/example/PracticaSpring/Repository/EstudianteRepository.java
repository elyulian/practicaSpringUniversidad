package com.example.PracticaSpring.Repository;

import com.example.PracticaSpring.Model.Estudiante;
import com.example.PracticaSpring.Model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {

}
