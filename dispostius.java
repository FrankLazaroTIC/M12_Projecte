public class dispositius{
    String marca;
    String model;
    float preu;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }
    
    @Override
    public String toString() {
        return "dispositius{" + "marca=" + marca + ", model=" + model + ", preu=" + preu + '}';
    }

}