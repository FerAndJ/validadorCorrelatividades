package domain.alumnos;
import domain.materias.Materia;
import java.util.HashSet;
import java.util.Set;

public class Alumno {

    private Set<Materia> materiasAprobadas;
    private Integer legajo;
    private String nombreYApellido;

    public Alumno(Integer legajo, String nombreYApellido) {
        this.legajo = legajo;
        this.nombreYApellido = nombreYApellido;
        this.materiasAprobadas = new HashSet<Materia>();
    }

    public Set<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }


    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public void aprobarMateria(Materia materia) {
        this.materiasAprobadas.add(materia);
    }
    public void aprobarMaterias(Set<Materia> materiasAprobadas) {
        this.materiasAprobadas.addAll(materiasAprobadas);
    }

    public Boolean cumpleCorrelativas(Materia materiaPedida) {
        return materiasAprobadas.containsAll(materiaPedida.getMateriasCorrelativas());
    }
}
