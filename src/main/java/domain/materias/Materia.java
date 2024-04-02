package domain.materias;
import java.util.HashSet;
import java.util.Set;
public class Materia {

    private String nombreMateria;
    private Integer anioMateria;
    private Set<Materia>  materiasCorrelativas;

    public Materia(String nombreMateria, Integer anioMateria) {
        this.nombreMateria = nombreMateria;
        this.anioMateria = anioMateria;
        this.materiasCorrelativas = new HashSet<>();
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public Set<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setMateriasCorrelativas(Set<Materia> materiasCorrelativas) {
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public void ingresarCorrelativas(Set<Materia> nuevasCorrelativas) {
        this.materiasCorrelativas.addAll(nuevasCorrelativas);
    }

    public void quitarCorrelativas(Set<Materia> antiguasCorrelativas) {
        this.materiasCorrelativas.removeAll(antiguasCorrelativas);
    }

    public Boolean tienePorCorrelativas(Set<Materia> materias) {
        return materiasCorrelativas.containsAll(materias);
    }

}
