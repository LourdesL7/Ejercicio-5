import java.util.ArrayList;
import java.util.Collections;

public class Campus {

    private ArrayList<Pieza> piezas;

    public Campus() {
        piezas = new ArrayList<>();
        cargarDatosIniciales();
    }

    public void cargarDatosIniciales() {

        piezas.add(new Estudiante(
                1, "Ana", 2, 3, 80, 70, 20));

        piezas.add(new Estudiante(
                2, "Carlos", 5, 1, 45, 40, 65));

        piezas.add(new Estudiante(
                3, "Sofia", 1, 7, 90, 85, 10));

        piezas.add(new Estudiante(
                4, "Luis", 4, 4, 30, 25, 80));

        piezas.add(new Catedratico(
                5, "Profesor Java", 6, 2, 95, 3));

        piezas.add(new Catedratico(
                6, "Profesor POO", 8, 5, 85, 2));

        piezas.add(new RecursoObstaculo(
                7, "Máquina de café", 3, 3,
                70, 80, 10));

        piezas.add(new RecursoObstaculo(
                8, "Impresora", 7, 1,
                40, 50, 5));

        piezas.add(new RecursoObstaculo(
                9, "Enchufe", 2, 8,
                75, 90, 15));

        piezas.add(new RecursoObstaculo(
                10, "Mesa de estudio", 5, 6,
                60, 100, 20));
    }

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }

    // Overloading: búsqueda por ID
    public Pieza buscarPieza(int id) {

        for (Pieza pieza : piezas) {

            if (pieza.getId() == id) {
                return pieza;
            }
        }

        return null;
    }

    // Overloading: búsqueda por nombre
    public Pieza buscarPieza(String nombre) {

        for (Pieza pieza : piezas) {

            if (pieza.getNombre().equalsIgnoreCase(nombre)) {
                return pieza;
            }
        }

        return null;
    }

    public void ordenarPorEstabilidad() {
        Collections.sort(piezas);
    }

    public void ejecutarTurnos() {

        for (Pieza pieza : piezas) {
            pieza.ejecutarTurno();
        }
    }
}