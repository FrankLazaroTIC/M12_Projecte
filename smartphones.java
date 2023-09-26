public class smartphones{
    String SO;
    boolean acceleròmetre = false;
    boolean gps = true;

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public boolean isAcceleròmetre() {
        return acceleròmetre;
    }

    public void setAcceleròmetre(boolean acceleròmetre) {
        this.acceleròmetre = acceleròmetre;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "smartphones{" + "SO=" + SO + ", acceler\u00f2metre=" + acceleròmetre + ", gps=" + gps + '}';
    }

    
}