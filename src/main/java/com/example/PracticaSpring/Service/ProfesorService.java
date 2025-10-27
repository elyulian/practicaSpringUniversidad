package com.example.PracticaSpring.Service;

import com.example.PracticaSpring.Model.Profesor;
import com.example.PracticaSpring.Repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {
    //Logica va en el servicio
    @Autowired // se utiliza para hacer una inyeccion
    public ProfesorRepository profesorRepository;

    public Profesor guardar(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    //Metodo para listar
    public List<Profesor> listar() {
        return profesorRepository.findAll();
    }

    public void eliminar(Long id) {
        if (profesorRepository.findById(id).isPresent()) {
            profesorRepository.deleteById(id);
        } else {
            System.out.println("No se encontro el id");
        }
    }

    public void buscarId(Long id) {
        if (profesorRepository.findById(id).isPresent()) {
            profesorRepository.findById(id);
        }else {
            System.out.println("No se encontro el id");
        }
    }


}
