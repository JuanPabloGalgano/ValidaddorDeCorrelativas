package domain;

import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Boolean puedeCursar(Alumno alumno) {
        if(correlativas == null || correlativas.isEmpty()){
            return true;
        }
        return correlativas.stream().allMatch(correlativa -> alumno.tieneAprobada(correlativa));
    }

    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }
}
