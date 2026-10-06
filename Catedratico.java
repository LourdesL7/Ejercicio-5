public class Catedratico extends Pieza {

    private int areaEfecto;

    public Catedratico(
            int id,
            String nombre,
            int x,
            int y,
            int puntosEstabilidad,
            int areaEfecto) {

        super(id, nombre, x, y, puntosEstabilidad);

        this.areaEfecto = areaEfecto;
    }

    @Override
    public void ejecutarTurno() {
        System.out.println(
            getNombre()
            + " asignó un proyecto sorpresa en un área de "
            + areaEfecto + " casillas."
        );
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Área de efecto: "
                + areaEfecto;
    }

    public int getAreaEfecto() {
        return areaEfecto;
    }

    public void setAreaEfecto(int areaEfecto) {
        this.areaEfecto = areaEfecto;
    }
}