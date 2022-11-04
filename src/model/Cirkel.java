package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Houdt de eigenschappen van een cirkel bij
 */
public class Cirkel {

    public static int aantalCirkels = 0;

    public double straal;
    public double middelpuntX;
    public double middelpuntY;
    public String kleur;

    public Cirkel(double straal, double middelpuntX, double middelpuntY, String kleur) {
        aantalCirkels++;
        this.straal = straal;
        this.middelpuntX = middelpuntX;
        this.middelpuntY = middelpuntY;
        this.kleur = kleur;
    }

    public Cirkel(double straal) {
        aantalCirkels++;
        this.straal = straal;
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "Grijs";
    }

    public Cirkel() {
        aantalCirkels++;
        // default constructor
        this.straal = 1;
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "Grijs";
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }
}
