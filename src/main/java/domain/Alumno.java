package domain;

import java.util.List;

public class Alumno {
    private String nombre;
    private Integer legajo;
    private List<Materia> aprobadas;

    public Boolean tieneAprobada(Materia materia){
        return aprobadas.contains(materia);
    }
    public  Alumno(String nombre, Integer legajo, List<Materia> aprobadas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.aprobadas = aprobadas;
    }
}
