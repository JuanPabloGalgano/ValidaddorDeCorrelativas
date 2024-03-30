package domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    public void inscripcionADSSAprobada(){
        Materia algoritmos = new Materia("Algoritmos", null);
        Materia paradigmas = new Materia("Paradigmas", List.of(algoritmos));
        Materia diseno = new Materia("Diseño", List.of(paradigmas, algoritmos));

        Alumno alumno = new Alumno("Juan Pablo", 2340000, List.of(paradigmas, algoritmos));
        Inscripcion inscripcion = new Inscripcion(alumno, List.of(diseno));

        assertTrue(inscripcion.aprobada());
    }
    @Test
    public void inscripcionADSSDesaprobada(){
        Materia algoritmos = new Materia("Algoritmos", null);
        Materia paradigmas = new Materia("Paradigmas", List.of(algoritmos));
        Materia diseno = new Materia("Diseño", List.of(paradigmas, algoritmos));

        Alumno alumno = new Alumno("Juan Pablo", 2340000, List.of(paradigmas));
        Inscripcion inscripcion = new Inscripcion(alumno, List.of(diseno));

        assertFalse(inscripcion.aprobada());
    }
    @Test
    public void inscripcionADiscreta(){
        Materia discreta = new Materia("discreta", null);

        Alumno alumno = new Alumno("Juan Pablo", 2340000, null);
        Inscripcion inscripcion = new Inscripcion(alumno, List.of(discreta));

        assertTrue(inscripcion.aprobada());
    }
    @Test
    public void inscripcionADSSySO(){
        Materia algoritmos = new Materia("Algoritmos", null);
        Materia paradigmas = new Materia("Paradigmas", List.of(algoritmos));
        Materia diseno = new Materia("Diseño", List.of(paradigmas, algoritmos));
        Materia arquitectura = new Materia("Arquitectura", null);
        Materia operativos = new Materia("Operativos", List.of(arquitectura));

        Alumno alumno = new Alumno("Juan Pablo", 2340000, List.of(paradigmas,arquitectura, algoritmos));
        Inscripcion inscripcion = new Inscripcion(alumno, List.of(diseno, operativos));

        assertTrue(inscripcion.aprobada());
    }
    @Test
    public void inscripcionAmpliaAprobada(){
        Materia algoritmos = new Materia("Algoritmos", null);
        Materia discreta = new Materia("discreta", null);
        Materia paradigmas = new Materia("Paradigmas", List.of(algoritmos));
        Materia diseno = new Materia("Diseño", List.of(paradigmas, algoritmos));
        Materia arquitectura = new Materia("Arquitectura", null);
        Materia operativos = new Materia("Operativos", List.of(arquitectura));
        Materia gestion = new Materia("gestion", List.of(paradigmas, discreta));
        Materia inglesI = new Materia("InglesI", null);

        Alumno alumno = new Alumno("Juan Pablo", 2340000, List.of(paradigmas,arquitectura, algoritmos,discreta));
        Inscripcion inscripcion = new Inscripcion(alumno, List.of(diseno, operativos, gestion));

        assertTrue(inscripcion.aprobada());
    }
    @Test
    public void inscripcionAmpliaDesaprobada(){
        Materia algoritmos = new Materia("Algoritmos", null);
        Materia discreta = new Materia("discreta", null);
        Materia paradigmas = new Materia("Paradigmas", List.of(algoritmos));
        Materia diseno = new Materia("Diseño", List.of(paradigmas, algoritmos));
        Materia arquitectura = new Materia("Arquitectura", null);
        Materia operativos = new Materia("Operativos", List.of(arquitectura));
        Materia gestion = new Materia("gestion", List.of(paradigmas, discreta));
        Materia inglesI = new Materia("InglesI", null);
        Materia AnalisisMatematicoI = new Materia("AnalisiMatematicoI", null);
        Materia AnalisisMatematicoII = new Materia("AnalisiMatematicoII", List.of(AnalisisMatematicoI));

        Alumno alumno = new Alumno("Juan Pablo", 2340000, List.of(paradigmas,arquitectura, algoritmos,discreta));
        Inscripcion inscripcion = new Inscripcion(alumno, List.of(diseno, operativos, gestion, AnalisisMatematicoII));

        assertFalse(inscripcion.aprobada());
    }


}