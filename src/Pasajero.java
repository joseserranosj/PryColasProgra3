public class Pasajero {
    private String nombre;
    private int numeroAsiento;
    private String categoria;

    public Pasajero(String nombre, int numeroAsiento, String categoria) {
        this.nombre = nombre;
        this.numeroAsiento = numeroAsiento;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Pasajero" +
                "Nombre'" + nombre +
                ", No.Asiento:" + numeroAsiento +
                ", categoria='" + categoria + "\n";
    }

}
