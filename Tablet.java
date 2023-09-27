public class Tablet extends Dispositius {
    private float pulgadas;



    public Tablet(String marca, String model, float preu,float pulgadas) {
        super(marca, model, preu);
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
        return "Esta tablet tiene " + getPulgadas(this.pulgadas) + "pulgadas.\n";
    }
}