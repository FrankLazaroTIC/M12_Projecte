public class Tablet extends Dispositius {
    private float pulgadas;

    public Tablet(String marca, String modelo, float precio, float pulgadas) {
        this(marca,modelo,precio);
        setPulgadas(pulgadas);
    }

    public float getPulgadas (float pulgadas) {
        return this.pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "TABLET: Modelo " + getPulgadas(this.pulgadas) + "pulgadas.";
    }

    public Tablet(String marca, String modelo, float precio) {
        super(marca,modelo,precio);
    }
}