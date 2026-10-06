public class Estudiante extends Pieza {

    private int energia;
    private int estres;

    public Estudiante(
            int id,
            String nombre,
            int x,
            int y,
            int puntosEstabilidad,
            int energia,
            int estres) {

        super(id, nombre, x, y, puntosEstabilidad);

        this.energia = energia;
        this.estres = estres;
    }

    @Override
    public void ejecutarTurno() {
        energia -= 5;
        estres += 5;

        System.out.println(
            getNombre() + " realizó su turno. "
            + "Energía: " + energia
            + " | Estrés: " + estres
        );
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Energía: " + energia
                + " | Estrés: " + estres;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getEstres() {
        return estres;
    }

    public void setEstres(int estres) {
        this.estres = estres;
    }
}