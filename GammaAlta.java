class Dispositiu {
    private double preu;

    public Dispositiu(double preu) {
        this.preu = preu;
    }

    public double getPreu() {
        return preu;
    }
}

class Smartphones extends Dispositiu {
    public Smartphones(double preu) {
        super(preu);
    }
}

class Tablet extends Dispositiu {
    public Tablet(double preu) {
        super(preu);
    }
}

class GammaAlta {
    public static boolean isGammaAlta(Dispositiu dispositiu) {
        if (dispositiu instanceof Smartphones) {
            return dispositiu.getPreu() > 700;
        } else if (dispositiu instanceof Tablet) {
            return dispositiu.getPreu() > 900;
        } else {
            return false;
        }
    }
}

