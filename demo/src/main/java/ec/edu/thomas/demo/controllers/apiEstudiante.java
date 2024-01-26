package ec.edu.thomas.demo.controllers;

import ec.edu.thomas.demo.models.Estudiante;
import ec.edu.thomas.demo.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("rest")
public class apiEstudiante {
    @Autowired
    EstudianteRepository estudianteRepository;

    @GetMapping("/saludar")
    public String saludar() {
        return "Hola";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/all")
    public List<Estudiante> getEstudiantes() {
        return estudianteRepository.findAll();
    }

    @GetMapping("/buscarPorCedula/{cedula}")
    public ResponseEntity<Object> buscarEstudiantePorCedula(@PathVariable String cedula) {
        Optional<Estudiante> estudianteOptional = estudianteRepository.findById(cedula);

        if (estudianteOptional.isPresent()) {
            Estudiante estudianteEncontrado = estudianteOptional.get();
            return new ResponseEntity<>(estudianteEncontrado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Estudiante no encontrado", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/save")
    public Estudiante saveEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteRepository.saveAndFlush(estudiante);
    }

    @PutMapping("/edit/{cedula}")
    public Estudiante editEstudiante(@PathVariable String cedula, @RequestBody Estudiante estudiante) {
        estudiante.setCedula(cedula);
        return estudianteRepository.saveAndFlush(estudiante);
    }

    @DeleteMapping("delete/{cedula}")
    public void DeleteEstudiante(@PathVariable String cedula) {
        estudianteRepository.deleteById(cedula);
    }

    /*
     */
}
