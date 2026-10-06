public abstract class Pieza implements Comparable<Pieza> {

    private int id;
    private String nombre;
    private int x;
    private int y;
    private int puntosEstabilidad;

    public Pieza(int id, String nombre, int x, int y, int puntosEstabilidad) {
        this.id = id;
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.puntosEstabilidad = puntosEstabilidad;
    }

    // Método abstracto para polimorfismo
    public abstract void ejecutarTurno();

    // Comparable por puntos de estabilidad
    @Override
    public int compareTo(Pieza otraPieza) {
        return Integer.compare(
            this.puntosEstabilidad,
            otraPieza.puntosEstabilidad
        );
    }

    @Override
    public String toString() {
        return "ID: " + id
                + " | Nombre: " + nombre
                + " | Posición: (" + x + ", " + y + ")"
                + " | Estabilidad: " + puntosEstabilidad;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Pieza)) {
            return false;
        }

        Pieza otraPieza = (Pieza) obj;

        return this.id == otraPieza.id;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getPuntosEstabilidad() {
        return puntosEstabilidad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPuntosEstabilidad(int puntosEstabilidad) {
        this.puntosEstabilidad = puntosEstabilidad;
    }
}