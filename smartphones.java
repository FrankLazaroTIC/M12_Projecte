public class Smartphones{
    String so;
    boolean acceleròmetre = false;
    boolean gps = true;

    public String getSO() {
        return so;
    }

    public void setSO(String so) {
        this.so = so;
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
        return "smartphones{" + "SO=" + so + ", acceler\u00f2metre=" + acceleròmetre + ", gps=" + gps + '}';
    }

    
}