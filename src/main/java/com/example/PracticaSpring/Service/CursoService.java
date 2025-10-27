package com.example.PracticaSpring.Service;

import com.example.PracticaSpring.Repository.CursoRepository;
import com.example.PracticaSpring.Repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CursoService {
    @Autowired // se utiliza para hacer una inyeccion
    public CursoRepository cursoRepository;


}
