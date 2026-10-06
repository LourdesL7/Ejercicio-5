public class RecursoObstaculo extends Pieza {

    private int durabilidad;
    private int usosDisponibles;

    public RecursoObstaculo(
            int id,
            String nombre,
            int x,
            int y,
            int puntosEstabilidad,
            int durabilidad,
            int usosDisponibles) {

        super(id, nombre, x, y, puntosEstabilidad);

        this.durabilidad = durabilidad;
        this.usosDisponibles = usosDisponibles;
    }

    @Override
    public void ejecutarTurno() {

        if (usosDisponibles > 0) {
            usosDisponibles--;

            if (durabilidad > 0) {
                durabilidad--;
            }

            System.out.println(
                getNombre()
                + " fue utilizado. Usos restantes: "
                + usosDisponibles
            );

        } else {
            System.out.println(
                getNombre() + " ya no tiene usos disponibles."
            );
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Durabilidad: " + durabilidad
                + " | Usos disponibles: " + usosDisponibles;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public int getUsosDisponibles() {
        return usosDisponibles;
    }

    public void setUsosDisponibles(int usosDisponibles) {
        this.usosDisponibles = usosDisponibles;
    }
}