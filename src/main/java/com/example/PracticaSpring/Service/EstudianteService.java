package com.example.PracticaSpring.Service;

import com.example.PracticaSpring.Repository.EstudianteRepository;
import com.example.PracticaSpring.Repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EstudianteService {
    @Autowired // se utiliza para hacer una inyeccion
    public EstudianteRepository estudianteRepository;


}
