public class JuegoController {

    private Campus campus;
    private JuegoView view;

    public JuegoController(Campus campus, JuegoView view) {
        this.campus = campus;
        this.view = view;
    }

    public void iniciar() {

        int opcion;

        do {

            opcion = view.mostrarMenu();

            switch (opcion) {

                case 1:
                    listarPiezas();
                    break;

                case 2:
                    buscarPorId();
                    break;

                case 3:
                    buscarPorNombre();
                    break;

                case 4:
                    ordenarPorEstabilidad();
                    break;

                case 5:
                    ejecutarTurnos();
                    break;

                case 6:
                    view.mostrarMensaje(
                        "Saliendo del juego..."
                    );
                    break;

                default:
                    view.mostrarMensaje(
                        "Opción inválida."
                    );
            }

        } while (opcion != 6);
    }

    private void listarPiezas() {
        view.mostrarPiezas(campus.getPiezas());
    }

    private void buscarPorId() {

        int id = view.solicitarId();

        Pieza pieza = campus.buscarPieza(id);

        view.mostrarPieza(pieza);
    }

    private void buscarPorNombre() {

        String nombre = view.solicitarNombre();

        Pieza pieza = campus.buscarPieza(nombre);

        view.mostrarPieza(pieza);
    }

    private void ordenarPorEstabilidad() {

        campus.ordenarPorEstabilidad();

        view.mostrarMensaje(
            "Piezas ordenadas de menor a mayor estabilidad."
        );

        view.mostrarPiezas(campus.getPiezas());
    }

    private void ejecutarTurnos() {

        view.mostrarMensaje(
            "===== EJECUTANDO TURNOS ====="
        );

        campus.ejecutarTurnos();
    }
}