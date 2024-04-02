package domain.inscripciones;
import domain.alumnos.Alumno;
import domain.materias.Materia;
import java.util.Set;

public class Inscripcion {

    private Set<Materia> materias;
    private Alumno alummno;

    public Inscripcion(Set<Materia> materias, Alumno alummno) {
        this.materias = materias;
        this.alummno = alummno;

    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    public Alumno getAlummno() {
        return alummno;
    }

    public void setAlummno(Alumno alummno) {
        this.alummno = alummno;
    }

    public Boolean aprobada() {
        return materias.stream().allMatch(materia -> alummno.cumpleCorrelativas(materia));
    }

    public void agregarMateriasInscriptas(Set<Materia> nuevasMaterias) {
        materias.addAll(nuevasMaterias);
    }
}
