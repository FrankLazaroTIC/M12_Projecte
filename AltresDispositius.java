public class AltresDispositius extends Dispositius {
    String Nom;
    boolean Smarthpone;
    boolean Tablet;
    String descripcioDispositiu;



    public AltresDispositius(String marca, String model, float preu, String nom, boolean smarthpone, boolean tablet,
        String descripcioDispositiu) {
        super(marca, model, preu);
        Nom = nom;
        Smarthpone = smarthpone;
        Tablet = tablet;
        this.descripcioDispositiu = descripcioDispositiu;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public boolean isSmarthpone() {
        return Smarthpone;
    }

    public void setSmarthpone(boolean smarthpone) {
        Smarthpone = smarthpone;
    }

    public boolean isTablet() {
        return Tablet;
    }

    public void setTablet(boolean tablet) {
        Tablet = tablet;
    }

    public String getDescripcioDispositiu() {
        return descripcioDispositiu;
    }

    public void setDescripcioDispositiu(String descripcioDispositiu) {
        this.descripcioDispositiu = descripcioDispositiu;
    }

    @Override
    public String toString() {
        return "AltresDispositius Nom=" + Nom + ", Smarthpone=" + Smarthpone + ", Tablet=" + Tablet
                + ", descripcioDispositiu=" + descripcioDispositiu + "\n";
    }  

    
}
