public class Dispositius{
    String marca;
    String model;
    float preu;
    float preuF;
    public Dispositius(String marca, String model, float preu) {
        this.marca = marca;
        this.model = model;
        this.preu = preu;
        
    }

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
    public float getPreuF() {
        return preuF;
    }

    public void setPreuF(float preuF) {
        this.preuF = preuF;
    }
    
    
    double prueF(){
        return preu*2;
    }

    @Override
    public String toString() {
        return "dispositius{" + "marca=" + marca + ", model=" + model + ", preu=" + preu + '}';
    }

    

    
}