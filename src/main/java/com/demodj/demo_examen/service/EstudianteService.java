package com.demodj.demo_examen.service;

import com.demodj.demo_examen.Models.Estudiante;
import java.util.List;
public interface EstudianteService {
    List<Estudiante> getAllEstudiantes();
    void addEstudiante(Estudiante estudiante);
    Estudiante getEstudianteById(Long id);
    void deleteEstudiante(Long id);
    void updateEstudiante(Estudiante estudiante);

    // Método para asignar un curso a un estudiante

}