import java.util.ArrayList;
import java.util.Scanner;

public class JuegoView {

    private Scanner scanner;

    public JuegoView() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {

        System.out.println();
        System.out.println("===== SEMANA DE PARCIALES =====");
        System.out.println("1. Listar piezas");
        System.out.println("2. Buscar pieza por ID");
        System.out.println("3. Buscar pieza por nombre");
        System.out.println("4. Ordenar por estabilidad");
        System.out.println("5. Ejecutar turno de las piezas");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");

        return scanner.nextInt();
    }

    public int solicitarId() {
        System.out.print("Ingrese el ID de la pieza: ");
        return scanner.nextInt();
    }

    public String solicitarNombre() {

        scanner.nextLine();

        System.out.print("Ingrese el nombre de la pieza: ");

        return scanner.nextLine();
    }

    public void mostrarPiezas(ArrayList<Pieza> piezas) {

        System.out.println();
        System.out.println("===== PIEZAS DEL CAMPUS =====");

        for (Pieza pieza : piezas) {
            System.out.println(pieza);
        }
    }

    public void mostrarPieza(Pieza pieza) {

        if (pieza == null) {
            System.out.println("No se encontró la pieza.");
        } else {
            System.out.println();
            System.out.println("===== ESTADÍSTICAS =====");
            System.out.println(pieza);
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}