package domain;

import domain.alumnos.Alumno;
import domain.inscripciones.Inscripcion;
import domain.materias.Materia;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class InscripcionTest {

    @Test
    public void inscripcionFallidaPdp() {

        Materia logica = new Materia("Logica y esctructuas discretas", 1);
        Materia algortimos = new Materia("Algoritmos y Estructura de Datos", 1);
        Materia pdp = new Materia("Paradimgas de Programacion", 2);

        Set<Materia> correlativasPdp = new HashSet<Materia>();
        correlativasPdp.add(logica);
        correlativasPdp.add(algortimos);
        pdp.ingresarCorrelativas(correlativasPdp);

        Alumno alumnoNoCumple = new Alumno(1523429, "Fernando Juncos" );
        alumnoNoCumple.aprobarMateria(logica);

        Set<Materia> materiasAInscribirse = new HashSet<Materia>();
        materiasAInscribirse.add(pdp);
        Inscripcion inscripcionPdp = new Inscripcion(materiasAInscribirse, alumnoNoCumple);

        Assert.assertFalse(inscripcionPdp.aprobada());

    }

    @Test
    public void inscripcionExitosaPdp() {

        Materia logica = new Materia("Logica y esctructuas discretas", 1);
        Materia algortimos = new Materia("Algoritmos y Estructura de Datos", 1);
        Materia pdp = new Materia("Paradimgas de Programacion", 2);

        Set<Materia> correlativasPdp = new HashSet<Materia>();
        correlativasPdp.add(logica);
        correlativasPdp.add(algortimos);
        pdp.ingresarCorrelativas(correlativasPdp);

        Alumno alumnoCumple = new Alumno(1523429, "Fernando Juncos" );
        Set<Materia> materiasAprobadas = new HashSet<Materia>();
        materiasAprobadas.add(algortimos);
        materiasAprobadas.add(logica);
        alumnoCumple.aprobarMaterias(materiasAprobadas);

        Set<Materia> materiasAInscribirse = new HashSet<Materia>();
        materiasAInscribirse.add(pdp);
        Inscripcion inscripcionPdp = new Inscripcion(materiasAInscribirse, alumnoCumple);

        Assert.assertTrue(inscripcionPdp.aprobada());

    }



}
