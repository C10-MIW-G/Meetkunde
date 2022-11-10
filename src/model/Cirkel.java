package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Houdt de eigenschappen van een cirkel bij
 */
public class Cirkel extends Figuur {
    private static final String DEFAULT_KLEUR = "grijs";
    private static final int DEFAULT_STRAAL = 1;

    private double straal;
    private Punt middelpunt;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        super(kleur);
        setStraal(straal);
        this.middelpunt = middelpunt;
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), DEFAULT_KLEUR);
    }

    public Cirkel() {
        this(DEFAULT_STRAAL);
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    @Override
    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    @Override
    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public String toString() {
        return String.format("%s\nStraal: %.2f\nMiddelpunt: %s", super.toString(), straal, middelpunt);
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            throw new IllegalArgumentException("De straal moet positief zijn.");
        } else {
            this.straal = straal;
        }
    }


    public Punt getMiddelpunt() {
        return middelpunt;
    }

    @Override
    public boolean pastInOppervlak(double lengte, double breedte) {
        return straal <= (breedte / 2) && straal <= (lengte / 2);
    }
}
