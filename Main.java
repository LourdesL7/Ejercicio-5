public class Main {

    public static void main(String[] args) {

        Campus campus = new Campus();

        JuegoView view = new JuegoView();

        JuegoController controller =
                new JuegoController(campus, view);

        controller.iniciar();
    }
}