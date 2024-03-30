package domain;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Boolean aprobada(){
        return materias.stream().allMatch(materia -> materia.puedeCursar(alumno));
    }

    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }
}
