package com.example.PracticaSpring.Controller;

import com.example.PracticaSpring.Model.Profesor;
import com.example.PracticaSpring.Service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //devolucion de archivo json
@RequestMapping("/api")
public class ProfesorController {

    @Autowired
    public ProfesorService profesorService;

    @PostMapping("/guardar")
    public ResponseEntity<Profesor> crear(@RequestBody Profesor profesor){
        profesorService.guardar(profesor);
        return ResponseEntity.created(null).body(profesor);
    }



//    @PostMapping("/guardar")
//    public Profesor guardar(@RequestBody Profesor profesor){
//        return profesorService.guardar(profesor);
//   }

//    @GetMapping("/listar")
//    public List<Profesor> listar(){
//        return profesorService.listar(x);
//    }

    @GetMapping("/listar")
    public ResponseEntity<List<Profesor>> listar(){
        return ResponseEntity.ok(profesorService.listar());
    }

//    @DeleteMapping("/eliminar/{id}")
//    public ResponseEntity<Void> eliminar(@PathVariable Long id){
//        if  (profesorService.buscarId(id)) {
//            profesorService.eliminar(id);
//            return ResponseEntity.noContent().build(); // Estado 204 No Content
//        } else {
//            return ResponseEntity.notFound().build(); // Estado 404 Not Found
//        }
//    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Profesor> buscarId(@PathVariable Long id){
        profesorService.buscarId(id);
        return ResponseEntity.ok().build();
    }

}
